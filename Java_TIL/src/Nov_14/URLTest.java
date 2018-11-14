package Nov_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {
	static String contents;
	final static String address = "http://www.gsm.hs.kr/sub/page.php?page_code=open_08_01";
	
	public static void main(String[] args) {
		try {
			URL url = new URL(address);
			
			System.out.println("Host: "+url.getHost());
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("File: " + url.getFile());
			
			BufferedReader imported = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			while ((contents = imported.readLine()) != null) {
				System.out.println("³»¿ë: " + contents);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
