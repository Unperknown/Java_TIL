package Nov_21;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InformationMenu extends JFrame{
	private Map<String, JTextField> input = new HashMap<>();
	private String[] label = { "이름", "학번", "학과", "과목" };
	private String studentList = "";
	
	public InformationMenu() {
		for (String string : label) {
			input.put(string, new JTextField(""));
		}
		
		setTitle("학생 정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		
		JPanel inputSection = new JPanel();
		inputSection.setLayout(new GridLayout(5, 2));
		
		for (String label : input.keySet()) {
			inputSection.add(new JLabel(label));
			inputSection.add(input.get(label));
		}
		container.add(inputSection, BorderLayout.NORTH);
		
		JPanel outputSection = new JPanel();
		outputSection.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton button = new JButton("저장");
		JTextArea text = new JTextArea("", 7, 20);
		outputSection.add(button);
		outputSection.add(text);
		
		container.add(outputSection, BorderLayout.SOUTH);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (JTextField box : input.values()) {
					studentList += box.getText() + " ";
					box.setText("");
				}
				studentList += "\n";
				text.setText(studentList);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new InformationMenu();
	}
}
