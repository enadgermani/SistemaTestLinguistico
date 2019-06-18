package Domain;

public class Checkbox extends ElementoGrafico {
	
	private boolean valore;

	public Checkbox(Slide slide, Casella casella, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza) {
		super(slide, casella, altezza, distanzaOrizzontale, distanzaVerticale, larghezza);
	}
	
	public void setValore(boolean v) {
		this.valore=v;
	}

	@Override
	public String toString() {
		return "Checkbox{" +
				"valore=" + valore +
				'}';
	}
}
