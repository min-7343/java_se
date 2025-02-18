package day0218;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UseIcon extends JFrame {
	public UseIcon() {
		super("이미지 연습");
		//1. ImageIcon 생성
		
		ImageIcon ii=new ImageIcon("C:/Users/user/git/Ssang_yong/java_se/src/day0218/images/img1.png");
		ImageIcon ii2=new ImageIcon("C:/Users/user/git/Ssang_yong/java_se/src/day0218/images/img2.png");
		ImageIcon ii3=new ImageIcon("C:/Users/user/git/Ssang_yong/java_se/src/day0218/images/img3.png");
		ImageIcon ii4=new ImageIcon("C:/Users/user/git/Ssang_yong/java_se/src/day0218/images/img4.png");
		//역슬레시 ctrl + f => \\ -> /
		//Component와 has a 설정
		
		JButton jbtn = new JButton("우는차차",ii);
		JButton jbtn2 = new JButton("웃는차차",ii2);
		JButton jbtn3 = new JButton("보는차차",ii3);
		
		
		//풍선도움말 설정
		jbtn.setToolTipText("울고 있는 차차! 세라비 선생님");
		jbtn2.setToolTipText("웃고 있는 차차! 세라비 선생님");
		jbtn3.setToolTipText("응시하는 차차! 세라비 선생님");
		
		//버튼 라벨 이동
		//수직
		jbtn.setVerticalTextPosition(JButton.TOP); //TOP, Cener,Bottom
		
		//수평
		jbtn2.setHorizontalTextPosition(JButton.CENTER); //Left, center, Right
		jbtn3.setVerticalTextPosition(JButton.BOTTOM); //TOP, Center,Bottom
		jbtn3.setHorizontalTextPosition(JButton.CENTER); //Left, center, Right
		
		//RollOver
		jbtn3.setRolloverIcon(ii4);
		
		setLayout(new GridLayout(1,3));

		
		add(jbtn);
		add(jbtn2);
		add(jbtn3);
		
				
				
		setBounds(200,200,1200,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//UseIcon
	
	public static void main(String[] args) {
		new UseIcon();

	}//main

}//class
