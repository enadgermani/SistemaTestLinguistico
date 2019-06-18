package Domain;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	private String keyword;
	private String nome;
	private List<Sezione> sezioni;
//	public List<Domanda> domande;

	
	public Test(String nome, String keyword, Sezione sezione) {
		this.nome=nome;
		this.keyword=keyword;
		this.sezioni = new ArrayList<Sezione>(1);
	}
	public Test(String nome, Sezione sezione) {
		this.nome=nome;
		this.sezioni = new ArrayList<Sezione>(1);
	}


	public void addDomanda(Domanda d, Sezione s){
		//Trova una sezione
		s.addDomande(d);
	}
	public void addDomanda(Domanda d){
		//Trova una sezione
		sezioni.get(0).addDomande(d);
	}

	public List<Domanda> getDomande(){
		return sezioni.get(0).getDomande();
	}
	public List<Domanda> getDomande(Sezione s){
		return s.getDomande();
	}

	public void dividiSezione(Sezione s,String nome1,String nome2) {
		int n = s.getSlides().size();
		Sezione s1 = new Sezione(nome1,this);
		Sezione s2 = new Sezione(nome2,this);
		for(int i=0;i<=n/2;i++) {
			s1.getSlides().add(s.getSlides().get(i));
		}
		for(int i=n+1;i<=n;i++) {
			s2.getSlides().add(s.getSlides().get(i));
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
		tmp.getSlides().addAll(a.getSlides());
		tmp.getSlides().addAll(b.getSlides());
		sezioni.remove(a);
		sezioni.remove(b);
		sezioni.add(tmp);
	}

	public  String getNome() {
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

	@Override
	public String toString() {
		return "Test{" +
				"keyword='" + keyword + '\'' +
				", nome='" + nome + '\'' +
				'}';
	}

}
