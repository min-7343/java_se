package day0213;

import java.awt.Frame;
import java.awt.Window;

public class Test2 extends Window{ //사용자에게 보여주기 위한 OS에서 제공하는 판
	public Test2(Frame frame) {
		super(frame); // window와 frame은 has a 관계로 
			frame.setSize(300,300);
			frame.setVisible(true);
		}


	public static void main(String[] args) {
		//윈도우 위에 올라가서 사용되는, 사용자에게 기본 메뉴를 제공하는 컴포넌트 Frame
		Frame frame =new Frame("타이틀연습");
		new Test2(frame);
	}//main

}//class
