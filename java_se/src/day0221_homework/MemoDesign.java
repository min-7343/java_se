package day0221_homework;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 메인메모장 디자인
 */
@SuppressWarnings("serial")
public class MemoDesign extends JFrame {
	
	private JMenuBar jmb; 
	//JMenuItem
	private JMenuItem jmiNew; //새글
	private JMenuItem jmiOpen;//열기
	private JMenuItem jmiSave;//저장
	private JMenuItem jmiClose;//종료
	
	private JMenuItem jmiFont;//글꼴
	private JMenuItem jmiMemoInfo;//메모장 정보

	private JTextArea jtaMemo;//글을 쓰기 위한 JTextArea
	private JScrollPane jspJtaMemo; //스크롤바있는 메모장
	
	private Font font;
	
	public MemoDesign() {
		super("메모장");
		
		//메뉴바
		jmb =new JMenuBar();
		JMenu jmFile=new JMenu("파일"); //새글, 열기, 저장, 새이름으로 저장, 닫기
		JMenu jmEdit=new JMenu("서식");//글꼴
		JMenu jmHelp=new JMenu("도움말");//메모장 정보 배치
		//파일에 들거갈 것들
		jmiNew = new JMenuItem("새글");
		jmiOpen= new JMenuItem("열기");
		jmiSave = new JMenuItem("저장");
		jmiClose= new JMenuItem("종료");
		//서식에 들어갈 것들
		jmiFont=new JMenuItem("글꼴");
		//도움말에 들거갈것들
		jmiMemoInfo =new JMenuItem("메모장 정보");
		//메모하는 부분
		jtaMemo = new JTextArea();

		
		//메뉴바add
		add("North",jmb);
		jmb.add(jmFile);
		jmb.add(jmEdit);
		jmb.add(jmHelp);
		
		//파일 add
		jmFile.add(jmiNew);
		jmFile.addSeparator();
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiClose);
		
		//서식 add
		jmEdit.add(jmiFont);
		
		//도움말 add
		jmHelp.add(jmiMemoInfo);
		
		//메모부분스크롤바
		add(new JScrollPane(jtaMemo));
		
		/////////////이벤트 등록/////////////
		MemoDesignEvt mde =new MemoDesignEvt(this);
		addWindowListener(mde);
		///////////////////////////////////////
		jmiNew.addActionListener(mde);//1-1.새글
		jmiOpen.addActionListener(mde);//1-2.열기
		jmiSave.addActionListener(mde);//1-3.저장
		jmiClose.addActionListener(mde);//1-4.닫기
		//2-1 서식-글꼴
		jmiFont.addActionListener(mde);
		jmiMemoInfo.addActionListener(mde);//3-1.도움말 > 메모장 정보
		///////////////////////////////////
		setBounds(50,50,500,500);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	//////////////getter////////////////
	public JMenuBar getJmb() {
		return jmb;
	}

	public JMenuItem getJmiNew() {
		return jmiNew;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiClose() {
		return jmiClose;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiMemoInfo() {
		return jmiMemoInfo;
	}

	public JTextArea getJtaMemo() {
		return jtaMemo;
	}

	public JScrollPane getJspJtaMemo() {
		return jspJtaMemo;
	}

	public void setJtaMemo(JTextArea jtaMemo) {
		this.jtaMemo = jtaMemo;
	}

	public void setJspJtaMemo(JScrollPane jspJtaMemo) {
		this.jspJtaMemo = jspJtaMemo;
	}


	
}
