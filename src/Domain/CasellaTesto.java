package Domain;

public class CasellaTesto {
	
	private double altezza;
	private double larghezza;
	private String testo;
	
	public CasellaTesto(double altezza,double larghezza) {
		this.altezza=altezza;
		this.larghezza=larghezza;
	}
	
	public void testo(String testo) {
		this.testo=testo;
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
