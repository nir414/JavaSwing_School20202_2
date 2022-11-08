package java_event;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelButtonEx extends JFrame{

	LabelButtonEx() {
		setTitle("LabelButtonEx");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("제임스 고슬링입니더");
		p.add(lb);
		
		ImageIcon img = new ImageIcon("images/gosling.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage);
		
		ImageIcon normalImg = new ImageIcon("images/normalIcon.gif");
		ImageIcon pressedImg = new ImageIcon("images/pressedIcon.gif");
		ImageIcon rolloverImg = new ImageIcon("images/rolloverIcon.gif");
		
		JButton btn = new JButton("call~", normalImg);
		btn.setPressedIcon(pressedImg);
		btn.setRolloverIcon(rolloverImg);
		p.add(btn);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelButtonEx();
	}

}
