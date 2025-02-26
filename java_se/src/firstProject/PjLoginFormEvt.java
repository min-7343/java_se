package firstProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 주의 : 마우스 리스너 없앴음
 * 
 * mapLoginData : 데이터가 저장된 map
 * 
 * loginB : 확인 버튼
 * 
 * <아이디 관련>
 * jtfId: 아이디 입력하는곳
 * flagId : boolean - 아이디 확인(있는지)
 * 지역변수 id : id -String
 * 
 * <비밀번호 관련>
 * jpfPass : 패스워드 필드
 * flagPass : 패스워드의 유무 / 정확한 값인지 확인
 * 지역변수 pass : 패스워드 - String
 * sbPass : StringBuilder로 받은 패스워드필드
 * 
 * 
 */
public class PjLoginFormEvt extends WindowAdapter implements ActionListener {

	private PjLoginForm pj;
	private Map<String, String> mapLoginData;

	private JTextField jtfId;
	private JPasswordField jpfPass;
	private JButton loginB;

	private boolean flagId; // ID Flag
	private boolean flagPass; // PsaaWord Flag

	public PjLoginFormEvt(PjLoginForm pj) {
		this.pj = pj;
		jtfId = pj.getJtfId();
		jpfPass = pj.getJpfPass();
		loginB = pj.getLoginB();

		mapLoginData = new LinkedHashMap<>();
		mapLoginData.put("admin", "1234");
		mapLoginData.put("root", "1111");
		mapLoginData.put("administrator", "12345");
	}

	// ID 확인
	public boolean idChk() {
		String id = jtfId.getText().trim(); // 빈칸 지우기
		flagId = !id.isEmpty(); // ID 비어있지 않지?

		if (flagId) { // 값이 있다면
			jpfPass.requestFocus(); // 패스워드 필드로 커서 옮겨
		} else {
			JOptionPane.showMessageDialog(null, "아이디를 확인하세요");
			jtfId.requestFocus(); // 아니면 비밀번호 커서에서 아이디로 가.
		}
		return flagId;
	}

	// 바밀번호 확인
	public boolean passChk() {
		if (!idChk())
			return false; // 얼리 리턴.ID확인이 true가 아니면 돌아가, return false

		// 입력받은 패스워드
		StringBuilder sbPass = new StringBuilder();
		sbPass.append(jpfPass.getPassword());
		String pass = sbPass.toString();
		System.out.println(pass);
		pass = pass.trim();

		if (pass.isEmpty()) {
			JOptionPane.showMessageDialog(null, "비밀번호를 확인하세요");
			jpfPass.requestFocus();
			return false;
		} // end if

		String id = jtfId.getText().trim(); // 아이디값
		// 린크맵 -> 사용해서 아이디 비번 맞추기 (key - values)
		flagPass = mapLoginData.containsKey(id) && mapLoginData.get(id).equals(pass);

		if (flagPass) {
			return flagPass;
		}else {
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호를 확인하세요");
			jtfId.setText("");
			jpfPass.setText("");
			return passChk();
		}

	}// passChk

	//확인버튼
	public boolean okayB() {
		if (flagId && flagPass) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호를 확인하세요");
			jtfId.setText("");
			jpfPass.setText("");
			return idChk();
		} // else
	}// okayB

	public void windowClosing() {
		pj.dispose();
	}// windowClosing

	@Override
	public void windowClosing(WindowEvent we) {
		windowClosing();
	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();

		if (obj == loginB) {
			if (passChk()) {
				JOptionPane.showMessageDialog(null, "로그인에 성공했습니다");
				new AnalysisMonitor(pj);
				windowClosing();
			} // end if안
		} // end if밖
	}// actionPerformed
}// class
