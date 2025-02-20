package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 다이얼 로그 '닫기' 버튼 누르면 닫아지는 이벤트
 */
public class SubWinEvt extends WindowAdapter implements ActionListener {

	private SubWin sw;
	
	public SubWinEvt(SubWin sw) {//has a 관계
		this.sw=sw;
	}//SubWinEvt
	@Override
	public void windowClosing(WindowEvent e) {
		sw.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		sw.dispose();

	}//actionPerformed

}//class
