import java.io.*;

public class Esercitazione1 {

	public static void main(String[] args) {
		
		File f = new File("studenti.txt");

		
		try {
			if(f.createNewFile()) {
				System.out.println("File creato correttamente");
			}else {
				System.out.println("File gia' esistente");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Errore: "+e.getMessage());
		}
		
		try (FileWriter w = new FileWriter("studenti.txt")){			
			w.write("Pablo Escobar\n");
			w.write("Messina Denaro\n");
			w.write("Toto Riina\n");
			w.write("Giovanni Casalesi\n");
			w.write("Francesco Gambino\n");
			
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("Errore: "+e1.getMessage());
		}
		
		try (FileReader r = new FileReader("studenti.txt")){			
			int c;
			while((c=r.read())!=-1) {
				System.out.print((char) c);
			}
		} catch (IOException e2) {
			e2.printStackTrace();
			System.out.println("Errore: "+e2.getMessage());
		}
		
		System.out.println("Programma terminato");
		
		
	}

}
