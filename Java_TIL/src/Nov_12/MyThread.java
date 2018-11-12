package Nov_12;

public class MyThread implements Runnable{

	String str;
	
	public MyThread(String str) {
		this.str = str;
	}
	
	@Override
	//쓰레드는 Thread 클래스를 상속하여 run 메서드를 오버라이드하여 코드 부분을 작성함
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(str + " ");
		}
		try {
			Thread.sleep((int)Math.random() * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
