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
			System.out.println("메뉴 선택해주세요\n1: 추가 2: 목록 확인 3: 삭제  4: 종료");
			switch (Integer.parseInt(scan.nextLine())) {
			case 1:
				System.out.print("제목 입력\n<< ");
				String title = scan.nextLine();
				System.out.print("저자 입력\n<< ");
				String author = scan.nextLine();
				System.out.print("ISBN 코드 입력\n<< ");
				String ISBN = scan.nextLine();
				System.out.print("가격 입력\n<< ");
				int price = Integer.parseInt(scan.nextLine());

				bookShelf.put(quantity, new Book(title, author, ISBN, price));
				break;
			case 2:
				System.out.println("목록이 이렇대요");
				for (Book book : bookShelf.values()) {
					System.out.println(book.getTitle() + " by " + book.getAuthor() + ", " + book.getPrice() + "원, " + book.getISBN());
				}
				break;
			case 3:
				System.out.println("삭제할 책의 번호를 입력해주세요!");
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
