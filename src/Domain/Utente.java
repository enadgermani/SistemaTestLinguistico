package Domain;
import java.util.ArrayList;
import java.util.List;

public class Utente {
	
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private List<Permesso> permessi;


	public static  Utente create(String username, String password){
		Utente u = new Utente (username, password);
		return u;
	}


	public Utente(String username, String password,String nome, String cognome) {
		this.username=username;
		this.password=password;
		this.cognome=cognome;
		this.nome=nome;
		this.permessi=new ArrayList<Permesso>();
	}

	@Override
	public String toString() {
		return "Utente{" +
				"nome='" + nome + '\'' +
				", cognome='" + cognome + '\'' +
				", username='" + username + '\'' +
				'}';
	}

	public Utente(String username, String password){
		this.username=username;
		this.password=password;
		this.cognome="StandardCognome";
		this.nome="StandardNome";
		this.permessi=new ArrayList<Permesso>();
		System.out.println("utente creato");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
