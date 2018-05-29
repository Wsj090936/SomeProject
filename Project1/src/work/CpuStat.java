package work;

public class CpuStat {
	 public double user;
	 public double sys;
	 public double total;
	 public double idle;
	public double getUser() {
		return user;
	}
	public void setUser(double user) {
		this.user = user;
	}
	public double getSys() {
		return sys;
	}
	public void setSys(double sys) {
		this.sys = sys;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getIdle() {
		return idle;
	}
	public void setIdle(double idle) {
		this.idle = idle;
	}

}
