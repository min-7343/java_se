package firstProject;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PjLoginForm extends JFrame{
	
	public PjLoginForm() {
		super("로그인창");
		
		JLabel jlblId=new JLabel("로그인");
		JLabel jlblPass=new JLabel("비밀번호");
		JButton loginB=new JButton("로그인");
		
		JTextField jtfId=new JTextField(15);
		JTextField jtfPass=new JTextField(15);
		
		setLayout(null);
		jlblId.setBounds(getX()+50,getY()+ 110,80,80);
		jtfId.setBounds(getX()+150,getY()+ 130,180,30);
		jlblPass.setBounds(getX()+50,getY()+ 150,80,80);
		jtfPass.setBounds(getX()+150,getY()+ 180,180,30);
		loginB.setBounds(getX()+110,getY()+ 250,180,30);
		add(jlblId);
		add(jtfId);
		add(jtfPass);
		add(jlblPass);
		add(loginB);
		setBounds(50,50,400,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new PjLoginForm();
	}

}
