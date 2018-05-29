package work;

public class StreamSegment {
	private char data;
	private char payload;
	
	public StreamSegment prev;
	public StreamSegment next;
	
	private int ordinal;
	
	public Timeval tv;
	public int caplen;
	public int pktlen;
	
	private int ts;
	private int seq;
	
	private short orig_dsize;
	private short size;
	
	private short urg_offset;
	
	private char buffered;
	
	private char pad1;
	private short pad2;
	char[] pkt = new char[1];
	
	public StreamSegment(){
		prev = new StreamSegment();
		next = new StreamSegment();
		tv = new Timeval();
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public char getPayload() {
		return payload;
	}

	public void setPayload(char payload) {
		this.payload = payload;
	}

	public StreamSegment getPrev() {
		return prev;
	}

	public void setPrev(StreamSegment prev) {
		this.prev = prev;
	}

	public StreamSegment getNext() {
		return next;
	}

	public void setNext(StreamSegment next) {
		this.next = next;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public Timeval getTv() {
		return tv;
	}

	public void setTv(Timeval tv) {
		this.tv = tv;
	}

	public int getCaplen() {
		return caplen;
	}

	public void setCaplen(int caplen) {
		this.caplen = caplen;
	}

	public int getPktlen() {
		return pktlen;
	}

	public void setPktlen(int pktlen) {
		this.pktlen = pktlen;
	}

	public int getTs() {
		return ts;
	}

	public void setTs(int ts) {
		this.ts = ts;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public short getOrig_dsize() {
		return orig_dsize;
	}

	public void setOrig_dsize(short orig_dsize) {
		this.orig_dsize = orig_dsize;
	}

	public short getSize() {
		return size;
	}

	public void setSize(short size) {
		this.size = size;
	}

	public short getUrg_offset() {
		return urg_offset;
	}

	public void setUrg_offset(short urg_offset) {
		this.urg_offset = urg_offset;
	}

	public char getBuffered() {
		return buffered;
	}

	public void setBuffered(char buffered) {
		this.buffered = buffered;
	}

	public char getPad1() {
		return pad1;
	}

	public void setPad1(char pad1) {
		this.pad1 = pad1;
	}

	public short getPad2() {
		return pad2;
	}

	public void setPad2(short pad2) {
		this.pad2 = pad2;
	}

	public char[] getPkt() {
		return pkt;
	}

	public void setPkt(char[] pkt) {
		this.pkt = pkt;
	}
	
}
