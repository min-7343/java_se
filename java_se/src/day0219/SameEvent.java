package day0219;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFileChooser;

public class SameEvent extends WindowAdapter implements ActionListener {
	private SameEventDesign sed;
	
	
	//alt shift s -> 생성자 만들어진다.
	public SameEvent(SameEventDesign sed) { //has a 관계
		this.sed=sed;
	}//SameEvent
	
	@Override
	public void windowClosing(WindowEvent we) {
		sed.dispose(); //dispose메소드를 사용할 수 있다.
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
//		String label=ae.getActionCommand();
//		if(label.equals("파일다이얼로그 열기")) {
//			System.out.println("열기버튼을 클릭");
//		}//end if
//		if(label.equals("파일다이얼로그 저장")) {
//			System.out.println("저장버튼을 클릭");
//		}//end if
		//이벤트를 발생시킨 객체의 주소를 얻기
		Object obj=ae.getSource();//Object은 모든 것을 받아 담을 수 있다.
		if(obj == sed.getJbtnOpen()) {
//			System.out.println("열기 클릭");	
			FileDialog fdOpen=new FileDialog(sed,"몰래 열어봐",FileDialog.LOAD);
			fdOpen.setVisible(true);
			//꼭 부모윈도우가 필요하다.-> this(X), 
			
			//선택한 파일의 경로 얻기
			String diretory=fdOpen.getDirectory();
			//선택한 파일명 얻기
			String file=fdOpen.getFile();
//			System.out.println(diretory + file);
			//타이틀바에 선택한 파일의 경로와 파일명을 추가
//			sed.setTitle(diretory + file);//또 nullnull나옴
			//타이틀 바 이름 설정
			if(diretory !=null) {
				sed.setTitle(diretory + file);
			}
		}
		
		if(obj == sed.getJbtnSave()) {
//			System.out.println("저장 클릭");
//			FileDialog fdSave=new FileDialog(sed,"잊지말고 저장해",FileDialog.SAVE);
//			fdSave.setVisible(true);
			//꼭 부모윈도우가 필요하다.-> this(X), 
			
			JFileChooser jfcSave=new JFileChooser();
			jfcSave.showSaveDialog(sed); //저장모드가 열린다.//이쁜것 쓰면 된다.
			//파일 디렉토리와 파일명을 타이틀바에 출력
			//내가 저장할 파일명을 적어야 한다.
			
			sed.setTitle(jfcSave.getSelectedFile().toString());
			
//			System.out.println(jfcSave.getSelectedFile()); //디렉토리랑 파일명이 같이 나온다.
			
			
			
		}
		
	}//actionPerformed

}//class
