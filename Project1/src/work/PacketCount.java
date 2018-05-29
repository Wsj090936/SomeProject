package work;

public class PacketCount {
	public long total_from_daq;
    public long total_processed;

    public long s5tcp1;
    public long s5tcp2;
    public long ipv6opts;
    public long eth;
    public long ethdisc;
    public long ipv6disc;
    public long ip6ext;
    public long other;
    public long tcp;
    public long udp;
    public long icmp;
    public long arp;

    public long eapol;

    public long vlan;
    public long nested_vlan;
    public long ipv6;
    public long ipv6_up;
    public long ipv6_upfail;
    public long frag6;
    public long icmp6;
    public long tdisc;
    public long udisc;
    public long tcp6;
    public long udp6;
    public long teredo;
    public long ipdisc;
    public long icmpdisc;
    public long embdip;
    public long ip;
    public long ipx;
    public long ethloopback;

    public long invalid_checksums;
    public long bad_ttl;

    public long ip4ip4;
    public long ip4ip6;
    public long ip6ip4;
    public long ip6ip6;

    public long gre;
    public long gre_ip;
    public long gre_eth;
    public long gre_arp;
    public long gre_ipv6;
    public long gre_ipv6ext;
    public long gre_ipx;
    public long gre_loopback;
    public long gre_vlan;
    public long gre_ppp;

    public long discards;
    public long alert_pkts;
    public long total_alert_pkts;
    public long log_pkts;
    public long pass_pkts;

    public long match_limit;
    public long queue_limit;
    public long log_limit;
    public long event_limit;
    public long alert_limit;

    public long frags;           /* number of frags that have come in */
    public long frag_trackers;   /* number of tracking structures generated */
    public long rebuilt_frags;   /* number of packets rebuilt */
    public long frag_incomp;     /* number of frags cleared due to memory issues */
    public long frag_timeout;    /* number of frags cleared due to timeout */
    public long rebuild_element; /* frags that were element of rebuilt pkt */
    public long frag_mem_faults; /* number of times the memory cap was hit */

    public long tcp_stream_pkts; /* number of packets tcp reassembly touches */
    public long rebuilt_tcp;     /* number of phoney tcp packets generated */
    public long tcp_streams;     /* number of tcp streams created */
    public long rebuilt_segs;    /* number of tcp segments used in rebuilt pkts */
    public long queued_segs;     /* number of tcp segments stored for rebuilt pkts */
    public long str_mem_faults;  /* number of times the stream memory cap was hit */

    public long attribute_table_reloads; /* number of times attribute table was reloaded. */

    public long wifi_mgmt;
    public long wifi_data;
    public long wifi_control;
    public long assoc_req;
    public long assoc_resp;
    public long reassoc_req;
    public long reassoc_resp;
    public long probe_req;
    public long probe_resp;
    public long beacon;
    public long atim;
    public long dissassoc;
    public long auth;
    public long deauth;
    public long ps_poll;
    public long rts;
    public long cts;
    public long ack;
    public long cf_end;
    public long cf_end_cf_ack;
    public long data;
    public long data_cf_ack;
    public long data_cf_poll;
    public long data_cf_ack_cf_poll;
    public long cf_ack;
    public long cf_poll;
    public long cf_ack_cf_poll;


    public long internal_blacklist;
    public long internal_whitelist;

