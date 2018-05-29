package work;

public class SessionConfiguration {
   public char disabled;
   public char track_tcp_sessions;
   public char track_udp_sessions;
   public char track_icmp_sessions;
   public char track_ip_sessions;
   public char enable_ha;

   public int max_sessions;
   public int max_tcp_sessions;
   public int max_udp_sessions;
   public int max_icmp_sessions;
   public int max_ip_sessions;
   public short tcp_cache_pruning_timeout;
   public short tcp_cache_nominal_timeout;
   public short udp_cache_pruning_timeout;
   public short udp_cache_nominal_timeout;
   
   public int memcap;
   public int prune_log_max;
   public int flags;
   public int min_response_seconds;
   public char max_active_responses;
   
   public SessionHAConfig ha_config;
   public int numSnortPolicies;
   public int policy_ref_count;
   
   public NoRefCallback no_ref_cb;
   //void *no_ref_cb_data;

public char getDisabled() {
	return disabled;
}

public void setDisabled(char disabled) {
	this.disabled = disabled;
}

public char getTrack_tcp_sessions() {
	return track_tcp_sessions;
}

public void setTrack_tcp_sessions(char track_tcp_sessions) {
	this.track_tcp_sessions = track_tcp_sessions;
}

public char getTrack_udp_sessions() {
	return track_udp_sessions;
}

public void setTrack_udp_sessions(char track_udp_sessions) {
	this.track_udp_sessions = track_udp_sessions;
}

public char getTrack_icmp_sessions() {
	return track_icmp_sessions;
}

public void setTrack_icmp_sessions(char track_icmp_sessions) {
	this.track_icmp_sessions = track_icmp_sessions;
}

public char getTrack_ip_sessions() {
	return track_ip_sessions;
}

public void setTrack_ip_sessions(char track_ip_sessions) {
	this.track_ip_sessions = track_ip_sessions;
}

public char getEnable_ha() {
	return enable_ha;
}

public void setEnable_ha(char enable_ha) {
	this.enable_ha = enable_ha;
}

public int getMax_sessions() {
	return max_sessions;
}

public void setMax_sessions(int max_sessions) {
	this.max_sessions = max_sessions;
}

public int getMax_tcp_sessions() {
	return max_tcp_sessions;
}

public void setMax_tcp_sessions(int max_tcp_sessions) {
	this.max_tcp_sessions = max_tcp_sessions;
}

public int getMax_udp_sessions() {
	return max_udp_sessions;
}

public void setMax_udp_sessions(int max_udp_sessions) {
	this.max_udp_sessions = max_udp_sessions;
}

public int getMax_icmp_sessions() {
	return max_icmp_sessions;
}

public void setMax_icmp_sessions(int max_icmp_sessions) {
	this.max_icmp_sessions = max_icmp_sessions;
}

public int getMax_ip_sessions() {
	return max_ip_sessions;
}

public void setMax_ip_sessions(int max_ip_sessions) {
	this.max_ip_sessions = max_ip_sessions;
}

public short getTcp_cache_pruning_timeout() {
	return tcp_cache_pruning_timeout;
}

public void setTcp_cache_pruning_timeout(short tcp_cache_pruning_timeout) {
	this.tcp_cache_pruning_timeout = tcp_cache_pruning_timeout;
}

public short getTcp_cache_nominal_timeout() {
	return tcp_cache_nominal_timeout;
}

public void setTcp_cache_nominal_timeout(short tcp_cache_nominal_timeout) {
	this.tcp_cache_nominal_timeout = tcp_cache_nominal_timeout;
}

public short getUdp_cache_pruning_timeout() {
	return udp_cache_pruning_timeout;
}

public void setUdp_cache_pruning_timeout(short udp_cache_pruning_timeout) {
	this.udp_cache_pruning_timeout = udp_cache_pruning_timeout;
}

public short getUdp_cache_nominal_timeout() {
	return udp_cache_nominal_timeout;
}

public void setUdp_cache_nominal_timeout(short udp_cache_nominal_timeout) {
	this.udp_cache_nominal_timeout = udp_cache_nominal_timeout;
}

public int getMemcap() {
	return memcap;
}

public void setMemcap(int memcap) {
	this.memcap = memcap;
}

public int getPrune_log_max() {
	return prune_log_max;
}

public void setPrune_log_max(int prune_log_max) {
	this.prune_log_max = prune_log_max;
}

public int getFlags() {
	return flags;
}

public void setFlags(int flags) {
	this.flags = flags;
}

public int getMin_response_seconds() {
	return min_response_seconds;
}

public void setMin_response_seconds(int min_response_seconds) {
	this.min_response_seconds = min_response_seconds;
}

public char getMax_active_responses() {
	return max_active_responses;
}

public void setMax_active_responses(char max_active_responses) {
	this.max_active_responses = max_active_responses;
}

public SessionHAConfig getHa_config() {
	return ha_config;
}

public void setHa_config(SessionHAConfig ha_config) {
	this.ha_config = ha_config;
}

public int getNumSnortPolicies() {
	return numSnortPolicies;
}

public void setNumSnortPolicies(int numSnortPolicies) {
	this.numSnortPolicies = numSnortPolicies;
}

public int getPolicy_ref_count() {
	return policy_ref_count;
}

public void setPolicy_ref_count(int policy_ref_count) {
	this.policy_ref_count = policy_ref_count;
}

public NoRefCallback getNo_ref_cb() {
	return no_ref_cb;
}

public void setNo_ref_cb(NoRefCallback no_ref_cb) {
	this.no_ref_cb = no_ref_cb;
}
   
}
