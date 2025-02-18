package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClickButtonListener implements ActionListener{
	private RadioButtonDesign rbd;
	private String selectedGender;//성별 선택시 데이터 물력할 문자열
	private JTextArea jtextArea;
	private JRadioButton maleButton;
	private JRadioButton femaleButton;
	
	public ClickButtonListener(RadioButtonDesign rbd) {
		this.rbd=rbd;
	}//ClickButtonListener
	public void actionPerformed(ActionEvent ae) {//할 이벤트
		//JTextField에 입력된 값을 받아와서
		String selectedGender="";
		//버튼이 눌리면
		if(maleButton.isSelected()) {
			jtextArea.append("남자\n");
		}else {
			selectedGender="여자";
		}
		
	}//actionPerformed

}//class
