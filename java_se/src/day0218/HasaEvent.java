package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 이벤트 처리에 집죽
 */
//1. XXXListener 구현
public class HasaEvent implements ActionListener{

	//2. 생성자에서 Design 클래스를 입력 받는다( has a )
	public HasaEvent(HasaDesign hasAdesign) {
		
	}//HasaEvent

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Has  a 관계로 이벤트를 처리!!");
		
	}//actionPerformed
}
