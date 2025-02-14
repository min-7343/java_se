package day0214;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 격자 레이아웃(GridLayout) 과 컴포넌트 
 */
@SuppressWarnings("serial")
//윈도우에서 상속받기
public class UseGridLayout extends JFrame {

	public UseGridLayout() {
		super("GridLayout연습");
		//2.컴포넌트를 생성
		JButton jbtn=new JButton("버튼 1");
		JButton jbtn2=new JButton("버튼 2");
		JButton jbtn3=new JButton("버튼 3");
//		JButton jbtn4=new JButton("버튼 4");
//		JButton jbtn5=new JButton("버튼 5");
//		JButton jbtn6=new JButton("버튼 6");
		
		
		
		//3.배치관리자 설정하여 컴포넌트를 배치
		setLayout(new GridLayout(2,3)); //BorderLayout -> GridLayout
		
		add(jbtn);
		add(jbtn2);
		add(jbtn3);
//		add(jbtn4);
//		add(jbtn5);
//		add(jbtn6);
		
		
		
		//4.윈도우 크기 설정
		setSize(400,200);
		//5.사용자에게 보여주기
		setVisible(true);
		//6.종료처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//UseGridLayout
	public static void main(String[] args) {
		new UseGridLayout();

	}//main

}//class
