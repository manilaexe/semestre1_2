import java.io.File;
import java.io.IOException;

public class CreazioneFile {

	public static void main(String[] args) {
		System.out.println("hello");
		File f=new File("prova.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("File creato: "+f.getName());
			}else {
				System.out.println("Il file esiste gia'.");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Errore: "+e.getMessage());
		}

	}

}


