package Oct_10;

public interface Phone_Interface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("Phone");
	}
}

//자바에서의 인터페이스는 규격과 같음
//인터페이스는 객체를 생성할 수 없음
//인터페이스 타입의 참조 변수는 선언이 가능함
//인터페이스를 상속받으면 모든 추상 메소드는 오버라이드해야 함