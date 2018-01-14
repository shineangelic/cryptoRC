package it.criptorc.pista;

import it.criptorc.enums.FondoEnum;
import it.criptorc.enums.FormaSezioneEnum;
import it.criptorc.enums.StatoFondoEnum;

public class SezionePista {

	private FormaSezioneEnum forma;
	private FondoEnum fondo;
	private StatoFondoEnum stato;
	public FormaSezioneEnum getForma() {
		return forma;
	}
	public void setForma(FormaSezioneEnum forma) {
		this.forma = forma;
	}
	public FondoEnum getFondo() {
		return fondo;
	}
	public void setFondo(FondoEnum fondo) {
		this.fondo = fondo;
	}
	public StatoFondoEnum getStato() {
		return stato;
	}
	public void setStato(StatoFondoEnum stato) {
		this.stato = stato;
	}
	
	
	
	
}
