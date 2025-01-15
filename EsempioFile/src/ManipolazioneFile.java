import java.io.*;

public class ManipolazioneFile {

	public static void main(String[] args) {
		
		File f = new File("prova3.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File creato");
			}else{
				System.out.println("File già esistente");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try (FileWriter w = new FileWriter("prova3.txt")){
			w.write("Povero file verrai eliminato miseramente\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileReader r = new FileReader("prova3.txt")){
			int c;
			while((c=r.read())!=-1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if(f.exists()) {
			System.out.println("Nome file: "+f.getName());
			System.out.println("Path: "+f.getAbsolutePath());
			System.out.println("Lunghezza: "+f.length());
			System.out.println("Eliminazione riuscita: "+f.delete());
			
		}
		
	}

}
