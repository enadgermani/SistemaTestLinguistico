package Domain;

public class Label extends ElementoGrafico {
	
	private String testo;
	private int nL;
	private Font f;

	public int getnL() {
		return nL;
	}

	public void setnL(int nL) {
		this.nL = nL;
	}

	public Label(Slide slide, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza,String t, Font f) {
		super(slide, altezza, distanzaOrizzontale, distanzaVerticale, larghezza);
		this.testo=t;
		this.f=f;
	}
	
	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo=testo;
	}
	
	public Font getF() {
		return f;
	}

	public void setF(Font f) {
		this.f = f;
	}

	public void ridimensionamento(double a) {
		if (this.getLarghezza() * this.getAltezza() >= f.getFontSize() * getnL() * f.getFactor()) {
			setAltezza(a);
		}
	}

}
