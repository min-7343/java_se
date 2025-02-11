package day0211;

import java.util.Calendar;


/**
 * Calendar를 사용하여 다른 날짜 얻기
 */
public class UseCalendar {
	
	public UseCalendar() {
		//1. 객체 생성 : 시스템의 날짜를 가진 객체 생성
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		
		//날짜 정보를 변경
		//년 2025 -> 2026
		cal.set(Calendar.YEAR, 2026 );
		
		//월 변경 : 2 -> 내년 5월
		//java 월 : 0,1,2,3,4,5,6,7,8,9,10,11  : IS) 8601표준을 따르지 않는다.
		//사람이 생각하는 월보다 1적게 설정해야한다.
		cal.set(Calendar.MONTH, 5-1);
	
		//일 변경
		cal.set(Calendar.DAY_OF_MONTH,25);
		
		cal.set(2026,4,25);
		
		//현재월에 존재하지 않는 일자를 설장하면 다음달 1일로 설정된다.
		cal.set(Calendar.DAY_OF_MONTH, 32);
		
		
		StringBuilder date= new StringBuilder();
		date
		.append(cal.get(Calendar.YEAR)).append("-")
		.append(cal.get(Calendar.MONTH)+1).append("-")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append(" 이번 달의 마지막 날")
		.append(cal.getActualMaximum(Calendar.DATE)).append("일")
		.append(",일, 월, 화, 수, 목, 금, 토".split(",")[cal.get(Calendar.DAY_OF_WEEK)])
		.append("요일 ");
		
		String str=date.toString();//(String)date:  캐스팅 안됨 
		
		System.out.println(date);
		
		
	}//UseCalendar
	public static void main(String[] args) {
		
		new UseCalendar();		
	}//main

}//class
