package day0219;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TLoginFormEvt extends WindowAdapter implements ActionListener {
	private LoginForm lf;
	private Map<String,String> mapLoginData; // 한번만 쓰여서

	public TLoginFormEvt(LoginForm lf) {
		this.lf=lf;
		mapLoginData=new HashMap<String,String>();
		mapLoginData.put("Kim","1234");
		mapLoginData.put("park","park2025");
		mapLoginData.put("lee","4321");
		mapLoginData.put("hong","h_1234");
	}//TLoginFormEvt
	
	@Override
	public void windowClosing(WindowEvent e) {
		lf.dispose();
	}//windowClosing

	private void loginProcess() {

		
		String id=jtfId.getText();
		if(id.isEmpty()) {
			jlblOutput.setText("id는 필수 입력");
			return;
		}//end if
		
		jpfPass.requestFocus();//커서를 비번입력으로 이동
		
		//jpfPass.getPassword()는 반환형이 char[]이므로 사요하기 불편
		//=>String 통합하여 저장하면 사용하기 편리
		String pass=new String (jpfPass.getPassword());
		if(pass.isEmpty()) {
			jlblOutput.setText("비번는 필수 입력");
			return;
		}
		
		
		
	}//
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		JTextField jtfId=lf.getJtfId();
		JPasswordField jpfPass =lf.getJpfPass();
		JLabel jlblOutput=lf.getJlblOutput();
		
		String id=jtfId.getText();
		if(id.isEmpty()) {
			jlblOutput.setText("id는 필수 입력");
			return;
		}//end if
		
		jpfPass.requestFocus();//커서를 비번입력으로 이동
		
		//jpfPass.getPassword()는 반환형이 char[]이므로 사요하기 불편
		//=>String 통합하여 저장하면 사용하기 편리
		String pass=new String (jpfPass.getPassword());
		if(pass.isEmpty()) {
			jlblOutput.setText("비번는 필수 입력");
			return;
		}
		
		
		if(ae.getSource()==lf.getJtfId()) {
			loginProcess();
		}
		if(ae.getSource()==lf.getPass()) {
			loginProcess();
		}
	}//actionPerformed

}
