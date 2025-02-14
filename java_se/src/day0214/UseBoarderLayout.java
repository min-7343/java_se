package day0214;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * BoarderLayout(테두리레이아웃) 매니저와 Component의 모양
 */
@SuppressWarnings("serial")
//1.Window Component를 상속받는다.
//
public class UseBoarderLayout extends JFrame {
	public UseBoarderLayout() {
		super("BoarderLayout 연습");// Frame의 생성자호출 : 타이틀 바에 들어갈 메시지
		// 2.컴포넌트를 생성 : Jlabel 2개, JButton: 2개, JTextArea 1개
		JLabel jlblNorth=new JLabel("북쪽");
		JLabel jlblSouth=new JLabel("남쪽");
		
		JButton jbtnWest=new JButton("서쪽");
		JButton jbtnEest=new JButton("동쪽");
		
		JTextArea jtaCenter=new JTextArea("가운데");
		
		// 3.컴포넌트를 배치
		//배치관리자를 설정 (윈도우 분할하는 설정)
//		BorderLayout bl=new BoarderLayout();
//		setLayout(bl);
		setLayout(new BorderLayout()); //BoarderLayout의 특징 => window창의 크기조절
		
		//constant사용
		add(jlblNorth, BorderLayout.NORTH);
		add(jbtnWest, BorderLayout.WEST);
		add(jtaCenter,BorderLayout.CENTER);
		
		//문자열 상수 사용
		add(jlblSouth,"South");
		add(jbtnEest,"East");
		// 4.윈도우의 크기 설정(사용자에게 보여주기위한 크기 설정)
		setSize(400,400);
		
		// 5.윈도우를 보여주기 위한 설정.
		setVisible(true);
		// 6.윈도우의 종료처리(x버튼을 눌렀을 때 instance 소멸)
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}//UseBoarderLayout

	public static void main(String[] args) {
		new UseBoarderLayout();

	}// main

}// class
