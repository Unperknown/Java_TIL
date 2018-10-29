package Oct_29;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriter_Ex {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			FileWriter fout = new FileWriter("test.txt");
			while (true) {
				String line = scanner.nextLine();
				if (line.isEmpty()) break;
				fout.write(line);
				fout.write("\r\n");
			}
			
			fout.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
