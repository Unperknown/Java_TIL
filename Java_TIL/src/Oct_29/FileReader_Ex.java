package Oct_29;

import java.io.FileReader;

public class FileReader_Ex {

	public static void main(String[] args) {
		try {
			FileReader frd = new FileReader("C:/windows/system.ini");
			
			int c;
			
			while ((c = frd.read()) != -1) {
				System.out.print((char)c);
			}
			
			frd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
