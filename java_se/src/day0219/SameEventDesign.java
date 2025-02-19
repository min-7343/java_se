package day0219;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SameEventDesign extends JFrame {
	private JButton jbtnOpen;
	private JButton jbtnSave;
	
	public SameEventDesign() {
		super("같은 이벤트 처리");
		
		jbtnOpen=new JButton("파일다이얼로그 열기");
		jbtnSave=new JButton("파일다이얼로그 저장");
		
		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtnOpen);
		jpCenter.add(jbtnSave);
		
		add(jpCenter);
		
		
		//윈도우 종료이벤트 처리
		//SameEvent와 has a 관계로 객체 생성
		SameEvent se=new SameEvent(this);
		//윈도우에 이벤트 등록
		addWindowListener(se);
		//버튼에 이벤트 등록
		jbtnOpen.addActionListener(se);
		jbtnSave.addActionListener(se);
		
		
		
		
		setBounds(50,50,400,300);
		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);//윈도우가 하나일때
		
		
	}//SameEventDesign
	
	
	//버튼 두 개의 getter만들기
	public JButton getJbtnOpen() {
		return jbtnOpen;
	}

	public JButton getJbtnSave() {
		return jbtnSave;
	}

	public static void main(String[] args) {
		new SameEventDesign();
		
	}//main

}//class
