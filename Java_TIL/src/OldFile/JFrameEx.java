package _917;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameEx extends JFrame {
	public JFrameEx() {
		setTitle("300x300 Ω∫¿Æ «¡∑π¿”");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		Container container = getContentPane();
		container.setBackground(Color.ORANGE);
		container.setLayout(new FlowLayout());
		container.add(new JButton("Hello, World!"));
		setVisible(true);
	}
	public static void main(String[] args) {
		JFrameEx frame = new JFrameEx();
	}
}
