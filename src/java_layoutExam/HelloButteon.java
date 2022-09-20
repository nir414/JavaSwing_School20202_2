package java_layoutExam;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButteon extends JFrame{
	public HelloButteon() {
		//변경점 저장2
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		add(p);
		
		JButton btn = new JButton("버튼");
		p.add(btn);
		
		setTitle("안녕 버튼");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//1. new 생성자()로 윈도우 프로그램 실행 시키기
		new HelloButteon();
	}
}