package pattern;

public class EsempioSingleton {
	private static EsempioSingleton instance;
	private String nome;
	private EsempioSingleton() {}
	
	public static EsempioSingleton getInstance() {
		if(instance==null) {
			instance=new EsempioSingleton();
		}
		System.out.println();
		return instance;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String toString() {
		return nome;
	}
}
