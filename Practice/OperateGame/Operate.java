import java.util.Scanner;

class Operate {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int op1 = scan.nextInt();
		int op2 = scan.nextInt();
		
		Sum sum = new Sum();
		Subtract sub = new Subtract();
		Multiple mult = new Multiple();
		Divide divi = new Divide();
		
		System.out.println("+: " + sum.add(op1, op2) + " -: " + sub.subtract(op1, op2) + " *: " + mult.mul(op1, op2) + " /: " + divi.div(op1, op2));
		scan.close();
	}
}