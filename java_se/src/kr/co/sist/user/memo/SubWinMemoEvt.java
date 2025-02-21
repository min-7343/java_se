package kr.co.sist.user.memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SubWinMemoEvt extends WindowAdapter implements ActionListener {

	private SubWinMemo sm;
	
	public SubWinMemoEvt(SubWinMemo sm ) {
		this.sm=sm;
		
	}
	
	
	//////닫기이벤트///
	public void windowClosing() {
		sm.dispose();
	}
	@Override
	public void windowClosing(WindowEvent e) {
		windowClosing();
	}
	////닫기 이벤트////

	@Override
	public void actionPerformed(ActionEvent sme) {
		
		if(sme.getSource()== sm.getSubjb()) {
			windowClosing();
		}
	}

}
