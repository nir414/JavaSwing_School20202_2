package java_1108;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloKetEnter extends JFrame implements KeyListener{
	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("<Enter> 키로 색 변경");
	
	public HelloKetEnter() {
		
		add(p);
		p.add(lb);
		
		p.addKeyListener(this);
		
		//
		setTitle("키이벤트");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//
		p.setFocusable(true);
		p.requestFocus();
		lb.setOpaque(true);
		lb.setBackground(new Color(0,0,0,0));
	}

	public static void main(String[] args) {
		new HelloKetEnter();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char KeyChar = e.getKeyChar();
		
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		switch (KeyChar) {
		case '\n':
			lb.setText("R="+r+", G= "+g+", B="+b);
			lb.setForeground(new Color(256-r,256-g,256-b)); 
			p.setBackground(new Color(r,g,b));
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + KeyChar);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
