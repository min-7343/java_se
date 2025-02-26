package day0221_homework;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;
import javax.swing.JList;

public class FontInfoDialogEvt extends WindowAdapter implements MouseListener {

	private FontInfoDialog fi;
	private String selectFont;
	
	private int styleInt;
	private int sizeInt;
	
	private Font font;
	//private JList<FontVO> fList;
	

	public FontInfoDialogEvt(FontInfoDialog fi) {
		this.fi = fi;
	}
	//ObjectStream - 쓰기, 읽기 => 폰트 설정이 끄고 나서도 유지 될 수 있도록 
	
//	public void savePointFont(JList<FontVO> fList) {
//		
//	}
//	
	
	
	//미리보기창 update 하는 곳
	public void updateFont(JList<String> fontJLisView, JList<String> styleJLisView, JList<String> sizeJLisView,
			JLabel viewChar) {
		//선택한 인덱스
		int selectFontIndex = fi.getFontListView().getSelectedIndex();
		int selectStyleIndex = fi.getStyleListView().getSelectedIndex();
		int selectSizeIndex = fi.getSizeListView().getSelectedIndex();
		//선택한 인텍스에 있는 값
		selectFont = fi.getFontListView().getModel().getElementAt(selectFontIndex);
		String selectStyle = fi.getStyleListView().getModel().getElementAt(selectStyleIndex);
		String selectSize = fi.getSizeListView().getModel().getElementAt(selectSizeIndex);

		styleInt = Font.PLAIN; //기본설정 스타일
		
		//폰트 - 따로 설정 하지 않아도 적용됨
		
		/////////글씨체 있는지 확인//////

		// 스타일
		switch (selectStyle) {
		case "일반":
			styleInt = Font.PLAIN;
			break;
		case "굵게":
			styleInt = Font.BOLD;
			break;
		case "기울임꼴":
			styleInt = Font.ITALIC;
			break;
		case "굵은 기울임꼴":
			styleInt = Font.BOLD | Font.ITALIC;
			break;
		} // switch
		
		//크기
		sizeInt = Integer.parseInt(selectSize);
		
		// 각 텍스트필드에 출력
		fi.getFontT().setText(selectFont);
		fi.getStyleT().setText(selectStyle);
	    fi.getSizeT().setText(selectSize);
	    
		//선택한것 반영
		font =new Font(selectFont,styleInt,sizeInt);
		fi.getViewChar().setFont(font);
		
		
	}// updateFont

	/////////// 취소버튼////////////////////
	public void windowClosing() {
		fi.dispose();
	}

	@Override
	public void windowClosing(WindowEvent we) {
		windowClosing();
	}
	////////////////////////////////////

	/////////////마우스 이벤트////////////////////////////////
	@Override
	public void mouseClicked(MouseEvent me) {
		Object fobjt = me.getSource();

		if (fobjt == fi.getFontListView() || fobjt == fi.getStyleListView()
				|| fobjt == fi.getSizeListView()) {
		
			updateFont(fi.getFontListView(), fi.getStyleListView(), fi.getSizeListView(), fi.getViewChar());
		}//if
		
		//확인버튼 - 다시 해보기
		if (fobjt == fi.getOkayB()) {
			font = new Font(selectFont,styleInt,sizeInt);
			fi.getMd().getJtaMemo().setFont(font);
			windowClosing();
//			
//			//확인 버튼을 누르고 나면 설정된 폰트가 ObjectOutputStream에 쓰여야 한다.
//			ObjectOutputStream oosF=null;
//			//<쓰기>
//			//파일생성
//			File textFile=new File("c:/dev/temp/textFile.txt");
//			File fontFile=new File("c:/dev/temp/fontFile.txt");
//			//파일에 적힌 text 저장
//			FontVO fontVO =new FontVO(selectFont,styleInt,sizeInt);
//			
//			//다른 파일에 지정된 font 저장
//
//			//그럼 여기서 JList를 설정해 보자.-> savePointFont
//			
		}
		//취소버튼
		if (fobjt == fi.getCancleB()) {
			windowClosing();
		}

	}// mouseClicked

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
