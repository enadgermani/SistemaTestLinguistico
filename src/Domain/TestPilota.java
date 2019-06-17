package Domain;
import java.util.ArrayList;
import java.util.List;

public class TestPilota extends Test {
	
	private List<Domanda> domande;
	private String keyword;
	private String nome;
	private List<Sezione> sezioni;

	public TestPilota(String nome) {
		super(nome);
		this.domande = new ArrayList<Domanda>();
	}
	
	public void aggiungiDomanda(Domanda d) {
		sezioni.get(0).getDomande().add(d);
	}
	
	public List<Domanda> getListaDomande(){
		List<Domanda> domande = new ArrayList<Domanda>();
		for (Sezione s: sezioni) {
			domande.addAll(s.getDomande());
		}
		return domande;
	}

	public void dividi(Sezione s,String nome1,String nome2) {
		Sezione s1 = new Sezione(nome1,this);
		Sezione s2 = new Sezione(nome2,this);
		int n = s.getDomande().size();
		for (int i=0;i<=n/2;i++) {
			s1.getDomande().add(s.getDomande().get(i));
		}
		for (int i=n/2+1;i<=n;i++) {
			s2.getDomande().add(s.getDomande().get(i));
		}
		sezioni.remove(s);
		sezioni.add(s1);
		sezioni.add(s2);
	}
	
	public void spostaSezione(Sezione s,int n) {
		Sezione tmp = sezioni.get(n);
		sezioni.set(n,s);
		sezioni.add(tmp);
	}
	
	public void unisci(Sezione a, Sezione b,String newName) {
		Sezione	tmp = new Sezione(newName,this);
		tmp.getDomande().addAll(a.getDomande());
		tmp.getDomande().addAll(b.getDomande());
		sezioni.remove(a);
		sezioni.remove(b);
		sezioni.add(tmp);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Sezione> getSezioni() {
		return sezioni;
	}

	public void setSezioni(List<Sezione> sezioni) {
		this.sezioni = sezioni;
	}

}
