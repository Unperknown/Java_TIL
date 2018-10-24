package Oct_24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		Map<Integer, Book> bookShelf = new HashMap<Integer, Book>();
		Scanner scan = new Scanner(System.in);
		
		int quantity = 1;
		
		while (true) {
			System.out.println("�޴� �������ּ���\n1: �߰� 2: ��� Ȯ�� 3: ����  4: ����");
			switch (Integer.parseInt(scan.nextLine())) {
			case 1:
				System.out.print("���� �Է�\n<< ");
				String title = scan.nextLine();
				System.out.print("���� �Է�\n<< ");
				String author = scan.nextLine();
				System.out.print("ISBN �ڵ� �Է�\n<< ");
				String ISBN = scan.nextLine();
				System.out.print("���� �Է�\n<< ");
				int price = Integer.parseInt(scan.nextLine());

				bookShelf.put(quantity, new Book(title, author, ISBN, price));
				break;
			case 2:
				System.out.println("����� �̷����");
				for (Book book : bookShelf.values()) {
					System.out.println(book.getTitle() + " by " + book.getAuthor() + ", " + book.getPrice() + "��, " + book.getISBN());
				}
				break;
			case 3:
				System.out.println("������ å�� ��ȣ�� �Է����ּ���!");
				bookShelf.remove(Integer.parseInt(scan.nextLine()));
				break;
			case 4:
				scan.close();
				System.exit(0);
				break;
			}
			quantity++;
		}

	}

}
