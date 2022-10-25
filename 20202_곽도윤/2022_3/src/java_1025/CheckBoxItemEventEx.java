package java_1025;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {
	JLabel jl1 = new JLabel("사과100원, 배500원, 체리2000원");
	
	JCheckBox jc1 = new JCheckBox("사과");
	JCheckBox jc2 = new JCheckBox("배");
	JCheckBox jc3 = new JCheckBox("체리");

	JLabel jl2 = new JLabel("현제 0원 입니다.");
	
	int price = 0;
	
	public CheckBoxItemEventEx() {
		// TODO Auto-generated constructor stub
		JPanel p = new JPanel();
		add(p);

		p.add(jl1);
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		p.add(jl2);
		
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		
		//
		setTitle("텍스트 영역 만들기");
		setSize(250,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getItem() == jc1) {
			if(e.getStateChange() == ItemEvent.SELECTED)
				price+=100;
			else if (e.getStateChange() == ItemEvent.DESELECTED)
				price-=100;
		}
		if(e.getItem() == jc2) {
			if(e.getStateChange() == ItemEvent.SELECTED)
				price+=500;
			else if (e.getStateChange() == ItemEvent.DESELECTED)
				price-=500;
		}
		if(e.getItem() == jc3) {
			if(e.getStateChange() == ItemEvent.SELECTED)
				price+=2000;
			else if (e.getStateChange() == ItemEvent.DESELECTED)
				price-=2000;
		}
		
		jl2.setText("현제 "+price+"원 입니다");
		
	}

}
