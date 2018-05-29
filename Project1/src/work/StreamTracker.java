package work;

public class StreamTracker {
	public StateMgr s_mgr;
	public FlushMgr flush_mgr;
	public PAF_State paf_state;
	public StreamAlertInfo tcp_policy;
	public StreamTcpPolicy seglist;
	public StreamSegment seglist_tail;
	public StreamSegment seglist_next;
//Java÷–√ª”–unsigned
	public int segment_ordinal;

	public int l_unackd;
	public int l_window;
	public int r_nxt_ack;
	public int r_win_base;

	public int isn;
	public int ts_last;
	public int ts_last_pkt;

	public int seglist_base_seq;
	public int seg_count;
	public int seg_bytes_total;
	public int seg_bytes_logical;
	public int total_bytes_queued;
	public int total_segs_queued;
	public int overlap_count;
	public int small_seg_count;
	public int flush_count;
	public int xtradata_mask;
	
	public short os_policy;
	public short reassembly_policy;
 
	public short wscale;
	public short mss;
	public short flags;

	public char[] mac_addr = new char[6];
	public char alert_count;
	
	public StreamTracker(){
		 s_mgr = new StateMgr();             
		 flush_mgr = new FlushMgr();         
		 paf_state = new  PAF_State();        
		 tcp_policy = new StreamAlertInfo(); 
		 seglist = new StreamTcpPolicy();    
		 seglist_tail = new StreamSegment(); 
		 seglist_next = new StreamSegment(); 

	}
	public StateMgr getS_mgr() {
		return s_mgr;
	}
	public void setS_mgr(StateMgr s_mgr) {
		this.s_mgr = s_mgr;
	}
	public FlushMgr getFlush_mgr() {
		return flush_mgr;
	}
	public void setFlush_mgr(FlushMgr flush_mgr) {
		this.flush_mgr = flush_mgr;
	}
	public PAF_State getPaf_state() {
		return paf_state;
	}
	public void setPaf_state(PAF_State paf_state) {
		this.paf_state = paf_state;
	}
	public StreamAlertInfo getTcp_policy() {
		return tcp_policy;
	}
	public void setTcp_policy(StreamAlertInfo tcp_policy) {
		this.tcp_policy = tcp_policy;
	}
	public StreamTcpPolicy getSeglist() {
		return seglist;
	}
	public void setSeglist(StreamTcpPolicy seglist) {
		this.seglist = seglist;
	}
	public StreamSegment getSeglist_tail() {
		return seglist_tail;
	}
	public void setSeglist_tail(StreamSegment seglist_tail) {
		this.seglist_tail = seglist_tail;
	}
	public StreamSegment getSeglist_next() {
		return seglist_next;
	}
	public void setSeglist_next(StreamSegment seglist_next) {
		this.seglist_next = seglist_next;
	}
	public int getSegment_ordinal() {
		return segment_ordinal;
	}
	public void setSegment_ordinal(int segment_ordinal) {
		this.segment_ordinal = segment_ordinal;
	}
	public int getL_unackd() {
		return l_unackd;
	}
	public void setL_unackd(int l_unackd) {
		this.l_unackd = l_unackd;
	}
	public int getL_window() {
		return l_window;
	}
	public void setL_window(int l_window) {
		this.l_window = l_window;
	}
	public int getR_nxt_ack() {
		return r_nxt_ack;
	}
	public void setR_nxt_ack(int r_nxt_ack) {
		this.r_nxt_ack = r_nxt_ack;
	}
	public int getR_win_base() {
		return r_win_base;
	}
	public void setR_win_base(int r_win_base) {
		this.r_win_base = r_win_base;
	}
	public int getIsn() {
		return isn;
	}
	public void setIsn(int isn) {
		this.isn = isn;
	}
	public int getTs_last() {
		return ts_last;
	}
	public void setTs_last(int ts_last) {
		this.ts_last = ts_last;
	}
	public int getTs_last_pkt() {
		return ts_last_pkt;
	}
	public void setTs_last_pkt(int ts_last_pkt) {
		this.ts_last_pkt = ts_last_pkt;
	}
	public int getSeglist_base_seq() {
		return seglist_base_seq;
	}
	public void setSeglist_base_seq(int seglist_base_seq) {
		this.seglist_base_seq = seglist_base_seq;
	}
	public int getSeg_count() {
		return seg_count;
	}
	public void setSeg_count(int seg_count) {
		this.seg_count = seg_count;
	}
	public int getSeg_bytes_total() {
		return seg_bytes_total;
	}
	public void setSeg_bytes_total(int seg_bytes_total) {
		this.seg_bytes_total = seg_bytes_total;
	}
	public int getSeg_bytes_logical() {
		return seg_bytes_logical;
	}
	public void setSeg_bytes_logical(int seg_bytes_logical) {
		this.seg_bytes_logical = seg_bytes_logical;
	}
	public int getTotal_bytes_queued() {
		return total_bytes_queued;
	}
	public void setTotal_bytes_queued(int total_bytes_queued) {
		this.total_bytes_queued = total_bytes_queued;
	}
	public int getTotal_segs_queued() {
		return total_segs_queued;
	}
	public void setTotal_segs_queued(int total_segs_queued) {
		this.total_segs_queued = total_segs_queued;
	}
	public int getOverlap_count() {
		return overlap_count;
	}
	public void setOverlap_count(int overlap_count) {
		this.overlap_count = overlap_count;
	}
	public int getSmall_seg_count() {
		return small_seg_count;
	}
	public void setSmall_seg_count(int small_seg_count) {
		this.small_seg_count = small_seg_count;
	}
	public int getFlush_count() {
		return flush_count;
	}
	public void setFlush_count(int flush_count) {
		this.flush_count = flush_count;
	}
	public int getXtradata_mask() {
		return xtradata_mask;
	}
	public void setXtradata_mask(int xtradata_mask) {
		this.xtradata_mask = xtradata_mask;
	}
	public short getOs_policy() {
		return os_policy;
	}
	public void setOs_policy(short os_policy) {
		this.os_policy = os_policy;
	}
	public short getReassembly_policy() {
		return reassembly_policy;
	}
	public void setReassembly_policy(short reassembly_policy) {
		this.reassembly_policy = reassembly_policy;
	}
	public short getWscale() {
		return wscale;
	}
	public void setWscale(short wscale) {
		this.wscale = wscale;
	}
	public short getMss() {
		return mss;
	}
	public void setMss(short mss) {
		this.mss = mss;
	}
	public short getFlags() {
		return flags;
	}
	public void setFlags(short flags) {
		this.flags = flags;
	}
	public char[] getMac_addr() {
		return mac_addr;
	}
	public void setMac_addr(char[] mac_addr) {
		this.mac_addr = mac_addr;
	}
	public char getAlert_count() {
		return alert_count;
	}
	public void setAlert_count(char alert_count) {
		this.alert_count = alert_count;
	}
	
}
