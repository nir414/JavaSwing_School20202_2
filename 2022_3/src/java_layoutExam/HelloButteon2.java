package java_layoutExam;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButteon2 extends JFrame{
	public HelloButteon2() {
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		add(p);
		
		
		//������ ����2
		JButton btn = new JButton("��ư");
		p.add(btn);
		JButton btn1 = new JButton("��ư");
		p.add(btn1);
		
		setTitle("�ȳ� ��ư");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//1. new ������()�� ������ ���α׷� ���� ��Ű��
		new HelloButteon2();
	}
}