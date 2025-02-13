package day0213;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * is a 관계로 Window Component 사용
 */
//1. 윈도우 컴포넌트를 상속받음 
public class FrameIsA extends JFrame {
	public FrameIsA() {
		super("Is a 관계로 Window Component 사용");
		//2. 일반 컴포넌트 생성
		JButton jbtn=new JButton("나는 버튼 <@333<");
		//3.컴포넌트를 윈도우 컴포넌트에 배치
		add(jbtn); //상속의 장점 : 코드의 재사용성 부모것은 내것처럼 쓴다.
		//4. 윈도우의 크기를 설정
		setSize(300,500);
		//5.사용자에게 보여주기
		setVisible(true);
		//6.윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//FrameIsA

	public static void main(String[] args) {
		new FrameIsA();

	}//main

}//class
