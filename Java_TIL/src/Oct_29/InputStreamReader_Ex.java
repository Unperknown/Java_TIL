package Oct_29;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Ex {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		//입력 장치와 프로세스의 인터페이스 역할을 함
		
		int c;
		
		try {
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
