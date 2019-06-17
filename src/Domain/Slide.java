package Domain;

public class Slide {
	
	private Domanda domanda;
	
	public Slide(Domanda domanda) {
		this.domanda=domanda;
	}
	
	public Slide(Slide s) {
		this.domanda=s.domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}
	
	public Domanda getDomanda() {
		return domanda;
	}
	
	public void spostaSlide(Test newTest) {
		Test t = getDomanda().getSezione().getTest();
		String testo = getDomanda().getTesto();
		Domanda d = new Domanda(newTest.getSezioni().get(0), testo);
		newTest.getSezioni().get(0).getDomande().add(d);
		Sezione s = getDomanda().getSezione();
		s.getDomande().remove(d);
	}
}
