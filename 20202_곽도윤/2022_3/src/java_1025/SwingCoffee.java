package java_1025;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingCoffee extends JFrame implements ItemListener{
	JCheckBox jc1 = new JCheckBox("아메리카노");
	JCheckBox jc2 = new JCheckBox("라떼");
	JCheckBox jc3 = new JCheckBox("블랙커피");
	
	JTextArea ta = new JTextArea(12, 42);
	JScrollPane sp = new JScrollPane(ta);
	
	SwingCoffee() {
		JPanel p = new JPanel();
		add(p);
		
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		p.add(sp);

		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		
		//
		setTitle("Tlvkfkfkdkf");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingCoffee();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.SELECTED) {
			ta.append(((AbstractButton)e.getItem()).getText()+"가 선택되었습니다.\n");
		}
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			ta.append(((AbstractButton)e.getItem()).getText()+"가 해제되었습니다.\n");
		}
	}
}