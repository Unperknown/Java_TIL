package Nov_12;

public class ThreadEx {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main() executed");
	}

}
