package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 * 이벤트를 처리하기 위한 클래스
 */
//1. XXXListener를 구현
public class UseActionListenerEvent implements ActionListener {

	//UseActionListenerDesign에서 이벤트 받아와야 해서 인스턴스변수로 선언
	private UseActionListenerDesign uald; //인스터스변스-파란
	private JTextField JTextField;
	
	//2. 디자인 클래스와 has a 관계를 설정
	public UseActionListenerEvent(UseActionListenerDesign uald) {//지역변수 갈색
		this.uald=uald;
	}
	//3. 이벤트가 발생했을 때 처리할 method를 Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		//JTextField에 입력된 값을 받아와서
		JTextField jtf=uald.getJtf();
		String message=jtf.getText();
		System.out.println(message);

		//값이 있다면
		if( !message.isEmpty()) {
			
		}//end if
		//JTextArea에 추가하고
		uald.getJta().append(message+ "\n");
		//JTextField의 값을 초기화 한다.
		jtf.setText(" ");//초기화
		
	}//actionPerformed
}//class
