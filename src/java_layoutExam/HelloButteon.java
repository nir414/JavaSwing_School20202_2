package java_layoutExam;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButteon extends JFrame{
	public HelloButteon() {
		//������ ����2
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		add(p);
		
		JButton btn = new JButton("��ư");
		p.add(btn);
		
		setTitle("�ȳ� ��ư");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//1. new ������()�� ������ ���α׷� ���� ��Ű��
		new HelloButteon();
	}
}