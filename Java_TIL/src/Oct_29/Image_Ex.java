package Oct_29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Image_Ex {

	public static void main(String[] args) {
		File src = new File("test.jpeg");
		File target = new File("copy.jpeg");
		
		try {
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(target);
			
			int c;
			
			while ((c = fin.read()) != -1) {
				fout.write((byte)c);
			}
			
			fin.close();
			fout.close();
		} catch (Exception e) {
			System.out.println("어떻게 복사가 안될 수 있을까여");
			return;
		}
	}

}
