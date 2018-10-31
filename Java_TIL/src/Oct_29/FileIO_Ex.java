package Oct_29;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileIO_Ex {

	public static void main(String[] args) {
		File file = new File("test2.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fout = new FileOutputStream(file);
			BufferedOutputStream fbuf = new BufferedOutputStream(fout, 512);
			fbuf.write("In buffer".getBytes());

			PrintStream fpr = new PrintStream(fbuf);
			fpr.println("In PrintStream");

			fpr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		try {
			FileInputStream fin = new FileInputStream(file);

			int buf;

			while ((buf = fin.read()) != -1) {
				System.out.print((char)buf);
			}
			System.out.println();

			BufferedInputStream fbuf2 = new BufferedInputStream(fin, 512);

			while ((buf = fbuf2.read()) != -1) {
				System.out.print((char)buf);
			}

			fin.close();
			fbuf2.close();
		} catch (Exception e) {
			System.out.println("어떻게 파일이 없을 수 있죠?");
			return;
		}


	}

}
