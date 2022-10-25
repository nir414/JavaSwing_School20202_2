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

	JLabel lbId = new JLabel("���̵�", JLabel.CENTER);
	JLabel lbPwd = new JLabel("��й�ȣ", JLabel.CENTER);
	
	JButton btnLogin = new JButton("�α���");
	JButton btnCencel = new JButton("���");
	
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();

	JLabel lbResult = new JLabel("������", JLabel.LEFT);
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
					lbResult.setText(strId + "�� ����� "+strPwd+"�Դϴ�");
				else 
					lbResult.setText("PSWD�� �Է��ϼ���");
			}
			else 
				lbResult.setText("ID�� �Է��ϼ���");
		}
		if(e.getSource() == btnCencel) {
			lbResult.setText("����Ͽ����ϴ�.");
			tfId.setText("");
			tfPwd.setText("");
		}
	}
}
