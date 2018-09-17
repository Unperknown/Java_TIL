import java.util.Scanner;

public class WordGame {
	private Scanner scan;
	private String startWord = "아버지";
	private Player[] players;
	
	public WordGame() {
		scan = new Scanner(System.in);
	}
	
	private void createPlayers() {
		System.out.print("몇 명이서 하시겠습니까?\n<<");
		int num_of_player = scan.nextInt();
		scan.nextLine();
		players = new Player[num_of_player];
		
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
			System.out.print(i + ": 플레이어 이름을 입력해주세요.\n<<");
			players[i].setName(scan.nextLine());
		}
	}
	
	public void run() {
		System.out.println("끝말잇기 게임을 시작하겠습니다!");
		createPlayers();
		String lastWord = startWord;
		
		System.out.println(lastWord + " 단어부터!");
		int curr_player = 0;
		
		while (true) {
			System.out.print(players[curr_player].getName() + "\n<<");
			String newWord = players[curr_player].getWord();
			if (!players[curr_player].checkSuccess(lastWord)) {
				System.out.print(players[curr_player].getName() + "이 졌습니다...");
				break;
			}
			curr_player++;
			curr_player %= players.length;
			lastWord = newWord;
		}
	}
	public static void main(String[] args) {
		WordGame game = new WordGame();
		game.run();
	}

}

class Player {
	private Scanner scan;
	private String name, word;
	
	public Player() {
		this("Anonymous");
	}
	
	public Player(String name) {
		this.name = name;
		scan = new Scanner(System.in);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWord() {
		word = scan.nextLine();
		return word;
	}
	
	public boolean checkSuccess(String lastWord) {
		return lastWord.charAt(lastWord.length() - 1) == word.charAt(0);
	}
}