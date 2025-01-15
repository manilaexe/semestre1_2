import java.io.*;
public class Esercitazione2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileOutputStream fos = new FileOutputStream("binary2.dat")){
			fos.write(new byte [] {1,2,3,4,5,6,7,8,9,10});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("binary2.dat")){
			int b;
			while((b=fis.read())!=-1) {
				System.out.print(b + " ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
