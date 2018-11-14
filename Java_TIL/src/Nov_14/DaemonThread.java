package Nov_14;

public class DaemonThread implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("Daemon Running...");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main() thread finished!");
	}
}
