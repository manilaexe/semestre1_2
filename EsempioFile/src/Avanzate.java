
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
public class Avanzate {

	public static void main(String[] args) {
		
		//File f=new File("prova2.txt");
		
		
		try {
			Files.writeString(Paths.get("prova2.txt"), "Ciao NIO");
			String content=Files.readString(Paths.get("prova2.txt"));
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Errore: "+e.getMessage());
		}

	}

}
