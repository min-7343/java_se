package day0217;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MyTest1 extends JFrame{
	public MyTest1() {
		super("Hello");
		JLabel helloTitle =new JLabel("Hello, Wolrd",JLabel.CENTER);
		helloTitle.setBackground(Color.DARK_GRAY);
		helloTitle.setOpaque(true);
		helloTitle.setFont(new Font("맑은 고딕",Font.BOLD,20));
		helloTitle.setForeground(Color.white);
		
		JP
		JLabel jltb= new  JLabel("Title");
		JTextField jtfd = new JTextField(15);
		
		
		add("North",helloTitle);
		add(jltb);
		add(jtfd);
		setBounds(50,100,400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {

		new MyTest1();
	}

}
