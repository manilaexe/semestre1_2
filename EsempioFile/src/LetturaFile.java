import java.io.*;

public class LetturaFile {

	public static void main(String[] args) {
		
		try (FileReader reader=new FileReader("prova.txt")){
			int c;
			while((c=reader.read())!=-1) {
				System.out.print((char) c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Errore: "+e.getMessage());
		}
		
		

	}

}
