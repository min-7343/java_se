package day0219;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 * 윈도우 이벤트 처리
 */
//1.윈도우 이벤트를 처리하기위해 WindowListener를 구현
@SuppressWarnings("serial")
public class TestWindowAdapter extends JFrame  {// x를 눌렀을 때 효과있다.

	public TestWindowAdapter() {
		super("윈도우 이벤트 처리");
		
		addWindowListener(new TestWindowAdapterEvt(this));
		
		setBounds(100,100,400,300);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new TestWindowAdapter();

	}//main

}//class
