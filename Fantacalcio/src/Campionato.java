import java.util.HashMap;
import java.util.Map;

public class Campionato {
    
    private Map<String, Squadra> squadre; //nome squadra, la squadra
    public Campionato() {
    	this.squadre=new HashMap<>();
    }

    public static Campionato instance;
    
	public static Campionato getInstance() {
		if(instance==null) {
			instance=new Campionato();
		}
		return instance;
	}
	
    public void aggiungiSquadra(Squadra s) {
    	squadre.put(s.getNome(), s);
    }

    public void mostraTutteLeSquadre() {
    	for(Squadra s: squadre.values()) {
    		System.out.println(s.descrivi());
    	}
    }
}