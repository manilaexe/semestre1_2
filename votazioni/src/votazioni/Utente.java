package votazioni;

public class Utente extends Persona{
	
	private String voto; 
	
	
	Utente(String nome, String cognome, String id, String voto) {
		super(nome, cognome, id);
		this.voto=voto;		
	}
	

	public void suoVoto(String id, Votazione v) {
		v.vota(getId(),id);
	}
	public String getVoto() {
		return voto;
	}

}
