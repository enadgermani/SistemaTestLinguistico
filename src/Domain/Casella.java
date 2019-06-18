package Domain;

public class Casella {
	
	private double altezza;
	private double larghezza;
	private ElementoGrafico e;
	
	public Casella(double altezza,double larghezza) {
		this.altezza=altezza;
		this.larghezza=larghezza;
	}
	
	public void inserisci(ElementoGrafico x) {
		double a = x.getAltezza();
		double l = x.getLarghezza();
		if (getAltezza()>a && getLarghezza()>l) {
			e = x;
		}else {
			System.out.println("Errore, impossibile inserire");
		}
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
}
