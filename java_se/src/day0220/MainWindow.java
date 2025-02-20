package day0220;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	//1.이벤트를 발생시키고 비교
	private JMenuItem jmiSubwin; //열기
	private JMenuItem jmiClose; //닫기
	

	public MainWindow() {
		super("다이얼로그 연습");
		
		JMenuBar jmb=new JMenuBar();
		JMenu jmDialog=new JMenu("다이얼로그");
		
		jmiSubwin=new JMenuItem("다이얼로그 열기");
		jmiClose=new JMenuItem("닫기");
		
		//메뉴아이템을 메뉴에 배치
		jmDialog .add(jmiSubwin);
		jmDialog .addSeparator();//선만들고
		jmDialog .add(jmiClose);
		
		//메뉴 메뉴바 배치
		jmb.add(jmDialog);
		
		//메뉴바를 Frame 배치
		setJMenuBar(jmb);
		
		//MainWindowEvt 만들고 - 이벤트 등록
		MainWindowEvt mwe=new MainWindowEvt(this);
		addWindowListener(mwe);//윈도우이벤트 등록
		jmiSubwin.addActionListener(mwe);//액션이벤트등록
		jmiClose.addActionListener(mwe);//액션이벤트등록
		
		setBounds(10,10,1200,1000);
		setVisible(true);
		
		
	}//MainWindow

	//2. getter 만들기
	public JMenuItem getJmiSubwin() {
		return jmiSubwin;
	}


	public JMenuItem getJmiClose() {
		return jmiClose;
	}
	
}//class
