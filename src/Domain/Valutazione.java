package Domain;

public class Valutazione {
	
	private String diagnosi;
	
	public Valutazione() {
		super();
	}
	
	public void setValutazione(String v) {
		this.diagnosi=v;
	}

	@Override
	public String toString() {
		return "Valutazione{" +
				"diagnosi='" + diagnosi + '\'' +
				'}';
	}
}
