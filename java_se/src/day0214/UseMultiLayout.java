package day0214;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */
@SuppressWarnings("serial")
//1.윈도우 상속받기
public class UseMultiLayout extends JFrame {

	public UseMultiLayout() {
		super("MultiLayout 여러개의 레이아웃 사용");
		//2.컴포넌트 생성
		JTextArea jtaNameDisplay=new JTextArea();
		//JTextArea는 scrollbar가 없음 => JscrollPane인 container component를 사용.
		JScrollPane jspNameDisplay = new JScrollPane(jtaNameDisplay);
		//잘라
//		JLabel jlblName=new JLabel("이름");
//		JTextField jtfName=new JTextField(15); //필트 크기 설정
//		JButton jbtnAdd=new JButton("입력");
		
		JTextArea jbtaNameDispaly = new JTextArea();
		//3.배치관리자를 설정하고, 컴포넌트를 배치
		//여러개의 컴포넌트를 BorderLayout에 올리기 위해서
		//Container Component(JPanel)를 사용

		//잘라
//		JPanel jpNorth=new JPanel();//패널 만드는 것을 할 필요 없다.
		//추가
		JpanelNorth jpNorth=new JpanelNorth(); //부분의 디자인 구현
		
		
		//잘라
//		jpNorth.add(jlblName);
//		jpNorth.add(jtfName);
//		jpNorth.add(jbtnAdd);
		
		//Frame의 기본 레이아웃은 BorderLayout
		//add(jpNorth,BorderLayout.NORTH);
		add(jpNorth, "North");
//지움		add(jbtaNameDispaly, "Center");
		add(jspNameDisplay, "Center");
		//4.윈도우크기설정
		setSize(300,300);
		//5.사용자의 눈에 보이기
		setVisible(true);
		//6.종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new UseMultiLayout();

	}//main

}//class
