package it.criptorc;

public class Esc {
	
	private int amperes;
	private int amperesPicco;
	
	private boolean waterproof;
	
	public Esc() {
		super();
		waterproof = false;
	}

	public int getAmperes() {
		return amperes;
	}

	public void setAmperes(int amperes) {
		this.amperes = amperes;
	}

	public int getAmperesPicco() {
		return amperesPicco;
	}

	public void setAmperesPicco(int amperesPicco) {
		this.amperesPicco = amperesPicco;
	}

	public boolean isWaterproof() {
		return waterproof;
	}

	public void setWaterproof(boolean waterproof) {
		this.waterproof = waterproof;
	}

}
