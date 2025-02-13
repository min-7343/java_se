package day0213;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * has a 관계로 Window component 사용
 */
public class FrameHasA {

	//2. 생성자에서 외부에서 생성된 Window Component 객체를 받는다.
	public FrameHasA(JFrame frame) {
		//3. 일반 Component 생성
		JButton jbtn =new JButton("나는 버튼이야");
		//4.생성된 일반 Component를 윈도우 Component에 배치(add)
		//is a 관계 : 그냥 add
		//has a 관계 : frame.add
		frame.add(jbtn);
		//5.크기 설정
		frame.setSize(400,250); //윈도우엔 없고 frame엔 있다.
		//6.사용자에게 보여주기
		frame.setVisible(true); //윈도우엔 없고 frame엔 있다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//FrameHasA
	
	public static void main(String[] args) {
		//1. 외부에서 Window Component가 생성되고 
		JFrame jf=new JFrame("has a 관계로 Window Component 사용");
		new FrameHasA(jf);
		
		

	}//main

}//class
