package Domain;
import java.util.ArrayList;
import java.util.List;

public class Sezione {
	
	private String nome;
	private boolean random;
	private Test test;
	private List<Slide> slides;
	private List<Domanda> domande;
	
	public Sezione(String nome, Test test) {
		this.nome=nome;
		this.test=test;
		this.slides= new ArrayList<Slide>();
	}

	public void addDomande(Domanda a){
		domande.add(a);
	}
	public List<Domanda> getDomande(){
		return domande;
	}
	
	public void setRandom(boolean random) {
		this.random = random;
	}

	public String getNome() {
		return nome;
	}

	public Test getTest() {
		return test;
	}

	public Sezione(Sezione s) {
		this.nome = s.getNome();
		this.test = s.getTest();
		this.slides= s.getSlides();
	}
	
	public List<Slide> getSlides() {
		return slides;
	}

	@Override
	public String toString() {
		return "Sezione{" +
				"nome='" + nome + '\'' +
				'}';
	}
}