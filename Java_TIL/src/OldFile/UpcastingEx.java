package _917;

class Person {
	String name, id;
	
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade, department;
	
	public Student(String name) {
		super(name);
	}
}
public class UpcastingEx {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("ȫ�浿");
		p = s;
		
		System.out.println(p.name);
	}
}
