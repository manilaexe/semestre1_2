import java.io.*;

public class ScritturaFile {

	public static void main(String[] args) {
		
		try (FileWriter writer = new FileWriter("prova.txt")){
			writer.write("Ciao a tutti vi odio dal profondo, non sapete fare il vostro lavoro tornate da dove siete arrivati grazie:)\n");
			writer.write("LOL pure un'altra riga epico");
			System.out.println("File scritto con successo (non come te, tu sei un fallito)");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Errore: "+e.getMessage());
		}
		
	}

}
