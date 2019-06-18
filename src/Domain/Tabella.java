package Domain;

public class Tabella extends ElementoGrafico {
	
	private int righe,colonne;

	public Tabella(Slide slide, Casella casella, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza,int r,int c) {
		super(slide, casella, altezza, distanzaOrizzontale, distanzaVerticale, larghezza);
		this.righe=r;
		this.colonne=c;
	}
	
	public void inserisciRiga(int r) {
		setRighe(getRighe()+ r);
	}
	
	public void inserisciColonna(int c) {
		setColonne(getColonne()+ c);
	}
	
	public void eliminaRiga(int r) {
		if(getRighe()>=r) setRighe(getRighe()- r);
		else System.out.println("Errore");
	}
	
	public void eliminaColonna(int c) {
		if(getColonne()>=c) setColonne(getColonne()- c);
		else System.out.println("Errore");
	}
	
	public void inserisci(ElementoGrafico x,Casella casella) {
		casella.inserisci(x);
	}

	public int getRighe() {
		return righe;
	}

	public void setRighe(int righe) {
		this.righe = righe;
	}

	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
}
