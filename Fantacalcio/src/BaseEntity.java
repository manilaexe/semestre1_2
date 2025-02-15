public abstract class BaseEntity {
    private String nome;

    public BaseEntity(String nome) {
    	this.nome=nome;
    }
    
    public void setNome(String nome) {
    	this.nome=nome;
    }
    
    public String getNome() {
    	return nome;
    }
    
    //TODO: implementare costruttore, getter e setter
    public abstract String descrivi();
}
