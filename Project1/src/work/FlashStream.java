package work;

import java.net.DatagramPacket;

public class FlashStream {
	public static int session_mem_in_use;
	public static SessionConfiguration stream_session_config;
	public static PacketCount pc;
	public static SfBase sfBase;
	public static SessionAPI session_api;
	
	public static int flashStream(DatagramPacket p,StreamTracker st,int toSeq,
			char flushbuf,final char flushbuf_end){
		StreamSegment ss = null;
		StreamSegment seglist;
		StreamSegment sr = null;
		short bytes_flushed = 0;
		short bytes_skipped = 0;
		int bytes_queued = st.getSeg_bytes_logical();
		int segs = 0;
		int ret = 0;
		
		if(st.getSeglist() == null||st.getSeglist_tail() == null){
			return -1;
		}
		//PREPROC_PROFILE_START(s5TcpBuildPacketPerfStats);
		
		seglist = st.getSeglist_next();
		
		for(ss = seglist;(ss!=null) && seq_lt(ss.getSeq(),toSeq);ss = ss.next){
			int flushbuf_size = flushbuf_end - flushbuf;
			int bytes_to_copy = getSegmentFlushSize(st,ss,toSeq,flushbuf_size);
			
			System.out.println("Flushing"+bytes_to_copy+"bytes from"+ss.getSeq());
		
			if(ss.getUrg_offset() == 1){
				int non_urgent_bytes = ss.getUrg_offset() < bytes_to_copy ? (bytes_to_copy - ss.getUrg_offset()) : 0;
				
				if(non_urgent_bytes == 1){
					ret = SafeMemcpy(flushbuf,ss.getPayload()+ss.getUrg_offset(),
							non_urgent_bytes,flushbuf,flushbuf_end);
				if(ret == Safemem.SAFEMEM_ERROR){
					System.out.println("ERROR writing flushbuf attempting to,writeflushbuf out of renge!");
					
				}else{
					flushbuf += non_urgent_bytes;
				}
				bytes_skipped += ss.getUrg_offset();
			
				}
			}else{
				ret = SafeMemcpy(flushbuf, ss.getPayload(), bytes_to_copy, flushbuf, flushbuf_end);
				if(ret == Safemem.SAFEMEM_ERROR){
					System.out.println("ERROR writing flushbuf attempting to,writeflushbuf out of renge!");
					
				}else{
					flushbuf += bytes_to_copy;
				}
			
			}
			
			if(st.getPaf_state().getFpt_eoh() == 0 && 
					bytes_to_copy < ss.getSize() && 
					DupStreamNode(null,st,ss,sr) == Stream_Status.STREAM_INSERT_OK){
				
				ss.setSize((short) bytes_to_copy);
				sr.setSeq(sr.getSeq()+bytes_to_copy);
				sr.setSize((short) (sr.getSize()-bytes_to_copy));
				sr.setPayload((char) (sr.getPayload()+bytes_to_copy+(ss.getPayload()-ss.getData())));
			}
			bytes_flushed += bytes_to_copy;
			if(st.paf_state.getFpt_eoh() == 0){
				ss.setBuffered((char) 1);
				st.flush_count++;
				segs++;
			}
			if(flushbuf >= flushbuf_end){
				break;
			}
			if(seq_EQ(ss.getSeq()+bytes_to_copy,toSeq)){
				break;
			}
			
			if( ((ss.next != null && ((ss.getSeq()+ss.getSize()) != ss.next.getSeq())) ||
					(ss.next == null && (ss.getSeq() + ss.getSize() < toSeq )))&&
					(st.flags & 0x0100) != 0){
				if(ss.next != null){
					toSeq = ss.next.getSeq();
					st.seglist_next = ss.next;
				}
				st.flags |= 0x0040;
				break;
			}
		}
		
		st.seglist_base_seq = toSeq;
		
		bytes_queued -= bytes_flushed;
		
		
		return bytes_flushed - bytes_skipped;
		
	}
	private static int DupStreamNode(DatagramPacket p, StreamTracker st, StreamSegment left, StreamSegment retSeg) {
		StreamSegment ss = SegmentAlloc(p,left.getCaplen(),left.getPktlen(),left.getPkt());
		return 0;
	}
	private static StreamSegment SegmentAlloc(DatagramPacket p, int caplen, int pktlen, char[] pkt) {
		StreamSegment ss = null;
		int size = 4;//4×Ö½Ú
		
		if(caplen > 0){
			size += caplen - 1;
		}
		session_mem_in_use += size;
		if(session_mem_in_use > stream_session_config.getMemcap()){
			pc.str_mem_faults++;
			sfBase.iStreamFaults++;
			
			if(p == null){
				session_mem_in_use -= size;
				return null;
			}
		/*	if(session_api.prune_session_cache(tcp_lws_cache, , obj, r)){
				
			}*/
		}
		return null;
	}
	private static int SafeMemcpy(char flushbuf, int i, int non_urgent_bytes, char flushbuf2, char flushbuf_end) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static int getSegmentFlushSize(StreamTracker st, StreamSegment ss, int to_seq, int flushBufSize) {
		int flushSize = ss.getSize();
		if(flushSize > flushBufSize){
			flushSize = flushBufSize;
		}
		if(s5_paf_active(st.getPaf_state()) && seq_lt(ss.getSeq() + flushSize,to_seq)){
			flushSize = to_seq - ss.getSeq();
		}
		return flushSize;
	}
	private static boolean s5_paf_active(PAF_State ps){
		return ps.paf != PAF_Status.PAF_ABORT;
	}
	private static boolean seq_EQ(int a,int b){
		return (a-b) == 0;
	}
	private static boolean seq_lt(int a,int b){
		return (a-b) < 0 ? true:false;
	}
}
