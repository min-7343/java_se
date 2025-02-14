package day0214;


import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JTextField;
//1.윈도우에서 상속받기
@SuppressWarnings("serial")
public class CalendarButton extends JFrame{

	public CalendarButton() {
		super("달력입니다.");
		//2.컴포넌트를 생성
		CalendarButton calendar = new CalendarButton();
		String[] day=calendar.Calendar("2025","2").toString().split(",");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//3.배치관리자를 설정하고 , 컴포넌트 배치
		add(dbt, "Cental");
		//4.윈도우 크기 설정
		setSize(560,600);
		//5.사용자에게 보여주고
		setVisible(true);
		setResizable(false);//크기 고정
		//6.종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	private void Calendar(String year, String month) {
		Calendar cal= Calendar.getInstance();
		int yearInt=Integer.parseInt(year);
		int monthInt=Integer.parseInt(month);
		cal.set(Calendar.YEAR, yearInt);
		cal.set(Calendar.MONTH, monthInt);
		
		int endDay=cal.getMaximum(Calendar.DAY_OF_MONTH);
		int starDay=cal.get
	}


	public static void main(String[] args) {
		new CalendarButton();

	}

}
