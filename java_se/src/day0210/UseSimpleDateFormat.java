package day0210;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * SimpleDateFormat
 * letter을 반복하여 pattern을 만들고, pattern을 일정 format으로 만들어 원하는 형식의
 * 날짜를 만드는 일.
 */
public class UseSimpleDateFormat {
	public UseSimpleDateFormat() {
		
		//1. SimpleDateFormat생성 (DateFormat이 생성 -> SimpleDateFormat생성)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH,kk,KK,hh : mm : ss EEEE",Locale.JAPAN);		
		//Locale 을 사용하면 다른 나라의 날짜형식을 얻을 수 있다.
		
		
		//2. method를 호출)
		//부모의 forma method를 Date 클래스에 객체를 넣어 호출
		//(코드의 재사용성, Date Format과 Date가 has a 관계를 가진다.)
		String formatDate=sdf.format(new Date());
		
		System.out.println(formatDate);
		System.out.println("---------------------------------------------------------------------------------------");
		String temp=
				new SimpleDateFormat().format(new Date());
		//format : 내가 원하는 형식으로 만들어서 출력.
		System.out.println(temp);
		
	}//SimpleDateFormat

	public static void main(String[] args) {
		new UseSimpleDateFormat();
	}//main

}//class
