package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * MainWindow의 이벤트를 처리하기위한 has a 관계의 클래스
 */
public class MainWindowEvt extends WindowAdapter implements ActionListener {

	private MainWindow mw;
	
	public MainWindowEvt(MainWindow mw) { //has a 관계
		this.mw=mw;
	}//MainWindowEvt
	
	private void windowClosing() {//windowClosing오버로딩- 윈도우 닫기 전처리 하기 위해(수정못하게)
		//윈도우를 종료하기 전에 처리해야할 코드
		mw.dispose();
	}//WindowClosing
	
	@Override
	public void windowClosing(WindowEvent we) {//윈도우 이벤트
		windowClosing();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {//액션이벤트
		if(ae.getSource()==mw.getJmiSubwin()) {//다이얼로그 실행
			new SubWin(mw);//다이얼로그를 실생
		}//end if
		if(ae.getSource()==mw.getJmiClose()) {//윈도우 종료
			windowClosing();
		}//end if
		
	}//actionPerformed

}//class
