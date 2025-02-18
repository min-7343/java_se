package day0217;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class TestTitledBorder extends JFrame {
	public TestTitledBorder() {
		super("로그인");
		//컴포넌트 선언 및 생성
		
		//- 라벨 만들기 + 디자인
		JLabel jlblTitle=new JLabel("로그인",JLabel.CENTER);
		jlblTitle.setFont(new Font("맑은 고딕",Font.BOLD,30));
		//-JPanel 만들기(구역나누기) 
		JPanel jpCenter =new JPanel(); 
		jpCenter.setLayout(new GridLayout(3,1)); //3행1열
		jpCenter.setBorder(new TitledBorder("입력정보"));//네모박스의 이름
		
		JTextField jtfId=new JTextField();//1행
		JPasswordField jpfPass=new JPasswordField();//2행
		JLabel jlblOutput=new JLabel();//3행
		
		Font font=new Font("맑은 고딕",Font.BOLD,20);
		// 컴포넌트들에게 동일한 폰트를 설정
		jtfId.setFont(font);
		jpfPass.setFont(font);
		jlblOutput.setFont(font);
		
		//border
		//TitledBorder-타이틀 넣을 수 있다.
		jtfId.setBorder(new TitledBorder("아이디"));
		jpfPass.setBorder(new TitledBorder("비밀번호"));
		//LineBorder-색을 넣을 수 있다.
		jlblOutput.setBorder(new LineBorder(Color.red));
		
		jpCenter.add(jtfId);
		jpCenter.add(jpfPass);
		jpCenter.add(jlblOutput);
		
		//레이아웃 설정
		
		//배치
		add("North",jlblTitle);
		add("Center",jpCenter);
		//윈도우크기설정
		setBounds(50,100,300,250);
		//가시화
		setVisible(true);
		//윈도우 종료처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//TestTitledBorder
	public static void main(String[] args) {
		new TestTitledBorder();
	}//main

}//class
