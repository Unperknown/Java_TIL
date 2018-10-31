package Oct_31;

import java.util.Scanner;

public class Exception_Ex {

	public static void main(String[] args) {
		int key = 0;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter one character: ");
			key = scan.nextLine().charAt(0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(key);
		}
		
		int age = 0;
		
		try {
			System.out.print("What is your age? ");
			age = Integer.parseInt(scan.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Age: " + age);
		}
	}

}
