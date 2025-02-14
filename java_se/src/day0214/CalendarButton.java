package day0214;

import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//1.윈도우에서 상속받기
@SuppressWarnings("serial")
public class CalendarButton extends JFrame {

	public CalendarButton() {
		super("달력입니다.");
		// 2.컴포넌트를 생성
		String[] day =Calendar("2025", "2").toString().split(",");
		JButton[] calJbt=new JButton[day.length];
		
		JPanel jpCenter=new JPanel();
		jpCenter.setLayout(new GridLayout(6,7));
		//
		for(int i=0;i<day.length;i++) {
			calJbt[i]=new JButton(day[i]);
			
			jpCenter.add(calJbt[i]);
		}

//		for(int i=0;i<day.length;i++) {
//			if(i%7==0) {System.out.println();}
//			System.out.printf(day[i]+"\t");
//		}

//		//3.배치관리자를 설정하고 , 컴포넌트 배치
		add("Center",jpCenter);
		//4.윈도우 크기 설정
		setSize(560,600);
		//5.사용자에게 보여주고
		setVisible(true);
		setResizable(false);//크기 고정
		//6.종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public String Calendar(String year, String month) {
		Calendar cal = Calendar.getInstance();
		int yearInt = Integer.parseInt(year);
		int monthInt = Integer.parseInt(month);
		cal.set(Calendar.YEAR, yearInt);
		cal.set(Calendar.MONTH, monthInt-1);
		StringBuilder sb = new StringBuilder();
		int date = 1;
		int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i < 43; i++) {
			if (i < startDay) {
				sb.append(" ").append(",");
			}else if( i>= startDay && i <endDay+startDay) {
				sb.append(date++).append(",");
			}else {
				sb.append(" ").append(",");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		new CalendarButton();
	}
}
