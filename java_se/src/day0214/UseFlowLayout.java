package day0214;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 흐름 레이아웃과 컴포넌트 사용
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속받기
public class UseFlowLayout extends JFrame {

	public UseFlowLayout() {
		super("FlowLayout 연습");
		//2.사용자에게 제공할 컴포넌트를 생성
		//이름을 설정 " 종류 + 하는일 의 형식으로 짓기
		JLabel jlblName =new JLabel("이름"); //이름표
		JTextField jtfName=new JTextField(10); //정확한 글자 수 x, 필드 크기
		
		JRadioButton jrbMale=new JRadioButton("남자"); //true checked 된 상태로 제공할때
		JRadioButton jrbFemale=new JRadioButton("여자");
		
		JButton jbtnAd=new JButton("입력"); 
		//버튼이 버튼 그룹으로 묶여져야 둘 중에 하나만 선택된다.
		//2-1 버튼 그룹을 생성하고
		ButtonGroup bg=new ButtonGroup();
		//2-2 버튼 그룹에 버튼할당
		bg.add(jrbFemale);
		bg.add(jrbMale);
		//3. 배치관리자를 설정하고, 컴포넌트를 배치
		setLayout(new FlowLayout()); //BorderLayout -> FlowLayout
		add(jlblName); //라벨이 있고
		add(jtfName);//textField 가 올라가서 안보이는것
		
		add(jrbMale);
		add(jrbFemale);
		
		add(jbtnAd);
//		//4. 윈도우 크기 설정
		setSize(600,300);
		//5. 사용자에게 보여주기
		setVisible(true);
		//6. 윈도우 종료이벤트 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//UseFlowLayout
	public static void main(String[] args) {
		new UseFlowLayout();
		}//main

}//class
