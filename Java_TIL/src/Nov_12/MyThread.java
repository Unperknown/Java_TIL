package Nov_12;

public class MyThread implements Runnable{

	String str;
	
	public MyThread(String str) {
		this.str = str;
	}
	
	@Override
	//������� Thread Ŭ������ ����Ͽ� run �޼��带 �������̵��Ͽ� �ڵ� �κ��� �ۼ���
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
