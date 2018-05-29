package work;

public class SfBase {
    public long total_wire_packets;
    public long total_ipfragmented_packets;
    public long total_ipreassembled_packets;
    public long total_packets; 
    public long total_blocked_packets;
    public long total_injected_packets;  
    public long total_rebuilt_packets;
    public long total_wire_bytes;
    public long total_ipfragmented_bytes;
    public long total_ipreassembled_bytes;
    public long total_bytes;               
    public long total_rebuilt_bytes;
    public long total_blocked_bytes;

    public PktStats pkt_stats;

    public double   usertime_sec;
    public double   systemtime_sec;
    public double   realtime_sec;

    public Time_t time;

    public long iAlerts;
    public long iSyns;      /* SYNS != Connections */
    public long iSynAcks;   /* better estimator  */
    public long iTotalSessions;
    public long iNewSessions;
    public long iDeletedSessions;
    public long iMaxSessions;
    public long iStreamFlushes;  /* # of fake packet is flushed */
    public long iStreamFaults;  /* # of times we run out of memory */
    public long iStreamTimeouts; /* # of timeouts we get in this quanta */
    public long iFragCreates;    /* # of times we call Frag3NewTracker() */
    public long iFragCompletes;  /* # of times we call FragIsComplete() */
    public long iFragInserts;    /* # of fraginserts */
    public long iFragDeletes;    /* # of times we call Frag3RemoveTracker() */
    public long iFragAutoFrees;  /* # of times we auto free a FragTracker */
    public long iFragFlushes;    /* # of times we call Frag3Rebuild() */
    public long iMaxFrags;
    public long iCurrentFrags;
    public long iFragTimeouts;   /* # of times we've reached timeout */
    public long iFragFaults;     /* # of times we've run out of memory */
    public long[][] iPegs = new long[PerfCounts.PERF_COUNT_MAX][2];


