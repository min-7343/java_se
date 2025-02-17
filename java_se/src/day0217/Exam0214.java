package day0217;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

import day0217.PanelCalendar;

@SuppressWarnings("serial")
public class Exam0214 extends JFrame {

	public Exam0214() {
		super("자바 달력!!!");
		
		//캘린더를 인스턴스로 받아서 현재 연도와 월 받기
		Calendar cal =Calendar.getInstance();
		StringBuilder calTitle=new StringBuilder();
		calTitle.append(cal.get(Calendar.YEAR)).append("-")
		.append(cal.get(Calendar.MONTH)+1).append("-")
		.append(cal.get(Calendar.DAY_OF_MONTH));
		
		//컴포넌트 생성 : new JLable(text, 수평정렬 : JLable.LEFT | CENTER| RIGHT)
		JLabel jlblCalendar=new JLabel( calTitle.toString(),JLabel.CENTER);
		
		PanelCalendar pc=new PanelCalendar();
		
		
		jlblCalendar.setFont(new Font("맑은 고딕",Font.BOLD,25));
		
		
		//배치관리자 설정
		//배치
		add(jlblCalendar,BorderLayout.NORTH);
		add(pc,BorderLayout.CENTER);
		//크기설정
		setBounds(100,50,550,500);
		//사용자 눈에 보이기
		setVisible(true);
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Exam0214();
		
	}//main

}//class
