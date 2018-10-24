package Oct_24;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		String number, name, major, contact;

		while (true) {
			String chooseMenu = scan.nextLine();
			switch (Integer.parseInt(chooseMenu)) {
			case 1:
				number = scan.nextLine();
				name = scan.nextLine();
				major = scan.nextLine();
				contact = scan.nextLine();
				list.add(new Student(number, name, major, contact));
				break;
			case 2:
				for (Student student : list) {
					System.out.println(student.getNumber() + " " + student.getName() + " " + student.getMajor() + " " + student.getContact());
				}
				break;
			case 3:
				String deleteNumber = scan.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getNumber().equals(deleteNumber))
						list.remove(i);
				}
				break;
			case 4:
				System.exit(-1);
				scan.close();
				break;
			}
		}
	}
}
