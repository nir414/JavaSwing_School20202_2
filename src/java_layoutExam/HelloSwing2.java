package java_layoutExam;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;

public class HelloSwing2 extends JFrame{
	public static void main(String[] args) {
		//������ ����2
		JFrame jf = new JFrame();
		jf.setTitle("�ȳ�, ����!");
		jf.setLocation(500, 200);
		jf.setSize(400, 300);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		while(true){
			System.out.println(jf.getX());
		}
	}
}