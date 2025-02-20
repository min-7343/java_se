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

public class LoginFormEvt extends WindowAdapter implements ActionListener {

	private LoginForm lf;
	private Map<String, String> mapLoginData;

	private JTextField jtfId;
	private JPasswordField jpfPass;
	private JLabel jlblOutput;

	public LoginFormEvt(LoginForm lf) {
		this.lf = lf;
		// 필요한 컴포넌트를 인스턴스 변수(사용할 컴포넌트)에 할당
		jtfId = lf.getJtfId();
		jpfPass = lf.getJpfPass();
		jlblOutput = lf.getJlblOutput();

		// 로그인에 사용되는 데이터 셋 - 이렇게 넣으면 위험하다
		mapLoginData = new HashMap<String, String>();
		mapLoginData.put("kim", "1234");
		mapLoginData.put("park", "Park2025");
		mapLoginData.put("lee", "4321");
		mapLoginData.put("hong", "h_1234");
	}// LoginFormEvt

	@Override
	public void windowClosing(WindowEvent e) {
		lf.dispose();
	}// windowClosing

	private boolean idChk() { // 잘 모르겠으면 public
		boolean flag = false;
		String id = jtfId.getText().trim();// 앞뒤 공백 없애기trim- 앞뒤공백을 제거하여 아이디를 저장

		flag = !id.isEmpty();// 아이디가 비어있지 않니??

		if (flag) {// 아이디에 값이 있는 경우
			jpfPass.requestFocus();// 커서를 패스워드로 이동
		} else {// 아이디가 empty("")인 경우
			jlblOutput.setText("아이디는 필수입력 입니다!");
			jtfId.requestFocus();// 커서를 아이디 입력으로 이동
		} // end if

		// 리턴은 순수하게 값만 내보내게 하는 것이 좋다.
		return flag;
	}// idChk

	private void passChk() {//얼리리턴 사용하기 => 가독성 향상
		// 아이디가 없으면 동작하면 안된다.
		if (!idChk()) {// 아이디가 없다면 //가독성 향상, 중복코드 줄이기
			return; // 호출한 곳으로 돌아가
		}
		// char[]을 하나의 문자열로 만들어서 저장 => String 에서 제공하는 모은 기능을 사용할 수 있다.
		String pass = new String(jpfPass.getPassword());// 패스워드 체크할래
		System.out.println(pass);
		//////////////////// 비밀번호 입력 되었는지 확인///////////////////////
		if (pass.isEmpty()) {// 비밀번호가 없음
			jlblOutput.setText("비밀번호 필수 입력");
			jpfPass.requestFocus();
			return; // 없으면 돌아가
		}//end if
		
		// 아이디와 비밀번호 있음
		// 로그인 수행
		String id = jtfId.getText(); // id를 받아오는 곳
		String msg="아이디나 비번 확인";
		if (mapLoginData.containsKey(id) && mapLoginData.containsValue(pass)) {
			msg="로그인 성공.";
		}// end if
		jlblOutput.setText(msg);
		
	}// passChk

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jtfId) {
			this.idChk(); // 인스턴스 변수는 매번 자기 자신을 부른다.( this가 깔려있다)
		} // end if
		if (ae.getSource() == jpfPass) {
			this.passChk();
		}
	}// actionPerformed

}// class
