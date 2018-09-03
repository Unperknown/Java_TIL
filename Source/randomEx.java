import java.util.Random;

public class randomEx {

	public static void main(String[] args) {
		Random r = new Random();
		
		int randNum = (int)(Math.random() * 100);
		
		System.out.println(r.nextInt(100));
		System.out.println(randNum);
	}

}
