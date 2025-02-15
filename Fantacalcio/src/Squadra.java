import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Squadra extends BaseEntity implements Valutabile{
	private List<Giocatore> giocatori;

//TODO: implementare costruttore, getter, setter ed eventuali altri metodi.

    public Squadra(String nome) {
    	super(nome);
    	this.giocatori=new ArrayList<>();
    }
    
	public void aggiungiGiocatore(Giocatore g) {
		giocatori.add(g);
		
	}
    
	public void mostraGiocatoriOrdinati() {
		Collections.sort(giocatori);
		for(Giocatore g: giocatori) {
			System.out.println(g.descrivi());
		}
    }

	@Override
	public double valore() {//il valore totale della squadra è dato dal valore di mercato di ogni singolo giocatore
		double vtot=0;
		for(Giocatore g:giocatori) {
			vtot=vtot+g.valore();
		}
		return vtot;
	}

	@Override
	public String descrivi() {
		return "Nome squadra: "+getNome()+" Valore della squadra: "+valore();
	}


}
