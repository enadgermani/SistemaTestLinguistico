package Domain;

public class Domanda {
	
	private String testo;
	private String risposta;
	private int timer;
	private int ordine;
	private Slide slide;
	private Sezione sezione;
	
	public Domanda(Slide slide,Sezione sezione,String testo) {
		this.slide=slide;
		this.sezione=sezione;
		this.testo=testo;

	}
	
	public void modificaOrdine(int x) {
		this.ordine=x;
	}
	
	public void modificaTesto(String testo) {
		this.testo=testo;
	}
	
	public void getRisposta(String risposta) {
		this.risposta=risposta;
	}
	
	public void setRisposta(String risposta) {
		this.risposta=risposta;
	}
}
