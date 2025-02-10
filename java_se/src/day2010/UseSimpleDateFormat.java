package day2010;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat
 * letter을 반복하여 pattern을 만들고, pattern을 일정 format으로 만들어 원하는 형식의
 * 날짜를 만드는 일.
 */
public class UseSimpleDateFormat {
	public UseSimpleDateFormat() {
		
		//1. SimpleDateFormat생성 (DateFormat이 생성 -> SimpleDateFormat생성)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a H");		
		//2. method를 호출)
		//부모의 forma method를 Date 클래스에 객체를 넣어 호출
		//(코드의 재사용성, Date Format과 Date가 has a 관계를 가진다.)
		String formatDate=sdf.format(new Date());
		
		System.out.println(formatDate);
		
	}//SimpleDateFormat

	public static void main(String[] args) {
		new UseSimpleDateFormat();
	}//main

}//class
