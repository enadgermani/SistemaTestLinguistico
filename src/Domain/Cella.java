package Domain;
public class Cella {
	
	private int riga,colonna;
	private ElementoGrafico e;
	private double altezza,larghezza;
	private Tabella tabella;
	
	public Cella(int r,int c,Tabella tabella) {
		this.riga=r;
		this.colonna=c;
		this.altezza=tabella.getAltezza();
		this.larghezza=tabella.getLarghezza();
	}
	
	public void setE(ElementoGrafico e) {
		this.e=e;
	}
	
	public ElementoGrafico getE() {
		return e;
	}

}
