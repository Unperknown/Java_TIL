import java.util.Scanner;

public class operateGame {
	public static void main(String[] argc){
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(add(a, b));// + " " + subtract(a, b) + " " + multiple(a, b) + " " + divide(a, b));
		
		scan.close();
	}
	public static int add(int a, int b){
			return a + b;
	}
	public static int subtract(int a, int b){
			return a > b ? a - b : b - a;
	}
	public static int multiple(int a, int b){
			return a * b;
	}
	public static int divide(int a, int b){
			return b == 0 ? 0 : a / b;
	}
}