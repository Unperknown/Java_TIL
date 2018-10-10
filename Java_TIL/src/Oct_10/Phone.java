package Oct_10;

public class Phone implements Phone_Interface{
	
	@Override
	public void sendCall() {
		System.out.println("수신 중...");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 받기");
	}
	
	public void flash() {
		System.out.println("불이 켜짐");
	}

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
