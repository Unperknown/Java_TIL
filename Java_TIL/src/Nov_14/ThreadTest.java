package Nov_14;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadT thread = new ThreadT("*");
		thread.start();
		
		System.out.println("시작!");
		
		synchronized (thread) {
			try {
				thread.wait(); //상호배제 보장
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Last:" + thread.str.length());
			}
		}
	}

}
