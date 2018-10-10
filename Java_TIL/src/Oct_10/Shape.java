package Oct_10;

public abstract class Shape {
	public Shape() {}
	abstract public void draw(); //abstract method
}

//추상 클래스는 객체 생성이 불가능함
//추상 클래스에 상속받은 서브 클래스는 추상 클래스가 됨

abstract class Line extends Shape {
	public String toString() { return "Line"; }
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
//추상 클래스를 상속받은 클래스는 부모 클래스의 메서드를 오버라이드해야 함

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}