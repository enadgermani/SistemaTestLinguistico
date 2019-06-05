package Domain;

public class Label extends ElementoGrafico {
	
	private String testo;
	private int fontSize;

	public Label(Slide slide, Casella casella, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza,String t, int fS) {
		super(slide, casella, altezza, distanzaOrizzontale, distanzaVerticale, larghezza);
		this.testo=t;
		this.fontSize=fS;
	}
	
	public String getTesto() {
		return testo;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setTesto(String testo) {
		this.testo=testo;
	}
	
	public void setFontSize(int size) {
		this.fontSize=size;
	}

}
