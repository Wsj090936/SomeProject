package work;

public class SessionHAConfig {
   public Timeval min_session_lifetime;
   public Timeval min_sync_interval;
   public char startup_input_file;
   public char runtime_output_file;
   public char shutdown_output_file;
   public char runtime_input_file;
   
   public char use_side_channel;
   public char use_daq;
   
public Timeval getMin_session_lifetime() {
	return min_session_lifetime;
}
public void setMin_session_lifetime(Timeval min_session_lifetime) {
	this.min_session_lifetime = min_session_lifetime;
}
public Timeval getMin_sync_interval() {
	return min_sync_interval;
}
public void setMin_sync_interval(Timeval min_sync_interval) {
	this.min_sync_interval = min_sync_interval;
}
public char getStartup_input_file() {
	return startup_input_file;
}
public void setStartup_input_file(char startup_input_file) {
	this.startup_input_file = startup_input_file;
}
public char getRuntime_output_file() {
	return runtime_output_file;
}
public void setRuntime_output_file(char runtime_output_file) {
	this.runtime_output_file = runtime_output_file;
}
public char getShutdown_output_file() {
	return shutdown_output_file;
}
public void setShutdown_output_file(char shutdown_output_file) {
	this.shutdown_output_file = shutdown_output_file;
}
public char getRuntime_input_file() {
	return runtime_input_file;
}
public void setRuntime_input_file(char runtime_input_file) {
	this.runtime_input_file = runtime_input_file;
}
public char getUse_side_channel() {
	return use_side_channel;
}
public void setUse_side_channel(char use_side_channel) {
	this.use_side_channel = use_side_channel;
}
public char getUse_daq() {
	return use_daq;
}
public void setUse_daq(char use_daq) {
	this.use_daq = use_daq;
}
   
   
}
