package Domain;

public class RiquadroImmagine extends ElementoGrafico {
	
	public RiquadroImmagine(Slide slide, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza) {
		super(slide, altezza, distanzaOrizzontale, distanzaVerticale, larghezza);
	}

	private ElementoGrafico e;
	
	public void inserisci(ElementoGrafico x) {
		double a = x.getAltezza();
		double l = x.getLarghezza();
		if (getAltezza()>a && getLarghezza()>l) {
			e = x;
		}else {
			System.out.println("Errore, impossibile inserire");
		}
	}
	
}
