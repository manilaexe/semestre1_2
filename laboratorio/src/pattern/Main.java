package pattern;

public class Main {
	public static void main(String[] args) {
		EsempioSingleton es1=EsempioSingleton.getInstance();
		es1.setNome(nome:"prova");
		
		EsempioSingleton es2=EsempioSingleton.getInstance();
		System.out.println(es2);
	}
}
