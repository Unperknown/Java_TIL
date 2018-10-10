package Oct_10;

class Box<E> {
	//���׸��� Ŭ������ ���� ������ Ÿ���� �ܺο��� ������
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
		//���׸��� ����� Ŭ������ ���� �ÿ� ������ Ÿ���� ������
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str = box2.getObj();
		System.out.println(str);
	}
}
