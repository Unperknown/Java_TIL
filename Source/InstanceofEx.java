package _917;

public class InstanceofEx {
	public static void main(String[] args) {
		Book b = new Book();
		Book c = new Comic();
		Book n = new Novel();
		Book ls = new LoveStory();
		
		System.out.println(c instanceof Book);
	}
}

class Book {}
class Comic extends Book {}
class Novel extends Book {}
class LoveStory extends Novel {}