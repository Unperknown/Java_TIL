import java.util.Scanner;

public class RSPGame {
	public static void main(String[] args){
		method func = new method();
		Scanner scan = new Scanner(System.in);
		String p1, p2;
		p1 = scan.nextLine();
		p2 = scan.nextLine();
		int stat = func.isStat(func.isBoard(p1), func.isBoard(p2));
		
		System.out.println(func.WinnerRet(stat));
		scan.close();
	}
}