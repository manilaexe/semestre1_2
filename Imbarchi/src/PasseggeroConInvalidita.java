public class PasseggeroConInvalidita  extends PasseggeroBase {
    
    //TODO: definire proprietà aggiuntive e implementare costruttore, getter e setter
	TipoInvalidita ti;
    public PasseggeroConInvalidita(String nome, String cognome, String numeroPassaporto, TipoInvalidita ti) {
		super(nome, cognome, numeroPassaporto);
		this.ti=ti;
	}
    
    public void setInv(TipoInvalidita ti) {
    	this.ti=ti;
    }
    
    public TipoInvalidita getInv() {
    	return ti;
    }
    
    public TipoInvalidita getInvalidita() {
    	return ti;
    }

	@Override
    public String toString() {
        return super.toString() + " [Invalidità: " + ti + "]";
    }
}
