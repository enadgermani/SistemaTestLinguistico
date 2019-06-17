package Domain;
public class ElementoGrafico {
	
	private double distanzaVerticale;
	private double distanzaOrizzontale;
	private double larghezza;
	private double altezza;
	private Slide slide;
	
	public ElementoGrafico(Slide slide,double altezza,double distanzaOrizzontale,double distanzaVerticale,double larghezza) {
		this.slide = slide;
		this.distanzaVerticale=distanzaVerticale;
		this.distanzaOrizzontale=distanzaOrizzontale;
		this.larghezza=larghezza;
		this.altezza=altezza;
	}
	
	public ElementoGrafico(ElementoGrafico x) {
		    this(x.getSlide(), x.getAltezza(),x.getDistanzaOrizzontale(),x.getDistanzaVerticale(),x.getLarghezza());
    }
	
	public void elimina(ElementoGrafico x) {
		x=null;
	}
	
	public ElementoGrafico duplica(ElementoGrafico x) {
		ElementoGrafico tmp = new ElementoGrafico(x);
		return tmp;
	}
	
	public void spostaElemento(double dv, double dO) {
		setDistanzaVerticale(dv);
		setDistanzaOrizzontale(dO);
	}
	
	public double getDistanzaVerticale() {
		return distanzaVerticale;
	}

	public void setDistanzaVerticale(double distanzaVerticale) {
		this.distanzaVerticale = distanzaVerticale;
	}

	public double getDistanzaOrizzontale() {
		return distanzaOrizzontale;
	}

	public void setDistanzaOrizzontale(double distanzaOrizzontale) {
		this.distanzaOrizzontale = distanzaOrizzontale;
	}

	public Slide getSlide() {
		return slide;
	}

	public void setSlide(Slide slide) {
		this.slide = slide;
	}

	public void ridimensionamento(double a, double l) {
		setAltezza(a);
		setLarghezza(l);
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
}
