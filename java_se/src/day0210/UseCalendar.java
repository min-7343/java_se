package day0210;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 하나하나의 날짜 정보를 얻을 때 사용하는 클래스<br>
 * 추상 클래스이므로 직접 객체화가 되지 않는다.<br>
 * 1. 2. 자식 클래스를 사용하여 객체를 사용한다.( is a 관계의 객체화)
 */
public class UseCalendar {

	public UseCalendar() {
		//추상클래스이므로 직접 객체화 불가능
//		Calendar cal=new Calendar(); //안됨
		
		//1.객체를 하나만 얻는 method를 사용
		Calendar cal= Calendar.getInstance();
		
		System.out.println(cal);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		//2.자식 클래스를 사용하여 객체화
		Calendar cal2=new GregorianCalendar();
		
		System.out.println(cal2);
		
		System.out.println("-----------------------------------------------------------------------------");

		//문자 잇기 StringBuilder
		StringBuilder date=new StringBuilder();
//		date.append(cal.get(1));//Constant를 사용하지 않고 1을 넣으면
		//1이 뭔지 모르기 때문에 가독성이 매우 떨어진다.
		
		date.append(cal.get(Calendar.YEAR)).append("년 ")
		.append(cal.get(Calendar.MONTH)+1).append("월 ")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append("일 오늘은 올해 ")
		.append(cal.get(Calendar.DAY_OF_YEAR)).append("번째 날 ");
		
//		switch(cal.get(Calendar.AM_PM)){ //비교의 용도, 컨스턴트를 이용해서 가독성을 높인다.
//		case Calendar.AM : date.append("졸린 오전 "); break;
//		case Calendar.PM : date.append("피곤한 오후 o(T-T)o "); break;
//	}//end switch
		
		date.append("오전, 오후".split(",")[cal.get(Calendar.AM_PM)]).append(" ");
		
		String[] week="일,월,화,수,목,금,토".split(",");
		date.append(week[cal.get(Calendar.DAY_OF_WEEK)-1]).append("요일 ")
		.append(cal.get(Calendar.HOUR_OF_DAY)).append("시 ")
		.append(cal.get(Calendar.HOUR)).append("시")
		.append(cal.get(Calendar.MINUTE)).append("분")
		.append(cal.get(Calendar.SECOND)).append("초")
		;
		
		
		
		System.out.println(date);
//		System.out.println(Calendar.YEAR);
		
		
		
		
	}// UseCalendar

	public static void main(String[] args) {

		new UseCalendar();
	}// main

}// class