    public long iTotalUDPSessions;
    public long iNewUDPSessions;
    public long iDeletedUDPSessions;
    public long iMaxUDPSessions;
    public long iMaxSessionsInterval;
    public long iMidStreamSessions;
    public long iClosedSessions;
    public long iPrunedSessions;
    public long iDroppedAsyncSessions;
    public long iSessionsInitializing;
    public long iSessionsEstablished;
    public long iSessionsClosing;
    public long iAttributeHosts;
    public long iAttributeReloads;
    public long total_mpls_packets;
    public long total_mpls_bytes;
    public long total_blocked_mpls_packets;
    public long total_blocked_mpls_bytes;
    public long total_tcp_filtered_packets;
    public long total_udp_filtered_packets;
    public long frag3_mem_in_use;
    public long stream5_mem_in_use;
    public long total_iAlerts;
    SfporcpidStats sfProcPidStats;
	public long getTotal_wire_packets() {
		return total_wire_packets;
	}
	public void setTotal_wire_packets(long total_wire_packets) {
		this.total_wire_packets = total_wire_packets;
	}
	public long getTotal_ipfragmented_packets() {
		return total_ipfragmented_packets;
	}
	public void setTotal_ipfragmented_packets(long total_ipfragmented_packets) {
		this.total_ipfragmented_packets = total_ipfragmented_packets;
	}
	public long getTotal_ipreassembled_packets() {
		return total_ipreassembled_packets;
	}
	public void setTotal_ipreassembled_packets(long total_ipreassembled_packets) {
		this.total_ipreassembled_packets = total_ipreassembled_packets;
	}
	public long getTotal_packets() {
		return total_packets;
	}
	public void setTotal_packets(long total_packets) {
		this.total_packets = total_packets;
	}
	public long getTotal_blocked_packets() {
		return total_blocked_packets;
	}
	public void setTotal_blocked_packets(long total_blocked_packets) {
		this.total_blocked_packets = total_blocked_packets;
	}
	public long getTotal_injected_packets() {
		return total_injected_packets;
	}
	public void setTotal_injected_packets(long total_injected_packets) {
		this.total_injected_packets = total_injected_packets;
	}
	public long getTotal_rebuilt_packets() {
		return total_rebuilt_packets;
	}
	public void setTotal_rebuilt_packets(long total_rebuilt_packets) {
		this.total_rebuilt_packets = total_rebuilt_packets;
	}
	public long getTotal_wire_bytes() {
		return total_wire_bytes;
	}
	public void setTotal_wire_bytes(long total_wire_bytes) {
		this.total_wire_bytes = total_wire_bytes;
	}
	public long getTotal_ipfragmented_bytes() {
		return total_ipfragmented_bytes;
	}
	public void setTotal_ipfragmented_bytes(long total_ipfragmented_bytes) {
		this.total_ipfragmented_bytes = total_ipfragmented_bytes;
	}
	public long getTotal_ipreassembled_bytes() {
		return total_ipreassembled_bytes;
	}
	public void setTotal_ipreassembled_bytes(long total_ipreassembled_bytes) {
		this.total_ipreassembled_bytes = total_ipreassembled_bytes;
	}
	public long getTotal_bytes() {
		return total_bytes;
	}
	public void setTotal_bytes(long total_bytes) {
		this.total_bytes = total_bytes;
	}
	public long getTotal_rebuilt_bytes() {
		return total_rebuilt_bytes;
	}
	public void setTotal_rebuilt_bytes(long total_rebuilt_bytes) {
		this.total_rebuilt_bytes = total_rebuilt_bytes;
	}
	public long getTotal_blocked_bytes() {
		return total_blocked_bytes;
	}
	public void setTotal_blocked_bytes(long total_blocked_bytes) {
		this.total_blocked_bytes = total_blocked_bytes;
	}
	public PktStats getPkt_stats() {
		return pkt_stats;
	}
	public void setPkt_stats(PktStats pkt_stats) {
		this.pkt_stats = pkt_stats;
	}
	public double getUsertime_sec() {
		return usertime_sec;
	}
	public void setUsertime_sec(double usertime_sec) {
		this.usertime_sec = usertime_sec;
	}
	public double getSystemtime_sec() {
		return systemtime_sec;
	}
	public void setSystemtime_sec(double systemtime_sec) {
		this.systemtime_sec = systemtime_sec;
	}
	public double getRealtime_sec() {
		return realtime_sec;
	}
	public void setRealtime_sec(double realtime_sec) {
		this.realtime_sec = realtime_sec;
	}
	public Time_t getTime() {
		return time;
	}
	public void setTime(Time_t time) {
		this.time = time;
	}
	public long getiAlerts() {
		return iAlerts;
	}
	public void setiAlerts(long iAlerts) {
		this.iAlerts = iAlerts;
	}
	public long getiSyns() {
		return iSyns;
	}
	public void setiSyns(long iSyns) {
		this.iSyns = iSyns;
	}
	public long getiSynAcks() {
		return iSynAcks;
	}
	public void setiSynAcks(long iSynAcks) {
		this.iSynAcks = iSynAcks;
	}
	public long getiTotalSessions() {
		return iTotalSessions;
	}
	public void setiTotalSessions(long iTotalSessions) {
		this.iTotalSessions = iTotalSessions;
	}
	public long getiNewSessions() {
		return iNewSessions;
	}
	public void setiNewSessions(long iNewSessions) {
		this.iNewSessions = iNewSessions;
	}
	public long getiDeletedSessions() {
		return iDeletedSessions;
	}
	public void setiDeletedSessions(long iDeletedSessions) {
		this.iDeletedSessions = iDeletedSessions;
	}
	public long getiMaxSessions() {
		return iMaxSessions;
	}
	public void setiMaxSessions(long iMaxSessions) {
		this.iMaxSessions = iMaxSessions;
	}
	public long getiStreamFlushes() {
		return iStreamFlushes;
	}
	public void setiStreamFlushes(long iStreamFlushes) {
		this.iStreamFlushes = iStreamFlushes;
	}
	public long getiStreamFaults() {
		return iStreamFaults;
	}
	public void setiStreamFaults(long iStreamFaults) {
		this.iStreamFaults = iStreamFaults;
	}
	public long getiStreamTimeouts() {
		return iStreamTimeouts;
	}
	public void setiStreamTimeouts(long iStreamTimeouts) {
		this.iStreamTimeouts = iStreamTimeouts;
	}
	public long getiFragCreates() {
		return iFragCreates;
	}
	public void setiFragCreates(long iFragCreates) {
		this.iFragCreates = iFragCreates;
	}
	public long getiFragCompletes() {
		return iFragCompletes;
	}
	public void setiFragCompletes(long iFragCompletes) {
		this.iFragCompletes = iFragCompletes;
	}
	public long getiFragInserts() {
		return iFragInserts;
	}
	public void setiFragInserts(long iFragInserts) {
		this.iFragInserts = iFragInserts;
	}
	public long getiFragDeletes() {
		return iFragDeletes;
	}
	public void setiFragDeletes(long iFragDeletes) {
		this.iFragDeletes = iFragDeletes;
	}
	public long getiFragAutoFrees() {
		return iFragAutoFrees;
	}
	public void setiFragAutoFrees(long iFragAutoFrees) {
		this.iFragAutoFrees = iFragAutoFrees;
	}
	public long getiFragFlushes() {
		return iFragFlushes;
	}
	public void setiFragFlushes(long iFragFlushes) {
		this.iFragFlushes = iFragFlushes;
	}
	public long getiMaxFrags() {
		return iMaxFrags;
	}
	public void setiMaxFrags(long iMaxFrags) {
		this.iMaxFrags = iMaxFrags;
	}
	public long getiCurrentFrags() {
		return iCurrentFrags;
	}
	public void setiCurrentFrags(long iCurrentFrags) {
		this.iCurrentFrags = iCurrentFrags;
	}
	public long getiFragTimeouts() {
		return iFragTimeouts;
	}
	public void setiFragTimeouts(long iFragTimeouts) {
		this.iFragTimeouts = iFragTimeouts;
	}
	public long getiFragFaults() {
		return iFragFaults;
	}
	public void setiFragFaults(long iFragFaults) {
		this.iFragFaults = iFragFaults;
	}
	public long[][] getiPegs() {
		return iPegs;
	}
	public void setiPegs(long[][] iPegs) {
		this.iPegs = iPegs;
	}
	public long getiTotalUDPSessions() {
		return iTotalUDPSessions;
	}
	public void setiTotalUDPSessions(long iTotalUDPSessions) {
		this.iTotalUDPSessions = iTotalUDPSessions;
	}
	public long getiNewUDPSessions() {
		return iNewUDPSessions;
	}
	public void setiNewUDPSessions(long iNewUDPSessions) {
		this.iNewUDPSessions = iNewUDPSessions;
	}
	public long getiDeletedUDPSessions() {
		return iDeletedUDPSessions;
	}
	public void setiDeletedUDPSessions(long iDeletedUDPSessions) {
		this.iDeletedUDPSessions = iDeletedUDPSessions;
	}
	public long getiMaxUDPSessions() {
		return iMaxUDPSessions;
	}
	public void setiMaxUDPSessions(long iMaxUDPSessions) {
		this.iMaxUDPSessions = iMaxUDPSessions;
	}
	public long getiMaxSessionsInterval() {
		return iMaxSessionsInterval;
	}
	public void setiMaxSessionsInterval(long iMaxSessionsInterval) {
		this.iMaxSessionsInterval = iMaxSessionsInterval;
	}
	public long getiMidStreamSessions() {
		return iMidStreamSessions;
	}
	public void setiMidStreamSessions(long iMidStreamSessions) {
		this.iMidStreamSessions = iMidStreamSessions;
	}
	public long getiClosedSessions() {
		return iClosedSessions;
	}
	public void setiClosedSessions(long iClosedSessions) {
		this.iClosedSessions = iClosedSessions;
	}
	public long getiPrunedSessions() {
		return iPrunedSessions;
	}
	public void setiPrunedSessions(long iPrunedSessions) {
		this.iPrunedSessions = iPrunedSessions;
	}
	public long getiDroppedAsyncSessions() {
		return iDroppedAsyncSessions;
	}
	public void setiDroppedAsyncSessions(long iDroppedAsyncSessions) {
		this.iDroppedAsyncSessions = iDroppedAsyncSessions;
	}
	public long getiSessionsInitializing() {
		return iSessionsInitializing;
	}
	public void setiSessionsInitializing(long iSessionsInitializing) {
		this.iSessionsInitializing = iSessionsInitializing;
	}
	public long getiSessionsEstablished() {
		return iSessionsEstablished;
	}
	public void setiSessionsEstablished(long iSessionsEstablished) {
		this.iSessionsEstablished = iSessionsEstablished;
	}
	public long getiSessionsClosing() {
		return iSessionsClosing;
	}
	public void setiSessionsClosing(long iSessionsClosing) {
		this.iSessionsClosing = iSessionsClosing;
	}
	public long getiAttributeHosts() {
		return iAttributeHosts;
	}
	public void setiAttributeHosts(long iAttributeHosts) {
		this.iAttributeHosts = iAttributeHosts;
	}
	public long getiAttributeReloads() {
		return iAttributeReloads;
	}
	public void setiAttributeReloads(long iAttributeReloads) {
		this.iAttributeReloads = iAttributeReloads;
	}
	public long getTotal_mpls_packets() {
		return total_mpls_packets;
	}
	public void setTotal_mpls_packets(long total_mpls_packets) {
		this.total_mpls_packets = total_mpls_packets;
	}
	public long getTotal_mpls_bytes() {
		return total_mpls_bytes;
	}
	public void setTotal_mpls_bytes(long total_mpls_bytes) {
		this.total_mpls_bytes = total_mpls_bytes;
	}
	public long getTotal_blocked_mpls_packets() {
		return total_blocked_mpls_packets;
	}
	public void setTotal_blocked_mpls_packets(long total_blocked_mpls_packets) {
		this.total_blocked_mpls_packets = total_blocked_mpls_packets;
	}
	public long getTotal_blocked_mpls_bytes() {
		return total_blocked_mpls_bytes;
	}
	public void setTotal_blocked_mpls_bytes(long total_blocked_mpls_bytes) {
		this.total_blocked_mpls_bytes = total_blocked_mpls_bytes;
	}
	public long getTotal_tcp_filtered_packets() {
		return total_tcp_filtered_packets;
	}
	public void setTotal_tcp_filtered_packets(long total_tcp_filtered_packets) {
		this.total_tcp_filtered_packets = total_tcp_filtered_packets;
	}
	public long getTotal_udp_filtered_packets() {
		return total_udp_filtered_packets;
	}
	public void setTotal_udp_filtered_packets(long total_udp_filtered_packets) {
		this.total_udp_filtered_packets = total_udp_filtered_packets;
	}
	public long getFrag3_mem_in_use() {
		return frag3_mem_in_use;
	}
	public void setFrag3_mem_in_use(long frag3_mem_in_use) {
		this.frag3_mem_in_use = frag3_mem_in_use;
	}
	public long getStream5_mem_in_use() {
		return stream5_mem_in_use;
	}
	public void setStream5_mem_in_use(long stream5_mem_in_use) {
		this.stream5_mem_in_use = stream5_mem_in_use;
	}
	public long getTotal_iAlerts() {
		return total_iAlerts;
	}
	public void setTotal_iAlerts(long total_iAlerts) {
		this.total_iAlerts = total_iAlerts;
	}
	public SfporcpidStats getSfProcPidStats() {
		return sfProcPidStats;
	}
	public void setSfProcPidStats(SfporcpidStats sfProcPidStats) {
		this.sfProcPidStats = sfProcPidStats;
	}
    
    
}
