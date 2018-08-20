import java.util.Scanner;

public class operateGame {
	public static void main(String[] argc){
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(add(a, b));
		
		scan.close();
	}
	public static int add(int ope1, int ope2){
			return ope1 + ope2;
	}
}