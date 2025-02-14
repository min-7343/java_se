package day0214;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 * 개발자가 컴포넌트의 크기와 배치위치를 직접 설정하는 배치 관리자
 */
@SuppressWarnings("serial")
public class UseAbsolutePositioning extends JFrame{
	
	public UseAbsolutePositioning() {
		super("수동배치");
		
		JButton jbtn=new JButton("나는 버튼이야");
		JComboBox<String> jcb=new JComboBox<String>();
		jcb.addItem("Java SE");
		jcb.addItem("Oracle DBMS");
		jcb.addItem("JTBC");
		jcb.addItem("CSS");
		jcb.addItem("Java Script");
		
		JPasswordField jtf =new JPasswordField();//비밀번호를 입력하기 위해서 만들어진 Compnentt
		JPasswordField jpf =new JPasswordField();//비밀번호를 입력하기 위해서 만들어진 Compnentt
		
		
		//배치관리자를 해제
		setLayout(null);
		//컴포넌트의 크기 설정
		jbtn.setSize(200,80);
		//컴포넌트의 위치 설정
		jbtn.setLocation(100,50);
		
		jcb.setBounds(300,200,250,60);
		jpf.setBounds(470,350,180,50);
		
		
		//배치
		add(jbtn);
		add(jcb);
		add(jpf);
		//윈도우의 크기를 설정
//		setLocation(100, 50); //창이 어디서 뜨는지 하는 것
//		setSize(800,600);
		//위 두줄 합해서
		setBounds(100,50,800,600);
		
		//가시화
		setVisible(true);
		//종료처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
		
	}//UseAbsolutePositioning
	
	
	public static void main(String[] args ) {
		new UseAbsolutePositioning();	
		
		
	}//main

}//class
