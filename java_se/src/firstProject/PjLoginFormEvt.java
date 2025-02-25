package firstProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PjLoginFormEvt extends WindowAdapter implements ActionListener,MouseListener{

	private PjLoginForm pj;
	private Map<String, String> mapLoginData;

	private JTextField jtfId;
	private JPasswordField jpfPass;
	private JButton loginB;
	
	private boolean flagB; //확인버튼
	private boolean flagId; //Id
	private boolean flagPass; //password
	
	
	public PjLoginFormEvt(PjLoginForm pj) {
		
		this.pj=pj;
		jtfId = pj.getJtfId();
		jpfPass = pj.getJpfPass();
		loginB = pj.getLoginB();
		
		mapLoginData =new LinkedHashMap<String, String>();
		mapLoginData.put("admin", "1234");
		mapLoginData.put("root", "1111"); //2번 문서 생성할 권한 없음
		mapLoginData.put("administrator", "12345");
		
	}//PjLoginFormEvt

	public boolean idChk() {
		System.out.println("idChk()에 들어옴");
		flagId = false;
		String id = jtfId.getText().trim();// 앞뒤 공백 없애기trim- 앞뒤공백을 제거하여 아이디를 저장
		flagId = !id.isEmpty();// 아이디가 비어있지 않니??
		if (flagId) {// 아이디에 값이 있는 경우
			jpfPass.requestFocus();// 커서를 패스워드로 이동
		} else {
			jtfId.requestFocus();// 커서를 아이디 입력으로 이동
		} // end if

		// 리턴은 순수하게 값만 내보내게 하는 것이 좋다.
		return flagId;
	}// idChk
	
	public void passChk() {

		flagPass=false;
		
		if (!idChk()) {// 아이디가 없다면 
			return; 
		}
		// char[]을 하나의 문자열로 만들어서 저장 => String 에서 제공하는 모은 기능을 사용할 수 있다.
		String pass = new String(jpfPass.getPassword());// 패스워드 체크할래
		System.out.println(pass);
		//////////////////// 비밀번호 입력 되었는지 확인///////////////////////
		if (pass.isEmpty()) {// 비밀번호가 없음
			jpfPass.requestFocus();
			return; // 없으면 돌아가
		}//end if
		
		// 아이디와 비밀번호 있음
		// 로그인 수행
		String id = jtfId.getText(); // id를 받아오는 곳
		
		String msg="아이디와 비밀번호를 확인하세요";
		
		if (mapLoginData.containsKey(id) && mapLoginData.containsValue(pass)) {
			msg="로그인 성공.";
			flagPass=true;
		}// end if
		JOptionPane.showMessageDialog(null,msg);
	}// passChk
	
	public boolean okayB() {
		flagB=false;
		
		if(flagId && flagPass) {
			flagB =true;
			return flagB;
		}else {
			JOptionPane.showMessageDialog(null,"아이디나 비밀번호를 확인하세요");
			return idChk();
		}
		//아이디 검사
		//비번 검사
		//버튼 눌리면 둘 다 체그
		//통과-> 1번
		//틀림 -> 다시 로그인창
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj=ae.getSource();
		
		if(obj ==loginB) { // 확인 버튼에서 id pass 일치하면 true
			this.okayB();
			//1번창으로 가기
		}//end if
		if (obj == jtfId) {
			System.out.println("아이디입력하러감");
			this.idChk();
			System.out.println("아이디입력됨");
		} // end if
		if (obj == jpfPass) {
			System.out.println("비번입력하러감");
			this.passChk();
		}
	}// actionPerformed

	@Override
	public void mouseClicked(MouseEvent me) {
		Object objM=me.getSource();
		
		if(objM ==loginB) { // 확인 버튼에서 id pass 일치하면 true
			this.okayB();
			//1번창으로 가기
		}
		if (objM == jtfId) {
			System.out.println("아이디입력하러감");
			this.idChk();
			System.out.println("아이디입력됨");
		} // end if
		if (objM == jpfPass) {
			System.out.println("비번입력하러감");
			this.passChk();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {
	
	}
	
}
