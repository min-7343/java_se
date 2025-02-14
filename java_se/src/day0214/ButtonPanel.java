package day0214;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonPanel extends Panel {
	public ButtonPanel() {
	
	JPanel buttonjpl = new JPanel();

	JButton jbtn1 = new JButton("1");
	JButton jbtn2 = new JButton("2");
	JButton jbtn3 = new JButton("3");
	JButton jbtn4 = new JButton("4");
	JButton jbtn5 = new JButton("5");
	JButton jbtn6 = new JButton("6");
	JButton jbtn7 = new JButton("7");
	JButton jbtn8 = new JButton("8");
	JButton jbtn9 = new JButton("9");
	JButton jbtn10 = new JButton("+/-");
	JButton jbtn11 = new JButton("0");
	JButton jbtn12 = new JButton(".");
	
	
	setLayout(new GridLayout(4,3));  //4행 3열
	
	add(jbtn1);
	add(jbtn2);
	add(jbtn3);
	add(jbtn4);
	add(jbtn5);
	add(jbtn6);
	add(jbtn7);
	add(jbtn8);
	add(jbtn9);
	add(jbtn10);
	add(jbtn11);
	add(jbtn12);
	//버튼의 영역을 묶어서 센터에 넣어주기
	//button_Panel 만들고 버튼 생성
	//가지고 와서 센터에 넣어주기
	
	
	}
	
}
