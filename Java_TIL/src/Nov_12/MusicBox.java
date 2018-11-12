package Nov_12;

public class MusicBox {
	public synchronized void playMusicA() {
	}
	public synchronized void playMusicB() {
	}
	public synchronized void playMusicC() {
	}
}

class MusicPlayer extends Thread {
	int type;
	MusicBox musicbox;
	
	public MusicPlayer(int type, MusicBox musicbox) {
		this.type = type;
		this.musicbox = musicbox;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(type + " ");
		}
		switch (type) {
		case 1: musicbox.playMusicA(); break;
		case 2: musicbox.playMusicB(); break;
		case 3: musicbox.playMusicC(); break;
		}
	}
}