package Domain;

public class Slide {
	
	private int ordine;
	private String domanda;
	
	public Slide(int ordine,String domanda) {
		this.ordine=ordine;
		this.domanda=domanda;
	}
	public Slide(String domanda) {
		this.ordine=(int) Math.random()*10;
		this.domanda=domanda;
	}
	
	public Slide(Slide s) {
		this.ordine=s.ordine;
		this.domanda=s.domanda;
	}

	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	public int getOrdine() {
		return ordine;
	}

	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}
}
