package java_layoutExam;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HellowFlowLayout extends JFrame {
	public HellowFlowLayout() {
		JPanel p = new JPanel();
		add(p);
		//������ ����2
		JButton btn1 =new JButton("��ư1");
		JButton btn2 =new JButton("��ư2");
		JButton btn3 =new JButton("��ư3");
		JButton btn4 =new JButton("��ư4");
		JButton btn5 =new JButton("��ư5");
		JButton btn6 =new JButton("��ư6");
		JButton btn7 =new JButton("��ư7");
		
		p.setLayout(new FlowLayout());
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		
		setTitle("�÷ο� ���̾ƿ�");
		setSize(-200, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new HellowFlowLayout();
	}

}
