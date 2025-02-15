import java.util.*;

public class GestioneImbarchi{


	//TODO: Impostare la Classe come Singletone
	private Map<String, Imbarco> imbarchi;
	public static GestioneImbarchi instance=null;
	
	public GestioneImbarchi() {
		this.imbarchi=new HashMap<>();
	}
	
	public static GestioneImbarchi getInstance() {
		if(instance==null) {
			instance=new GestioneImbarchi();
		}
		return instance;
	}
	
    public void aggiungiImbarco(Imbarco imbarco) {
    	 //TODO: salvare l'imbarco nella map, usando il codiceVolo come chiave.
    	imbarchi.put(imbarco.getVolo(), imbarco);
       
    }

    public Imbarco cercaImbarco(String codiceVolo) throws ImbarcoNonTrovatoException {
            //TODO: implementare ricerca imbarchi e gestire l'eccezione ImbarcoNonTrovatoException
    	Imbarco i= imbarchi.get(codiceVolo);
    	if(i==null) {
    		throw new ImbarcoNonTrovatoException("Imbarco non trovato");
    	}
    	
    	return i;
    	
    }

    public List<Passeggero> listaPasseggeriPerVolo(String codiceVolo) throws ImbarcoNonTrovatoException {
        //TODO: restituire la lista dei passeggeri gestendo l'eccezione ImbarcoNonTrovatoException
    	Imbarco i=cercaImbarco(codiceVolo);
    	return i.getPasseggero();
    }


}
