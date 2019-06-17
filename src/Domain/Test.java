package Domain;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	private String keyword;
	private String nome;
	private List<Sezione> sezioni;
	
	public Test(String nome) {
		this.nome=nome;
		this.sezioni = new ArrayList<Sezione>(1);
	}

	public List<Sezione> getSezioni() {
		return sezioni;
	}

	public void setSezioni(List<Sezione> sezioni) {
		this.sezioni = sezioni;
	}
	
}
