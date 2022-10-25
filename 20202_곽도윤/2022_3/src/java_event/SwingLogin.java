package java_event;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingLogin extends JFrame implements ActionListener{
	ImageIcon img = new ImageIcon("images/robot.PNG");
	JLabel lbImage = new JLabel(img);

	JLabel lbId = new JLabel("아이디", JLabel.CENTER);
	JLabel lbPwd = new JLabel("비밀번호", JLabel.CENTER);
	
	JButton btnLogin = new JButton("로그인");
	JButton btnCencel = new JButton("취소");
	
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();

	JLabel lbResult = new JLabel("결과출력", JLabel.LEFT);
	//
	SwingLogin(){
		setTitle("SwingLogin");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//
		JPanel p = new JPanel();
		
		add(lbImage, BorderLayout.NORTH);
		
		p.setLayout(new GridLayout(0, 2));
		add(p, BorderLayout.CENTER);
		
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnCencel);
		p.add(lbResult);
		
		add(lbResult, BorderLayout.SOUTH);
		
		btnLogin.addActionListener(this);
		btnCencel.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingLogin();
	}
//
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin) {
			String strId = tfId.getText();
			String strPwd = new String(tfPwd.getPassword());
			
			if (strId.length() != 0) {
				if(strPwd.length() != 0) 
					lbResult.setText(strId + "의 비번은 "+strPwd+"입니다");
				else 
					lbResult.setText("PSWD를 입력하세요");
			}
			else 
				lbResult.setText("ID를 입력하세요");
		}
		if(e.getSource() == btnCencel) {
			lbResult.setText("취소하였습니다.");
			tfId.setText("");
			tfPwd.setText("");
		}
	}
}
