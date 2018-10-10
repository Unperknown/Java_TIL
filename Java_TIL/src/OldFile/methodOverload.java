import java.util.Scanner;

class Sum {
	public double getResult(double m, double n) {
		return m + n;
	}
	
	public double getResult(double a, double b, double c) {
		return a + b + c;
	}
}

public class methodOverload {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Sum addCalculate = new Sum();
		
		System.out.println(addCalculate.getResult(scan.nextDouble(), scan.nextDouble()));
	}
}