import java.io.*;

public class Buffered {

	public static void main(String[] args) {
		
		try (BufferedReader br=new BufferedReader(new FileReader("prova.txt"))){
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Errore: "+e.getMessage());
		}

	}

}
