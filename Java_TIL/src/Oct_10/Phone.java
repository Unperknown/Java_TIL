package Oct_10;

public class Phone extends Calculator implements Phone_Interface{
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a > b ? a - b : b - a;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		
		for (int i : a) {
			sum += i;
		}
		
		return sum / a.length;
	}
	
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
