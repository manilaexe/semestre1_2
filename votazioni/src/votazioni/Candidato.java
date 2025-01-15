package votazioni;

public class Candidato extends Persona{
	
	Posizione p;
	int voti;
	
	Candidato(String nome, String cognome, String id, Posizione p, int voti) {
		super(nome, cognome, id);
		this.p=p;
		this.voti=voti;
	}
	
	public int getVoti() {
		return voti;
	}
	
	public int addVoto() {
		voti=voti+1;
		return voti;
	}
	
}
