package Oct_24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		try {
			File file = new File("library.txt");
			
			Map<Integer, Book> bookShelf = new HashMap<Integer, Book>();
			Scanner scan = new Scanner(System.in);
			
			int quantity = 1;
			
			while (true) {
				System.out.println("�޴� �������ּ���\n1: �߰� 2: ��� Ȯ�� 3: ����  4: ���Ͽ� �ֱ� 5: ���� ��� 6: ����");
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
					PrintStream fpr = new PrintStream(file);
					for (Book book : bookShelf.values()) {
						fpr.println(book.getTitle() + " by " + book.getAuthor() + ", " + book.getPrice() + "��, " + book.getISBN());
					}
					fpr.close();
					break;
				case 5:
					BufferedReader fbuf = new BufferedReader(new FileReader(file));
					String buf;
					while ((buf = fbuf.readLine()) != null) {
						System.out.println(buf);
					}
					break;
				case 6:
					scan.close();
					System.exit(0);
					break;
				}
				quantity++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
