package Oct_10;

public abstract class Shape {
	public Shape() {}
	abstract public void draw(); //abstract method
}

//�߻� Ŭ������ ��ü ������ �Ұ�����
//�߻� Ŭ������ ��ӹ��� ���� Ŭ������ �߻� Ŭ������ ��

abstract class Line extends Shape {
	public String toString() { return "Line"; }
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
//�߻� Ŭ������ ��ӹ��� Ŭ������ �θ� Ŭ������ �޼��带 �������̵��ؾ� ��

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}