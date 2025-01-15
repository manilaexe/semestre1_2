package votazioni;

public class Persona {
	
	private String nome;
	private String cognome;
	private String id;
	
	Persona(String nome, String cognome, String id){
		this.nome=nome;
		this.cognome=cognome;
		this.id=id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getId() {
		return id;
	}
	
	public String toString() {
		return "Nome: "+getNome()+" Cognome: "+getCognome()+" Id: "+getId();
	}
}
