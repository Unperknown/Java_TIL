package Nov_21;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private Map<String, JButton> buttons = new HashMap<>();
	private JTextField inputBox = new JTextField(30);
	private JTextField outputBox = new JTextField(30);
	private String[] label = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "C", "E",
		"+", "-", "*", "/" };
	private String expression = "";
	
	public Calculator() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (String operate : label) {
			buttons.put(operate, new JButton(operate));
			buttons.get(operate).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String buttonText = ((JButton) e.getSource()).getText();
					if (buttonText.contains("C")) {
						inputBox.setText("");
						outputBox.setText("");
						expression = "";
					} else if (buttonText.contains("E")) {
						inputBox.setText("");
						outputBox.setText(expression);
						expression = "";
					} else {
						expression += operate + " ";
						inputBox.setText(expression);
					}
				}
			});
		}
		
		Container container = getContentPane();
		
		JPanel upperSec = new JPanel();
		upperSec.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		upperSec.add(new JLabel("입력"));
		upperSec.add(inputBox);
		
		container.add(upperSec, BorderLayout.NORTH);
		
		JPanel middleSec = new JPanel();
		middleSec.setLayout(new GridLayout(4, 4));
		
		for (JButton button : buttons.values()) {
			middleSec.add(button);
		}
		container.add(middleSec, BorderLayout.CENTER);
		
		JPanel lowerSec = new JPanel();
		lowerSec.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		lowerSec.add(new JLabel("출력"));
		lowerSec.add(outputBox);
		container.add(lowerSec, BorderLayout.SOUTH);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
