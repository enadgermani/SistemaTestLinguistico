package Domain;
import java.util.ArrayList;
import java.util.List;

public class Tabella extends ElementoGrafico {
	
	private int righe,colonne;
	private List<Cella> tabella;
	
	public Tabella(Slide slide, double altezza, double distanzaOrizzontale, double distanzaVerticale,
			double larghezza,int r,int c) {
		super(slide, altezza, distanzaOrizzontale, distanzaVerticale, larghezza);
		this.righe=r;
		this.colonne=c;
		tabella = new ArrayList<Cella>(r*c);
	}
	
	public void inserisciRiga() {
		setRighe(getRighe()+ 1);
		int x = getColonne();
		for(int i=0;i<=x;i++) {
			tabella.add(new Cella(getRighe(), x+i, this));
		}
	}
	
	public void inserisciColonna(int c) {
		setColonne(getColonne()+ 1);
		int x = getRighe();
		for(int i=0;i<=x;i++) {
			tabella.add(new Cella(x+i, getColonne(), this));
		}
	}
	
	public void eliminaRiga(int n) {
		int c= getColonne();
		int r= getRighe();
		if(r>=n) {
			for(int i=0;i<=c;i++) {
				Cella tmp = tabella.get(r*i);
				tabella.remove(tmp);
			}
			setRighe(getRighe()- r);
		}
		else System.out.println("Errore");
	}
	
	public void eliminaColonna(int n) {
		int c= getColonne();
		int r= getRighe();
		if(c>=n) {
			for(int i=0;i<=r;i++) {
				Cella tmp = tabella.get(i*c);
				tabella.remove(tmp);
			}
			setRighe(getColonne()- c);
		}
		else System.out.println("Errore");
	}
	
	public void inserisci(ElementoGrafico x,int r,int c) {
		tabella.add(new Cella(r, c, this));
		tabella.get(r*c).setE(x);
		
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
	
	public void ridimensionamento(double a, double l) {
		if(getAltezza()>=a && getLarghezza()>=l) {
			setAltezza(a);
			setLarghezza(l);
		}
	}
}
