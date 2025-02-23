package day0221_homework;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

/**
 * 메모장 도움말 > 메모장 정보
 */
@SuppressWarnings("serial")
public class MemoInfoDialog extends JDialog {
	
	private MemoDesign md;
	public MemoInfoDialog(MemoDesign md) {
		
		super(md,"메모장 정보",true);
		//줄내리는 부분 찾기
		JPanel jpl=new JPanel();
		JTextArea jta=new JTextArea("Java 메모장 Version1.0이 메모장을 KPL(KangPubulic License)로서 아무나 가져다 변횐 및 배초 가능합니다."
				+ "\n편하게 가져다 사용해주세요.");

		JButton closeBt = new JButton("닫기");
		jta.setWrapStyleWord(true);//단어단위로 줄내리기
		jta.setLineWrap(true);//텍스트가 영역을 넘기면 줄바꿈
		
		setLayout(new FlowLayout());
		jpl.add("Center",jta);
		add(jpl);
		add(closeBt);
		/////////////////닫기 버튼 이벤트 등록///////////
		MemoInfoDialogEvt mideB= new MemoInfoDialogEvt(this);
		addWindowFocusListener(mideB);
		closeBt.addActionListener(mideB);
		////////////////////////////////////////////////
		jta.setSize(180,180);
		
		setBounds(md.getX()+100, md.getY()+100, 200, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
	}//MemoInfoDialog

}//class
