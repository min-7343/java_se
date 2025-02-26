package day0221_homework;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFileChooser;

/**
 * 메인 메모장 Evt - 파일 서식 도움말
 */
public class MemoDesignEvt extends WindowAdapter implements ActionListener {

	private MemoDesign md;

	public MemoDesignEvt(MemoDesign md) {
		this.md = md;
	}

	/////////////////// 4번 종료 시작///////////////
	private void windowClosing() {
		md.dispose();
	}// WindowClosing

	@Override
	public void windowClosing(WindowEvent we) {// 윈도우 이벤트
		windowClosing();
	}// windowClosing/
		//////////////// 4번 종료 끝/////////////////

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		
		/////////////// 1.파일 /////////////////////
		if (obj == md.getJmiNew()) {// 새글
			md.getJtaMemo().setText("");
		}
		if (obj == md.getJmiOpen()) {// 열기
			JFileChooser jfcOpen = new JFileChooser();
			// 파일경로
			jfcOpen.showOpenDialog(md);
			String roteOpen = jfcOpen.getSelectedFile().toString();
			md.setTitle("열기 " + roteOpen);
		}
		if (obj == md.getJmiSave()) {// 저장
			JFileChooser jfcSave = new JFileChooser();
			// 파일경로
			jfcSave.showSaveDialog(jfcSave);
			String roteSave = jfcSave.getSelectedFile().toString();
			md.setTitle("저장 " + roteSave);
		}

		if (obj == md.getJmiClose()) {// 종료
			windowClosing();
		}
		
		/////////////// 2.서식///////////////
		if (obj == md.getJmiFont()) {
			new FontInfoDialog(md);
		}
		/////////////// 3.도움말///////////////
		if (obj == md.getJmiMemoInfo()) {
			new MemoInfoDialog(md);
		}

	}
}
