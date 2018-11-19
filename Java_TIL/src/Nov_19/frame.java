package Nov_19;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame extends JFrame {
	Map<String, JTextField> context = new HashMap<>();
	
	public frame() {
 		setTitle("프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(5, 2);
		c.setLayout(grid);
		grid.setVgap(5);
		
		String[] label = { "이름", "학번", "학과", "과목" };
		
		for (String string : label) {
			context.put(string, new JTextField(""));
		}
		
		for (String target : context.keySet()) {
			c.add(new JLabel(target));
			c.add(context.get(target));
		}
		
		JButton input = new JButton("입력");
		c.add(input);
		
		JTextField output = new JTextField();
		c.add(output);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = "";
				for (JTextField jTextField : context.values()) {
					str += jTextField.getText() + " ";
					jTextField.setText("");
				}
				
				output.setText(str);
			}
		});
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new frame();
	}
}
