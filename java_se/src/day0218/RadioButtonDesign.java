package day0218;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class RadioButtonDesign extends JFrame {
	private JTextArea jtextArea;
	private JRadioButton maleButton;
	private JRadioButton femaleButton;
	private JButton clickButton;

	public RadioButtonDesign() {
		super("남 / 여 버튼 선택");
		//라디오버튼,라벨,입력버튼 넣을 패널
		JPanel genderJP=new JPanel();
		
		//라디오버튼
		maleButton=new JRadioButton();
		JLabel ml= new JLabel("남자");
		femaleButton=new JRadioButton();
		JLabel fl= new JLabel("여자");
		
		//라디오버튼 그룹화
		ButtonGroup bg= new ButtonGroup();
		bg.add(maleButton);
		bg.add(femaleButton);
		
		//입력버튼
		clickButton=new JButton("입력");
		
		//패널에 라이오버튼,라벨,입력버튼 넣기
		genderJP.add(maleButton);
		genderJP.add(ml);
		genderJP.add(femaleButton);
		genderJP.add(fl);
		genderJP.add(clickButton);
		
		//JTextArea
		jtextArea = new JTextArea(50,50);
		JScrollPane jslp=new JScrollPane(jtextArea);

		//버튼 클릭 이벤트 처리
		ClickButtonListener cbl = new ClickButtonListener(this);
		clickButton.addActionListener(cbl);
	
		//컴보넌트 추가
		add("North",genderJP);
		add("Center",jslp);
		//크기
		setBounds(20,20,400,400);
		//사용자 보이기
		setVisible(true);
		//창닫기
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//RadioButtonDesign
	
	public JTextArea getJtextArea() {
		return jtextArea;
	}

	public JRadioButton getMaleButton() {
		return maleButton;
	}

	public JRadioButton getFemaleButton() {
		return femaleButton;
	}

	public JButton getClickButton() {
		return clickButton;
	}

	public static void main(String[] args) {
		//라디오 버튼이 눌러지면
		//라디오 버튼의 값 가져와서
		//JTextArea에 줄 변경하며 추가
		new RadioButtonDesign();
		
	}//main

}//class
