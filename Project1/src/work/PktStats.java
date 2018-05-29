package work;

public class PktStats {
	public static long pkts_recv;
	public static long pkts_drop;
	public static long getPkts_recv() {
		return pkts_recv;
	}
	public static void setPkts_recv(long pkts_recv) {
		PktStats.pkts_recv = pkts_recv;
	}
	public static long getPkts_drop() {
		return pkts_drop;
	}
	public static void setPkts_drop(long pkts_drop) {
		PktStats.pkts_drop = pkts_drop;
	}
	
	
}
