package Domain;

public class ComboBox extends ElementoGrafico {
	
	private Label valore;

	public ComboBox(Slide slide, Casella casella, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza,Label valore) {
		super(slide, casella, altezza, distanzaOrizzontale, distanzaVerticale, larghezza);
		this.valore=valore;
	}

	@Override
	public String toString() {
		return "ComboBox{" +
				"valore=" + valore +
				'}';
	}
}
