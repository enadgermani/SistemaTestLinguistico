package Domain;
import java.util.ArrayList;
import java.util.List;

public class TestPilota extends Test {
	
	private List<Domanda> domande;

	public TestPilota(String nome,Sezione sezione) {
		super(nome,sezione);
		this.domande = new ArrayList<Domanda>();
	}

	@Override
	public String toString() {
		return "TestPilota{" +
				"in preparazione"+
				'}';
	}
}
