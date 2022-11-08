package java_1108;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxEvt extends JFrame implements ActionListener{
	
	String coffee[] = {"아메리카노", "라떼", "카푸치노", "에스프레소"};
	JComboBox<String> combo = new JComboBox<String>(coffee);
	
	ImageIcon img[] = {	new ImageIcon("images/2/ame.jpg"),
						new ImageIcon("images/2/latte.jpg"),
						new ImageIcon("images/2/capu.jpg"),
						new ImageIcon("images/2/es.jpg") };
	
	JLabel lb = new JLabel();
	
	public ComboBoxEvt() {
		
		add(combo, BorderLayout.NORTH);
		add(lb, BorderLayout.CENTER);
		
		lb.setIcon(img[combo.getSelectedIndex()]);
		
		combo.addActionListener(this);
		
		//
		setTitle("커피주문");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxEvt();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == combo) {
			lb.setIcon(img[combo.getSelectedIndex()]);
		}
	}

}
