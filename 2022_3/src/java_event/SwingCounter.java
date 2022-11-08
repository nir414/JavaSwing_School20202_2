package java_event;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingCounter extends JFrame implements ActionListener{
	JLabel L1 = new JLabel("카운터: ");
	JTextField T1 = new JTextField("0", 5);
	JButton btn1 = new JButton("증가");
	JButton btn2 = new JButton("감소");
	JButton btn3 = new JButton("초기화");
	////
	SwingCounter() {
		setTitle("낑에에에엑");
		setSize(350, 80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//
		JPanel p = new JPanel();
		//p.setLayout(new GridLayout(0, 5));
		add(p);
		p.add(L1);
		p.add(T1);
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		//
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		//
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingCounter();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int count = Integer.parseInt(T1.getText().trim());
		if(e.getSource() == btn1) {
			//count += 1;
			T1.setText(Integer.toString(++count));
		}
		if(e.getSource() == btn2) {
			//count -= 1;
			T1.setText(Integer.toString(--count));
		}
		if(e.getSource() == btn3) {
			T1.setText(Integer.toString(count=0));
		}
	}
}

















