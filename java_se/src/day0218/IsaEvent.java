package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * is a 관계로 Window Component 사용
 */
//1. 윈도우 컴포넌트를 상속받음 
//e> 1.발생된 Event를 처리할 수 있는 XXXListener 구현.- 버튼누르면 창 닫기
public class IsaEvent extends JFrame implements ActionListener{
	public IsaEvent() {
		super("Is a 관계로 Event처리");
		//2,e> 일반 컴포넌트 생성
		JButton jbtn=new JButton("클릭해 보세요!");
		//e>3. 컴포넌트에서 이벤트를 발생할 수 있도록 이벤트에 등록 
		jbtn.addActionListener(this);
		
		//3.컴포넌트를 윈도우 컴포넌트에 배치
		add(jbtn); //상속의 장점 : 코드의 재사용성 부모것은 내것처럼 쓴다.
		//4. 윈도우의 크기를 설정
		setSize(300,500);
		//5.사용자에게 보여주기
		setVisible(true);
		//6.윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//IsaEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("is a 관계로 이벤트를 처리합니다.");
	}
	
	
	
	public static void main(String[] args) {
		new IsaEvent();

	}//main

}//class
