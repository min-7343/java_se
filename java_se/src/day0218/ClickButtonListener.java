package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClickButtonListener implements ActionListener{
	private RadioButtonDesign rbd;

	public ClickButtonListener(RadioButtonDesign rbd) {//디자인에서 받아온 값
		this.rbd=rbd;
	}//ClickButtonListener
	public void actionPerformed(ActionEvent ae) {//할 이벤트
		//JTextArea에 입력된 값을 받아와서
		JTextArea jtext=rbd.getJtextArea();
		//버튼이 눌리면
		if(rbd.getMaleButton().isSelected()) { //디자인에서 받아온 값을 해야 하니깐!!rbd!!
			jtext.append("남자\n");
		}else {
			jtext.append("여자\n");
		}
		
	}//actionPerformed

}//class
