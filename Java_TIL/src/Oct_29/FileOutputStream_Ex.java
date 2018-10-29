package Oct_29;

import java.io.FileOutputStream;

public class FileOutputStream_Ex {

	public static void main(String[] args) {
		int[] b = { 1, 2, 3, 4, 5 };
		
		try {
			FileOutputStream fout = new FileOutputStream("test.out");
			for (int i : b) {
				fout.write((byte)i);
			}
			
			fout.close();
		} catch (Exception e) {
			return;
		}
	}

}
