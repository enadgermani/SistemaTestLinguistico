package Domain;
public class ComboBox extends ElementoGrafico {
	
	private Label[] labels;

	public ComboBox(Slide slide, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza,Label[] labels) {
		super(slide, altezza, distanzaOrizzontale, distanzaVerticale, larghezza);
		super.setLarghezza(labels[0].getLarghezza()+labels[0].getLarghezza()*2/1000);
		double x=0;				
		for(int i=0;i<=labels.length;i++) {
			x += labels[i].getAltezza();
		    }
		this.labels=labels;
		super.setAltezza(x);
	}
	
	public void ridimensionamento(double a,double l) {
		if (a>=super.getAltezza()&&l>=super.getLarghezza()) {
			super.setAltezza(a);
			super.setLarghezza(l);
		}
	}

}
