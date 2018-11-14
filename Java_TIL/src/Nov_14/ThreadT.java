package Nov_14;

public class ThreadT extends Thread{

	String str;
	
	public ThreadT(String str) {
		this.str = str;
	}
	
	@Override
	//������� Thread Ŭ������ ����Ͽ� run �޼��带 �������̵��Ͽ� �ڵ� �κ��� �ۼ���
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
