import java.util.Scanner;

public class upAndDown {

	public static void main(String[] args) {
		int down, up, round, answer, player_ans;

		Scanner scan = new Scanner(System.in);
		
		do {
			down = 0;
			up = 99;
			round = 0;
			answer = (int)(Math.random() * 100);
			
			do {
				System.out.println("수를 결정하였습니다. 맞추어 보세요");
				System.out.println(down + "-" + up);
				System.out.print(round++ + ">>");
				player_ans = scan.nextInt();
				if (player_ans == answer) break;
				else if (player_ans > answer) {
					up = player_ans;
					System.out.println("더 낮게");
				}
				else {
					down = player_ans;
					System.out.println("더 높게");
				}
			} while (true);
			
			scan.nextLine();
			System.out.println("맞았습니다.");
			System.out.println("다시 하시겠습니까?(y/n)>>");
		} while ((scan.nextLine()).equals("y"));
		
		scan.close();
	}
}