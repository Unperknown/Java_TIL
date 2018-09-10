import java.util.Scanner;

class Book {
	String title, author;
	
	public Book() {
		this("Unknown", "Anonymous");
	}
	
	public Book(String title) {
		this(title, "Anonymous");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void getInfo() {
		System.out.println(title + " by " + author);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book[] book = new Book[2];
		for (int i = 0; i < book.length; i++) {
			book[i] = new Book();
			
			System.out.print("제목>>");
			book[i].title = scan.nextLine();
			
			System.out.print("저자>>");
			book[i].author = scan.nextLine();
			
			book[i].getInfo();
		}
	}
}
