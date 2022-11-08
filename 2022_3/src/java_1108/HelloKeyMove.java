package java_1108;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloKeyMove extends JFrame implements KeyListener{
	
	JPanel p = new JPanel();
	JLabel lb = new JLabel("Hello");

	public HelloKeyMove() {
		
		p.setLayout(null);
		add(p);
		
		lb.setSize(30,20);
		lb.setLocation(150-30,125-20);
		lb.setOpaque(true);
		lb.setBackground(Color.pink);
		
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
		
	}
	
	public static void main(String[] args) {
		new HelloKeyMove();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int KeyCode = e.getKeyCode();
		
		switch (KeyCode) {
		case KeyEvent.VK_UP :
			lb.setLocation(lb.getX(), lb.getY() - 5);
			break;
		case KeyEvent.VK_DOWN :
			lb.setLocation(lb.getX(), lb.getY() + 5);
			break;
		case KeyEvent.VK_RIGHT :
			lb.setLocation(lb.getX() + 5, lb.getY());
			break;
		case KeyEvent.VK_LEFT :
			lb.setLocation(lb.getX() - 5, lb.getY());
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + KeyCode);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
