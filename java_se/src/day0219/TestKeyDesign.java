package day0219;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 윈도우 이벤트 처리와 키보드 이벤트 처리
 */
//1.윈도우 이벤트를 처리하기위해 WindowListener를 구현
@SuppressWarnings("serial")
public class TestKeyDesign extends JFrame  {// x를 눌렀을 때 효과있다.

	private JTextField jtf;
	public TestKeyDesign() {
		super("윈도우 이벤트 처리");
		
		jtf=new JTextField();
		jtf.setBorder(new TitledBorder("입력"));
		add("Center",jtf);
		
		//키보드이벤트 등록
		
		jtf.addKeyListener(new TestKeyEvt(this));//이벤트가 발생하면 TestKeyEvt로가서 할거야
		
		
		//발생된 윈도우 이벤트를 등록
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); //inner class는 밖의 클래스의 자원을 마음대로 쓸 수 있다.
			}
		});
		
		setBounds(100,100,400,300);
		setVisible(true);
	
	}//TestKeyDesign
	
	//getter 만들기
	public JTextField getJtf() {
		return jtf;
	}

	public static void main(String[] args) {
		new TestKeyDesign();

	}//main

}//class
