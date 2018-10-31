package Oct_31;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClass_Ex {

	public static void main(String[] args) {
		File file = new File("C:/windows/system.ini");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(format.format(new Date(file.lastModified())));
	}

}