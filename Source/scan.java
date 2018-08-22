import java.util.Scanner;

public class scan{
	public static void main(String[] argc){
		System.out.println("Enter your personal information.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Your name is " + name + ".");
		
		String city = scanner.next();
		System.out.println("You live in " + city + ".");
		
		int age = scanner.nextInt();
		System.out.println("You're " + age + " old.");
		
		double weight = scanner.nextDouble();
		System.out.println("Your weight is " + weight + ".");
		
		boolean isStudent = scanner.nextBoolean();
		System.out.println(isStudent ? "You are student." : "You are NOT student.");
		
		scanner.close();
	}
}
		