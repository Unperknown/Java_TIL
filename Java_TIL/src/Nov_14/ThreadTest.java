package Nov_14;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadT thread = new ThreadT("*");
		thread.start();
		
		System.out.println("����!");
		
		synchronized (thread) {
			try {
				thread.wait(); //��ȣ���� ����
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Last:" + thread.str.length());
			}
		}
	}

}
