package day0214;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Calculator extends JFrame{

	public Calculator() {
		super("Calculator 만들기");
		
		JTextField jtf =new JTextField();
	
		ButtonPanel jbNorth=new ButtonPanel();//버튼 클래스 객체니깐 버튼 객체명으로 만들어주고 위치 정해주면 된다.
		
		add(jtf,"North"); //필드 위치
		add(jbNorth,"Center");//버튼위치
		//버튼의 영역을 묶어서 센터에 넣어주기
		//button_Panel 만들고 버튼 생성
		//가지고 와서 센터에 넣어주기
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Calculator();

	}

}
