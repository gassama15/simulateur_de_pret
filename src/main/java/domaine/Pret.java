package domaine;

import java.io.Serializable;

public class Pret implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int mpret;
	private double tia;
	private int na;
	private double mmens;
	private double mglobal;

	public Pret() {}

	public int getMpret() {
		return mpret;
	}

	public void setMpret(int mpret) {
		this.mpret = mpret;
	}

	public double getTia() {
		return tia;
	}

	public void setTia(double tia) {
		this.tia = tia;
	}

	public int getNa() {
		return na;
	}

	public void setNa(int na) {
		this.na = na;
	}

	public double getMmens() {
		return mmens;
	}

	public void setMmens(double mmens) {
		this.mmens = mmens;
	}

	public double getMglobal() {
		return mglobal;
	}

	public void setMglobal(double mglobal) {
		this.mglobal = mglobal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
