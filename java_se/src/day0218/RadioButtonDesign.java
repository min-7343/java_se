package day0218;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RadioButtonDesign extends JFrame {
	public RadioButtonDesign() {
		super("남 / 여");
		JRadioButton maleb=new JRadioButton();
		JLabel ml= new JLabel("남자");
		JRadioButton femaleb=new JRadioButton();
		JLabel fl= new JLabel("여자");
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(maleb);
		bg.add(femaleb);
		
		JButton clickB=new JButton("입력");
		
		//JTextArea
		JTextArea jta = new JTextArea(50,50);
		
//		JPanel genderJp= new JPanel();
//		genderJp.add(maleb);
//		genderJp.add(femaleb);

		setLayout(new FlowLayout());
		add(maleb);
		add(ml);
		add(femaleb);
		add(fl);
		add(clickB);
		add("N")
		
		
	
		setBounds(50, 50, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//RadioButtonDesign
	
	public static void main(String[] args) {
		//라디오 버튼이 눌러지면
		//라디오 버튼의 값 가져와서
		//JTextArea에 줄 변경하며 추가
		new RadioButtonDesign();
	}//main

}//class
