package work;

public class PAF_State {
	private int seq;
	private int pos;

	private int fpt_eoh;
	private int tot;
	
	PAF_Status  paf;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getFpt_eoh() {
		return fpt_eoh;
	}

	public void setFpt_eoh(int fpt_eoh) {
		this.fpt_eoh = fpt_eoh;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public PAF_Status getPaf() {
		return paf;
	}

	public void setPaf(PAF_Status paf) {
		this.paf = paf;
	}
	
}
