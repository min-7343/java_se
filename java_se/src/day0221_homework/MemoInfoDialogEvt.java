package day0221_homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 도움말 > '메모장 정보' 닫기버튼 Evt
 */
public class MemoInfoDialogEvt extends WindowAdapter implements ActionListener {

	private MemoInfoDialog mid;
	
	public MemoInfoDialogEvt(MemoInfoDialog mid) {
		this.mid=mid;
	}
	
	
	public void windowClosing() {
		mid.dispose();
	}
	@Override
	public void windowClosing(WindowEvent we) {
		windowClosing();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		windowClosing();

	}

}
