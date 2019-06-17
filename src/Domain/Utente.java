package Domain;
import java.util.ArrayList;
import java.util.List;

public class Utente {
	
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private List<Permesso> permessi;
	
	public Utente(String username, String password,String nome, String cognome) {
		this.username=username;
		this.password=password;
		this.cognome=cognome;
		this.nome=nome;
		this.permessi=new ArrayList<Permesso>();
	}
	
	public boolean log(String user, String pwd) {
		if(getUsername()==user&&getPassword()==pwd) return true;
		else return false;
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

	public List<Permesso> getPermessi() {
		return permessi;
	}

	public void setPermessi(List<Permesso> permessi) {
		this.permessi = permessi;
	}
	
	
}
