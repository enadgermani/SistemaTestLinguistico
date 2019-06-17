package Domain;
import java.util.ArrayList;
import java.util.List;

public class Sezione {
	
	private String nome;
	private boolean random;
	private Test test;
	private List<Domanda> domande;
	
	public Sezione(String nome, Test test) {
		this.nome=nome;
		this.test=test;
		domande = new ArrayList<Domanda>();
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
		this.domande= s.getDomande();
	}
	
	public List<Domanda> getDomande() {
		return domande;
	}
	
}