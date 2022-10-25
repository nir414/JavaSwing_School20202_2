package java_event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComButton extends JFrame implements ActionListener{
	JPanel p1;
	JButton btn1;
	JButton btn2;
	
	public ComButton() {
		setTitle("ComButton");
		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		btn1 =new JButton("버튼1");
		btn2 =new JButton("버튼2");
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(btn1);
		p1.add(btn2);
		add(p1);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new ComButton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			p1.setBackground(Color.YELLOW);
		}
		if(e.getSource() == btn2) {
			p1.setBackground(Color.PINK);
		}
	}
}
