package kr.co.sist.user.memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {
	
	private MemoDesign md;
	
	public JavaMemoEvt(MemoDesign md) {
		this.md=md;
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==md.getJmiMeoInfo()) {
			new SubWinMemo(md);
		}
		
	}

}