    public long syn_rate_limit_events;
    public long syn_rate_limit_drops;
	public long getTotal_from_daq() {
		return total_from_daq;
	}
	public void setTotal_from_daq(long total_from_daq) {
		this.total_from_daq = total_from_daq;
	}
	public long getTotal_processed() {
		return total_processed;
	}
	public void setTotal_processed(long total_processed) {
		this.total_processed = total_processed;
	}
	public long getS5tcp1() {
		return s5tcp1;
	}
	public void setS5tcp1(long s5tcp1) {
		this.s5tcp1 = s5tcp1;
	}
	public long getS5tcp2() {
		return s5tcp2;
	}
	public void setS5tcp2(long s5tcp2) {
		this.s5tcp2 = s5tcp2;
	}
	public long getIpv6opts() {
		return ipv6opts;
	}
	public void setIpv6opts(long ipv6opts) {
		this.ipv6opts = ipv6opts;
	}
	public long getEth() {
		return eth;
	}
	public void setEth(long eth) {
		this.eth = eth;
	}
	public long getEthdisc() {
		return ethdisc;
	}
	public void setEthdisc(long ethdisc) {
		this.ethdisc = ethdisc;
	}
	public long getIpv6disc() {
		return ipv6disc;
	}
	public void setIpv6disc(long ipv6disc) {
		this.ipv6disc = ipv6disc;
	}
	public long getIp6ext() {
		return ip6ext;
	}
	public void setIp6ext(long ip6ext) {
		this.ip6ext = ip6ext;
	}
	public long getOther() {
		return other;
	}
	public void setOther(long other) {
		this.other = other;
	}
	public long getTcp() {
		return tcp;
	}
	public void setTcp(long tcp) {
		this.tcp = tcp;
	}
	public long getUdp() {
		return udp;
	}
	public void setUdp(long udp) {
		this.udp = udp;
	}
	public long getIcmp() {
		return icmp;
	}
	public void setIcmp(long icmp) {
		this.icmp = icmp;
	}
	public long getArp() {
		return arp;
	}
	public void setArp(long arp) {
		this.arp = arp;
	}
	public long getEapol() {
		return eapol;
	}
	public void setEapol(long eapol) {
		this.eapol = eapol;
	}
	public long getVlan() {
		return vlan;
	}
	public void setVlan(long vlan) {
		this.vlan = vlan;
	}
	public long getNested_vlan() {
		return nested_vlan;
	}
	public void setNested_vlan(long nested_vlan) {
		this.nested_vlan = nested_vlan;
	}
	public long getIpv6() {
		return ipv6;
	}
	public void setIpv6(long ipv6) {
		this.ipv6 = ipv6;
	}
	public long getIpv6_up() {
		return ipv6_up;
	}
	public void setIpv6_up(long ipv6_up) {
		this.ipv6_up = ipv6_up;
	}
	public long getIpv6_upfail() {
		return ipv6_upfail;
	}
	public void setIpv6_upfail(long ipv6_upfail) {
		this.ipv6_upfail = ipv6_upfail;
	}
	public long getFrag6() {
		return frag6;
	}
	public void setFrag6(long frag6) {
		this.frag6 = frag6;
	}
	public long getIcmp6() {
		return icmp6;
	}
	public void setIcmp6(long icmp6) {
		this.icmp6 = icmp6;
	}
	public long getTdisc() {
		return tdisc;
	}
	public void setTdisc(long tdisc) {
		this.tdisc = tdisc;
	}
	public long getUdisc() {
		return udisc;
	}
	public void setUdisc(long udisc) {
		this.udisc = udisc;
	}
	public long getTcp6() {
		return tcp6;
	}
	public void setTcp6(long tcp6) {
		this.tcp6 = tcp6;
	}
	public long getUdp6() {
		return udp6;
	}
	public void setUdp6(long udp6) {
		this.udp6 = udp6;
	}
	public long getTeredo() {
		return teredo;
	}
	public void setTeredo(long teredo) {
		this.teredo = teredo;
	}
	public long getIpdisc() {
		return ipdisc;
	}
	public void setIpdisc(long ipdisc) {
		this.ipdisc = ipdisc;
	}
	public long getIcmpdisc() {
		return icmpdisc;
	}
	public void setIcmpdisc(long icmpdisc) {
		this.icmpdisc = icmpdisc;
	}
	public long getEmbdip() {
		return embdip;
	}
	public void setEmbdip(long embdip) {
		this.embdip = embdip;
	}
	public long getIp() {
		return ip;
	}
	public void setIp(long ip) {
		this.ip = ip;
	}
	public long getIpx() {
		return ipx;
	}
	public void setIpx(long ipx) {
		this.ipx = ipx;
	}
	public long getEthloopback() {
		return ethloopback;
	}
	public void setEthloopback(long ethloopback) {
		this.ethloopback = ethloopback;
	}
	public long getInvalid_checksums() {
		return invalid_checksums;
	}
	public void setInvalid_checksums(long invalid_checksums) {
		this.invalid_checksums = invalid_checksums;
	}
	public long getBad_ttl() {
		return bad_ttl;
	}
	public void setBad_ttl(long bad_ttl) {
		this.bad_ttl = bad_ttl;
	}
	public long getIp4ip4() {
		return ip4ip4;
	}
	public void setIp4ip4(long ip4ip4) {
		this.ip4ip4 = ip4ip4;
	}
	public long getIp4ip6() {
		return ip4ip6;
	}
	public void setIp4ip6(long ip4ip6) {
		this.ip4ip6 = ip4ip6;
	}
	public long getIp6ip4() {
		return ip6ip4;
	}
	public void setIp6ip4(long ip6ip4) {
		this.ip6ip4 = ip6ip4;
	}
	public long getIp6ip6() {
		return ip6ip6;
	}
	public void setIp6ip6(long ip6ip6) {
		this.ip6ip6 = ip6ip6;
	}
	public long getGre() {
		return gre;
	}
	public void setGre(long gre) {
		this.gre = gre;
	}
	public long getGre_ip() {
		return gre_ip;
	}
	public void setGre_ip(long gre_ip) {
		this.gre_ip = gre_ip;
	}
	public long getGre_eth() {
		return gre_eth;
	}
	public void setGre_eth(long gre_eth) {
		this.gre_eth = gre_eth;
	}
	public long getGre_arp() {
		return gre_arp;
	}
	public void setGre_arp(long gre_arp) {
		this.gre_arp = gre_arp;
	}
	public long getGre_ipv6() {
		return gre_ipv6;
	}
	public void setGre_ipv6(long gre_ipv6) {
		this.gre_ipv6 = gre_ipv6;
	}
	public long getGre_ipv6ext() {
		return gre_ipv6ext;
	}
	public void setGre_ipv6ext(long gre_ipv6ext) {
		this.gre_ipv6ext = gre_ipv6ext;
	}
	public long getGre_ipx() {
		return gre_ipx;
	}
	public void setGre_ipx(long gre_ipx) {
		this.gre_ipx = gre_ipx;
	}
	public long getGre_loopback() {
		return gre_loopback;
	}
	public void setGre_loopback(long gre_loopback) {
		this.gre_loopback = gre_loopback;
	}
	public long getGre_vlan() {
		return gre_vlan;
	}
	public void setGre_vlan(long gre_vlan) {
		this.gre_vlan = gre_vlan;
	}
	public long getGre_ppp() {
		return gre_ppp;
	}
	public void setGre_ppp(long gre_ppp) {
		this.gre_ppp = gre_ppp;
	}
	public long getDiscards() {
		return discards;
	}
	public void setDiscards(long discards) {
		this.discards = discards;
	}
	public long getAlert_pkts() {
		return alert_pkts;
	}
	public void setAlert_pkts(long alert_pkts) {
		this.alert_pkts = alert_pkts;
	}
	public long getTotal_alert_pkts() {
		return total_alert_pkts;
	}
	public void setTotal_alert_pkts(long total_alert_pkts) {
		this.total_alert_pkts = total_alert_pkts;
	}
	public long getLog_pkts() {
		return log_pkts;
	}
	public void setLog_pkts(long log_pkts) {
		this.log_pkts = log_pkts;
	}
	public long getPass_pkts() {
		return pass_pkts;
	}
	public void setPass_pkts(long pass_pkts) {
		this.pass_pkts = pass_pkts;
	}
	public long getMatch_limit() {
		return match_limit;
	}
	public void setMatch_limit(long match_limit) {
		this.match_limit = match_limit;
	}
	public long getQueue_limit() {
		return queue_limit;
	}
	public void setQueue_limit(long queue_limit) {
		this.queue_limit = queue_limit;
	}
	public long getLog_limit() {
		return log_limit;
	}
	public void setLog_limit(long log_limit) {
		this.log_limit = log_limit;
	}
	public long getEvent_limit() {
		return event_limit;
	}
	public void setEvent_limit(long event_limit) {
		this.event_limit = event_limit;
	}
	public long getAlert_limit() {
		return alert_limit;
	}
	public void setAlert_limit(long alert_limit) {
		this.alert_limit = alert_limit;
	}
	public long getFrags() {
		return frags;
	}
	public void setFrags(long frags) {
		this.frags = frags;
	}
	public long getFrag_trackers() {
		return frag_trackers;
	}
	public void setFrag_trackers(long frag_trackers) {
		this.frag_trackers = frag_trackers;
	}
	public long getRebuilt_frags() {
		return rebuilt_frags;
	}
	public void setRebuilt_frags(long rebuilt_frags) {
		this.rebuilt_frags = rebuilt_frags;
	}
	public long getFrag_incomp() {
		return frag_incomp;
	}
	public void setFrag_incomp(long frag_incomp) {
		this.frag_incomp = frag_incomp;
	}
	public long getFrag_timeout() {
		return frag_timeout;
	}
	public void setFrag_timeout(long frag_timeout) {
		this.frag_timeout = frag_timeout;
	}
	public long getRebuild_element() {
		return rebuild_element;
	}
	public void setRebuild_element(long rebuild_element) {
		this.rebuild_element = rebuild_element;
	}
	public long getFrag_mem_faults() {
		return frag_mem_faults;
	}
	public void setFrag_mem_faults(long frag_mem_faults) {
		this.frag_mem_faults = frag_mem_faults;
	}
	public long getTcp_stream_pkts() {
		return tcp_stream_pkts;
	}
	public void setTcp_stream_pkts(long tcp_stream_pkts) {
		this.tcp_stream_pkts = tcp_stream_pkts;
	}
	public long getRebuilt_tcp() {
		return rebuilt_tcp;
	}
	public void setRebuilt_tcp(long rebuilt_tcp) {
		this.rebuilt_tcp = rebuilt_tcp;
	}
	public long getTcp_streams() {
		return tcp_streams;
	}
	public void setTcp_streams(long tcp_streams) {
		this.tcp_streams = tcp_streams;
	}
	public long getRebuilt_segs() {
		return rebuilt_segs;
	}
	public void setRebuilt_segs(long rebuilt_segs) {
		this.rebuilt_segs = rebuilt_segs;
	}
	public long getQueued_segs() {
		return queued_segs;
	}
	public void setQueued_segs(long queued_segs) {
		this.queued_segs = queued_segs;
	}
	public long getStr_mem_faults() {
		return str_mem_faults;
	}
	public void setStr_mem_faults(long str_mem_faults) {
		this.str_mem_faults = str_mem_faults;
	}
	public long getAttribute_table_reloads() {
		return attribute_table_reloads;
	}
	public void setAttribute_table_reloads(long attribute_table_reloads) {
		this.attribute_table_reloads = attribute_table_reloads;
	}
	public long getWifi_mgmt() {
		return wifi_mgmt;
	}
	public void setWifi_mgmt(long wifi_mgmt) {
		this.wifi_mgmt = wifi_mgmt;
	}
	public long getWifi_data() {
		return wifi_data;
	}
	public void setWifi_data(long wifi_data) {
		this.wifi_data = wifi_data;
	}
	public long getWifi_control() {
		return wifi_control;
	}
	public void setWifi_control(long wifi_control) {
		this.wifi_control = wifi_control;
	}
	public long getAssoc_req() {
		return assoc_req;
	}
	public void setAssoc_req(long assoc_req) {
		this.assoc_req = assoc_req;
	}
	public long getAssoc_resp() {
		return assoc_resp;
	}
	public void setAssoc_resp(long assoc_resp) {
		this.assoc_resp = assoc_resp;
	}
	public long getReassoc_req() {
		return reassoc_req;
	}
	public void setReassoc_req(long reassoc_req) {
		this.reassoc_req = reassoc_req;
	}
	public long getReassoc_resp() {
		return reassoc_resp;
	}
	public void setReassoc_resp(long reassoc_resp) {
		this.reassoc_resp = reassoc_resp;
	}
	public long getProbe_req() {
		return probe_req;
	}
	public void setProbe_req(long probe_req) {
		this.probe_req = probe_req;
	}
	public long getProbe_resp() {
		return probe_resp;
	}
	public void setProbe_resp(long probe_resp) {
		this.probe_resp = probe_resp;
	}
	public long getBeacon() {
		return beacon;
	}
	public void setBeacon(long beacon) {
		this.beacon = beacon;
	}
	public long getAtim() {
		return atim;
	}
	public void setAtim(long atim) {
		this.atim = atim;
	}
	public long getDissassoc() {
		return dissassoc;
	}
	public void setDissassoc(long dissassoc) {
		this.dissassoc = dissassoc;
	}
	public long getAuth() {
		return auth;
	}
	public void setAuth(long auth) {
		this.auth = auth;
	}
	public long getDeauth() {
		return deauth;
	}
	public void setDeauth(long deauth) {
		this.deauth = deauth;
	}
	public long getPs_poll() {
		return ps_poll;
	}
	public void setPs_poll(long ps_poll) {
		this.ps_poll = ps_poll;
	}
	public long getRts() {
		return rts;
	}
	public void setRts(long rts) {
		this.rts = rts;
	}
	public long getCts() {
		return cts;
	}
	public void setCts(long cts) {
		this.cts = cts;
	}
	public long getAck() {
		return ack;
	}
	public void setAck(long ack) {
		this.ack = ack;
	}
	public long getCf_end() {
		return cf_end;
	}
	public void setCf_end(long cf_end) {
		this.cf_end = cf_end;
	}
	public long getCf_end_cf_ack() {
		return cf_end_cf_ack;
	}
	public void setCf_end_cf_ack(long cf_end_cf_ack) {
		this.cf_end_cf_ack = cf_end_cf_ack;
	}
	public long getData() {
		return data;
	}
	public void setData(long data) {
		this.data = data;
	}
	public long getData_cf_ack() {
		return data_cf_ack;
	}
	public void setData_cf_ack(long data_cf_ack) {
		this.data_cf_ack = data_cf_ack;
	}
	public long getData_cf_poll() {
		return data_cf_poll;
	}
	public void setData_cf_poll(long data_cf_poll) {
		this.data_cf_poll = data_cf_poll;
	}
	public long getData_cf_ack_cf_poll() {
		return data_cf_ack_cf_poll;
	}
	public void setData_cf_ack_cf_poll(long data_cf_ack_cf_poll) {
		this.data_cf_ack_cf_poll = data_cf_ack_cf_poll;
	}
	public long getCf_ack() {
		return cf_ack;
	}
	public void setCf_ack(long cf_ack) {
		this.cf_ack = cf_ack;
	}
	public long getCf_poll() {
		return cf_poll;
	}
	public void setCf_poll(long cf_poll) {
		this.cf_poll = cf_poll;
	}
	public long getCf_ack_cf_poll() {
		return cf_ack_cf_poll;
	}
	public void setCf_ack_cf_poll(long cf_ack_cf_poll) {
		this.cf_ack_cf_poll = cf_ack_cf_poll;
	}
	public long getInternal_blacklist() {
		return internal_blacklist;
	}
	public void setInternal_blacklist(long internal_blacklist) {
		this.internal_blacklist = internal_blacklist;
	}
	public long getInternal_whitelist() {
		return internal_whitelist;
	}
	public void setInternal_whitelist(long internal_whitelist) {
		this.internal_whitelist = internal_whitelist;
	}
	public long getSyn_rate_limit_events() {
		return syn_rate_limit_events;
	}
	public void setSyn_rate_limit_events(long syn_rate_limit_events) {
		this.syn_rate_limit_events = syn_rate_limit_events;
	}
	public long getSyn_rate_limit_drops() {
		return syn_rate_limit_drops;
	}
	public void setSyn_rate_limit_drops(long syn_rate_limit_drops) {
		this.syn_rate_limit_drops = syn_rate_limit_drops;
	}
    
    
}
