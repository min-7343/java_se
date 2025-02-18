package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * is a 관계로 Window Component 사용
 */
//1. 윈도우 컴포넌트를 상속받음 

public class HasaDesign extends JFrame{
	public HasaDesign() {
		super("Is a 관계로 Event처리");
		//2일반 컴포넌트 생성
		JButton jbtn=new JButton("클릭해 보세요!");
		//디자인 클래스와 이벤트 처리 클래스의 관계를 설정
		HasaEvent hae=new HasaEvent(this); // this-HasaDesign 클래스
		
		//3. 컴포넌트에서 이벤트를 발생할 수 있도록 이벤트에 등록하고,
		//이벤트가 발생했을 때 처리할 곳(jbtn 발생-> hae 처리)을 기술한다.
		jbtn.addActionListener(hae);
//		jbtn.addActionListener(this);
		
		//3.컴포넌트를 윈도우 컴포넌트에 배치
		add(jbtn); //상속의 장점 : 코드의 재사용성 부모것은 내것처럼 쓴다.
		//4. 윈도우의 크기를 설정
		setSize(300,500);
		//5.사용자에게 보여주기
		setVisible(true);
		//6.윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//HasaEvent

	public static void main(String[] args) {
		new HasaDesign();

	}//main

}//class
