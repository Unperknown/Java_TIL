package Oct_29;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Ex {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		//�Է� ��ġ�� ���μ����� �������̽� ������ ��
		
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
