import java.io.*;

public class ScritturaeLetturaBin {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("binary.dat")){
			fos.write(new byte[] {1,2,3,4,5});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("binary.dat")){
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
