package Oct_10;

public class Phone implements Phone_Interface{
	
	@Override
	public void sendCall() {
		System.out.println("���� ��...");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �ޱ�");
	}
	
	public void flash() {
		System.out.println("���� ����");
	}

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
