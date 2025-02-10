package day2010;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 하나하나의 날짜 정보를 얻을 때 사용하는 클래스<br>
 * 추상 클래스이므로 직접 객체화가 되지 않는다.<br>
 * 1.
 * 2. 자식 클래스를 사용하여 객체를 사용한다.( is a 관계의 객체화)
 */
public class UseCalendar {

	public UseCalendar() {
		//추상클래스이므로 직접 객체화 불가능
//		Calendar cal=new Calendar(); //안됨
		
		//1.객체를 하나만 얻는 method를 사용
		Calendar cal1= Calendar.getInstance();
		
		System.out.println(cal1);
		//2.자식 클래스를 사용하여 객체화
		Calendar cal2=new GregorianCalendar();
		
		System.out.println(cal2);
		
	}//UseCalendar
	public static void main(String[] args) {
		
		new UseCalendar();
	}//main

}//class
