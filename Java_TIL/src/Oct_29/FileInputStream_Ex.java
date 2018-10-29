package Oct_29;

import java.io.FileInputStream;

public class FileInputStream_Ex {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("test.out");
			
			int rd;
			
			while ((rd = in.read()) != -1) {
				System.out.print(rd + " ");
			}
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
