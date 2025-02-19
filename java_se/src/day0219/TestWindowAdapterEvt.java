package day0219;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * XXXAdater 상속
 */
//WindowAdaper 클래스는 abstract method가 없음.-> 구현의 강제성 x=> 필요한 metohd만 오버라이드
public class TestWindowAdapterEvt extends WindowAdapter {

	private TestWindowAdapter twa;
	
	public TestWindowAdapterEvt(TestWindowAdapter twa){
		this.twa=twa;
	}
	@Override
	public void windowClosing(WindowEvent e) {
		
//		dispose();//내 상속 줄에는 Window가 없어 호출하지 못한다.(window-JFrame-myDesign)
		//has a 관계가 필요하다.
		//TestWindowAdapterEvt 클래스의 상속관계에서는 Window가 존재x
		twa.dispose(); //has a 관계
	}//windowClosing

}//class
