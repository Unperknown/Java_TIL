package Oct_10;

public interface Phone_Interface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("Phone");
	}
}

//�ڹٿ����� �������̽��� �԰ݰ� ����
//�������̽��� ��ü�� ������ �� ����
//�������̽� Ÿ���� ���� ������ ������ ������
//�������̽��� ��ӹ����� ��� �߻� �޼ҵ�� �������̵��ؾ� ��