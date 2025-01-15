package votazioni;

public class Main {

	public static void main(String[] args) {
		
		Votazione v=Votazione.getInstance();
		
		Candidato c1=new Candidato("Mario","Rossi","01",Posizione.SINDACO,0);
		Candidato c2=new Candidato("Francesco","Rizzoli","02",Posizione.CONSIGLIERE,0);
		Candidato c3=new Candidato("Claudia","Bianchi","03",Posizione.SINDACO,0);
		Candidato c4=new Candidato("Giorgia","Legna","04",Posizione.ASSESSORE,0);
		
		Utente u1=new Utente ("Giorgio","Tavolo","grgtv","01");
		Utente u2=new Utente ("Marco","Grigi","mrcgr","04");
		Utente u3=new Utente ("Franco","Chi","frcc","04");
		Utente u4=new Utente ("Maria","De Filippi","mrdf","04");
		
		v.addCandidato(c1);
		v.addCandidato(c2);
		v.addCandidato(c3);
		v.addCandidato(c4);
		
		u1.suoVoto("01", v);
		u1.suoVoto("01", v);
		u2.suoVoto("04", v);		
		u3.suoVoto("04", v);
		u4.suoVoto("04", v);
		
		v.stampaRis();
		
		
		

	}

}
