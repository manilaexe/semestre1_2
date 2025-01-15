package votazioni;
import java.util.*;
import java.io.*;

public class Votazione{
	public static Votazione instance;
	private  Map<String, Candidato> candidati;
	private ArrayList<String> votanti;
	
	private Votazione() {
		candidati=new HashMap<>();
		votanti=new ArrayList<>();
	}
	
	public static Votazione getInstance() {
		if(instance==null) {
			instance=new Votazione();
		}
		return instance;
	}
	
	public void addCandidato(Candidato c) {
		candidati.put(c.getId(),c);
	}
	
	public void vota(String idU, String idC) {
		if(votanti.contains(idU)) {
			System.out.println("BRUTTO IMBROGLIONE HAI GIA' VOTATO");
			return;
		}
		Candidato c= candidati.get(idC);
		if(c!=null) {
			c.addVoto();
			votanti.add(idU);
		}else {
			System.out.println("Candidato non trovato");
		}
	}
	
	
	
	public void stampaRis() {
		for(Candidato c:candidati.values()) {
			System.out.println("Cognome: "+c.getCognome()+" Voti: "+c.getVoti());
		}
	}
	

}
