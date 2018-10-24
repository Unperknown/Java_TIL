package Oct_24;

public class Book {
	private String author;
	private String title;
	private String ISBN;
	private int price;
	
	public Book(String title, String author, String ISBN, int price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
