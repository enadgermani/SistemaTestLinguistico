package Domain;
public class Checkbox extends ElementoGrafico {
	
	private boolean valore;
	private Label l;

	public Checkbox(Slide slide, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza,Label l) {
		super(slide, l.getAltezza()+2/1000*l.getAltezza(), distanzaOrizzontale, distanzaVerticale, l.getLarghezza()+2/1000*l.getLarghezza());
		this.l=l;
	}
	
	public void setValore(boolean v) {
		this.valore=v;
	}
	
	public void ridimensionamento(double newA,double newL) {
		if (newA>= getL().getAltezza()&& newL>=getL().getLarghezza()) {
			super.setAltezza(newA);
			super.setLarghezza(newL);
		}
	}

	public Label getL() {
		return l;
	}

	public void setL(Label l) {
		this.l = l;
	}

}
