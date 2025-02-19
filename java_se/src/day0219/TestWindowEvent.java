package day0219;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * 윈도우 이벤트 처리
 */
//1.윈도우 이벤트를 처리하기위해 WindowListener를 구현
public class TestWindowEvent extends JFrame implements WindowListener {// x를 눌렀을 때 효과있다.

	public TestWindowEvent() {
		super("윈도우 이벤트 처리");
		
		//발생된 윈도우 이벤트 등록
		addWindowListener(this);
		setBounds(100,100,400,300);
		setVisible(true);
		//JFrame이 아니라서 창닫기 안해도 된다.-> 작동 안함
	}
	public static void main(String[] args) {
		new TestWindowEvent();
		new TestWindowEvent2();

	}//main
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing-닫히는 중이에요~ ");
//		System.exit(0);//바로 닫힘
		dispose();//현재 윈도우 객체를 닫고 종료 상태로 이동
		//windowClosed로 넘어간다.
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
		
	}


}//class
