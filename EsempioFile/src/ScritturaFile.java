import java.io.*;

public class ScritturaFile {

	public static void main(String[] args) {
		
		try (FileWriter writer = new FileWriter("prova.txt")){
			writer.write("Ciao a tutti prima riga:)\n");
			writer.write("LOL pure un'altra riga epico");
			System.out.println("File scritto con successo");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Errore: "+e.getMessage());
		}
		
	}

}
