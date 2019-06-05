package Domain;

public class Soggetto {
	
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private String cittaDiNascita;
	private String cittaDiResidenza;
	
	public Soggetto(String nome, String cognome, String dataDiNascita, String cittaDiNascita, String cittaDiResidenza){
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.cittaDiNascita = cittaDiNascita;
		this.cittaDiResidenza = cittaDiResidenza;
	}	
	
}
