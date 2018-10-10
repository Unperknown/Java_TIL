import java.util.Scanner;

public class ArrayLengthTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[5];
		int sum = 0;
		
		for (int a : array) {
			array[a] = scan.nextInt();
			sum += array[a];
		}
		
		System.out.println((double)sum / array.length);
		
		scan.close();
	}

}
