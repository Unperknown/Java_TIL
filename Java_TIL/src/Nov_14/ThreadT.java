package Nov_14;

public class ThreadT extends Thread{

	String str;
	
	public ThreadT(String str) {
		this.str = str;
	}
	
	@Override
	//쓰레드는 Thread 클래스를 상속하여 run 메서드를 오버라이드하여 코드 부분을 작성함
	public void run() {
		synchronized(this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(str + " ");
				str += '*';
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}
