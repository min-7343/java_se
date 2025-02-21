package kr.co.sist.user.memo;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MemoDesign extends JFrame {
	
	//이벤트 발생시 비교해야 할 컴포넌트는 class field에 선언
	private JMenuItem jmiNew;//파일 > 새글
	private JMenuItem jmiOpen;//파일 > 열기
	private JMenuItem jmiSave;//파일 > 저장
	private JMenuItem jmiNewSave;//파일 > 새이름으로 저장
	private JMenuItem jmiClose;//파일 > 닫기
	
	private JMenuItem jmiFont;//편집 > 글꼴
	
	private JMenuItem jmiMeoInfo;//도움말 > 메모장정보
	
	private JTextArea jtaMemo;//글을 쓰기 위한 JTextArea
	
	public MemoDesign() {
		super("메모장 - 제목 없음");
		
		//2.컴포넌트를 선언, 생성
		//3.메뉴바를 생성
		JMenuBar jmb= new JMenuBar();
		//4메뉴 생성
		JMenu jmFile=new JMenu("파일"); //새글, 열기, 저장, 새이름으로 저장, 닫기
		JMenu jmEdit=new JMenu("편집");//글꼴
		JMenu jmHelp=new JMenu("도움말");//메모장 정보 배치
		
		//5메뉴아이템 생성
		jmiNew=new JMenuItem("새글");//파일 > 새글
		jmiOpen=new JMenuItem("열기");//파일 > 열기
		jmiSave=new JMenuItem("저장");//파일 > 저장
		jmiNewSave=new JMenuItem("새이름으로 저장");//파일 > 새이름으로 저장
		jmiClose=new JMenuItem("닫기");//파일 > 닫기
		
		
		jmiFont=new JMenuItem("글꼴");//편집 > 글꼴
		
		jmiMeoInfo=new JMenuItem("메모장 정보");//도움말 > 메모장정보
		
		jtaMemo=new JTextArea();//글을 쓰기 위한 JTextArea
		JScrollPane jspJtaMmo =new JScrollPane(jtaMemo);
		
		jtaMemo.setFont(new Font("맑은 고딕", Font.PLAIN,14)); //써지는 Font지정. 사이즈
		
		//6배치관리자
		
		//7컴포넌트 배치
		jmFile.add(jmiNew);//새글
		jmFile.addSeparator();
		jmFile.add(jmiOpen);//열기
		jmFile.add(jmiSave);//저장
		jmFile.add(jmiNewSave);//새이름으로
		jmFile.add(jmiClose);//닫기
		
		jmEdit.add(jmiFont);
		
		jmHelp.add(jmiMeoInfo);
		//JTextArea 배치
		add(jspJtaMmo,"Center");// Center하나만 배치하면 E,W,S,N는 사라진다.
		
		//하위메뉴 연습 -> 하위 메뉴가 만들어진다.	
		JMenu jmTemp=new JMenu("하위메뉴");
		jmTemp.add( new JMenuItem ("하위1"));
		jmTemp.add( new JMenuItem ("하위2"));
		jmTemp.add( new JMenuItem ("하위3"));
		
		jmFile.add(jmTemp);
		
		
		
		//8메뉴아이템 메뉴배치
		
		
		
		//9메뉴를 메뉴바에 배치
		jmb.add(jmFile);
		jmb.add(jmEdit);
		jmb.add(jmHelp);
		//10메뉴바를 JFrame에 설정
		setJMenuBar(jmb);
		
		
		///////이벤트 등록/////
		JavaMemoEvt jve= new JavaMemoEvt(this);
		addWindowListener(jve);
		
		
		

		//윈도우 크기 설정
		setBounds(10,50,900,800);
		//가시화
		setVisible(true);
		//윈도우 종료처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}//MemoDesign

	public JMenuItem getJmiNew() {
		return jmiNew;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiNewSave() {
		return jmiNewSave;
	}

	public JMenuItem getJmiClose() {
		return jmiClose;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiMeoInfo() {
		return jmiMeoInfo;
	}

	public JTextArea getJtaMemo() {
		return jtaMemo;
	}
	
	
	//private => getter로 변화 alt shift s
	
}//class
