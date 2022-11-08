package java_1108;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioBtnItemEventEx extends JFrame implements ItemListener{
	
	JTextField arc = new JTextField(10);
	JTextField des = new JTextField(10);
	JLabel lb = new JLabel(">=>");
	
	JRadioButton rbtn1 = new JRadioButton("Decimal");
	JRadioButton rbtn2 = new JRadioButton("Binary");
	JRadioButton rbtn3 = new JRadioButton("Octal");
	JRadioButton rbtn4 = new JRadioButton("Hex");
	
	ButtonGroup bg = new ButtonGroup();

	public RadioBtnItemEventEx() {
		
		JPanel p = new JPanel();
		add(p);
		
		p.add(arc);
		p.add(lb);
		p.add(des);
		
		bg.add(rbtn1);
		bg.add(rbtn2);
		bg.add(rbtn3);
		bg.add(rbtn4);
		
		p.add(rbtn1);
		p.add(rbtn2);
		p.add(rbtn3);
		p.add(rbtn4);
		
		rbtn1.addItemListener(this);
		rbtn2.addItemListener(this);
		rbtn3.addItemListener(this);
		rbtn4.addItemListener(this);
		
		//
		setTitle("진수변환");
		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioBtnItemEventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = arc.getText().trim();
		int num = Integer.parseInt(str);
		
		if(e.getItem() == rbtn1) {
			des.setText(str);
		}
		if(e.getItem() == rbtn2) {
			String temp = Integer.toBinaryString(num);
			des.setText(temp);
		}
		if(e.getItem() == rbtn3) {
			String temp = Integer.toOctalString(num);
			des.setText(temp);
		}
		if(e.getItem() == rbtn4) {
			String temp = Integer.toHexString(num);
			des.setText(temp);
		}
	}

}
