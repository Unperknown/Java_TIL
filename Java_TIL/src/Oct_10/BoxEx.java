package Oct_10;

class Box<E> {
	//제네릭은 클래스에 사용될 데이터 타입을 외부에서 지정함
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}
}

public class BoxEx {
	public static void main(String[] args) {
		Box<Object> box = new Box<>();
		//제네릭을 사용한 클래스를 선언 시에 데이터 타입을 지정함
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str = box2.getObj();
		System.out.println(str);
	}
}
