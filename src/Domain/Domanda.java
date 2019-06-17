package Domain;
public class Domanda {
	
	private String testo;
	private String risposta;
	private int timer;
	private int ordine;
	private Slide slide;
	private Sezione sezione;
	
	public Domanda(Sezione sezione,String testo) {
		this.slide= new Slide(this);
		this.sezione=sezione;
		this.testo=testo;
	}
	
	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public int getOrdine() {
		return ordine;
	}

	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}

	public Slide getSlide() {
		return slide;
	}

	public void setSlide(Slide slide) {
		this.slide = slide;
	}

	public String getRisposta() {
		return risposta;
	}

	public void modificaOrdine(int x) {
		this.ordine=x;
	}
	
	public Sezione getSezione() {
		return sezione;
	}

	public void setSezione(Sezione sezione) {
		this.sezione = sezione;
	}

	public void cambiaSezione(Sezione newS) {
		
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
