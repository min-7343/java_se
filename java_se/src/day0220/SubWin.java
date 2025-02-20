package day0220;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * MainWindow를 부모로 하는 SubWindow(Dialog : 부가적인 서비스 제공 - 글꼴바꾸기등)
 */
@SuppressWarnings("serial")
public class SubWin extends JDialog {

	public SubWin(MainWindow mw) {//나의 부모는 MainWindow//그림에서 MainWindowEvt 와 SubWin를 이어준다.
		super(mw, "다이얼로그",true); //true = 모달 //여기서 전체적인 다이얼로그의 모양 만듬
//		super(mw, "다이얼로그",false); //false = 비모달 계속 다이얼로그를 열수 있다.
		
		
		//컴포넌트 생성
		//이미지 넣기
		ImageIcon imageMain= new ImageIcon("C:/Users/user/git/Ssang_yong/java_se/src/day0218/images/img2.png");
		//ctrl + f = \\->/
		JLabel jlbl=new JLabel(imageMain);
		
		JPanel jpSouth=new JPanel();
		JButton jbtnClose=new JButton("닫기");
		
		jpSouth.add(jbtnClose);
		
		add("Center",jlbl);
		add("South",jpSouth);
		
		//SubWindEvt 만들고 - 이벤트 등록
		SubWinEvt swe=new SubWinEvt(this);
		addWindowListener(swe);
		jbtnClose.addActionListener(swe);
		
		//부모창에 다이얼로그 넣기
//		System.out.println("부모창의 시작 좌표 : "+ mw.getX()+ " , "+mw.getY());
		setBounds(mw.getX()+300, mw.getY()+100,300,400);
		
//		setBounds(100,100,300,400);
		
		setVisible(true);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//다이얼로그는 DISPOSE_ON_CLOSE
		//창닫는거 이벤트로 할 거야(SubWinEvt)에 있어
	
	}//SubMin
	
}//class
