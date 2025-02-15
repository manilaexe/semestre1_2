import java.util.ArrayList;
import java.util.List;

public class Imbarco {
	private String codiceVolo;
	private List<Passeggero> passeggeri;
	
	public Imbarco(String codiceVolo) {
			this.codiceVolo=codiceVolo;
			this.passeggeri=new ArrayList<>();
	}
	
	public String getVolo() {
		return codiceVolo;
	}
	
	public List<Passeggero> getPasseggero(){
		return passeggeri;
	}

    
	public void aggiungiPasseggero(Passeggero p1) {
		passeggeri.add(p1);
		
	}

    
}
