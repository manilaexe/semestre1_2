public class PasseggeroBusiness  extends PasseggeroBase {
	
	//TODO: implementare costruttore
    public PasseggeroBusiness(String nome, String cognome, String numeroPassaporto) {
		super(nome, cognome, numeroPassaporto);
		
	}

    @Override
    public String toString() {
        return super.toString() + " [Business Class]";
    }
}