package day2010;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * 0,1,2,3을 입력받는 method를 작성하고, 문자열로 날짜를 반환하는 method 작성.
 * 반환되는 날짜 형식 "월-일-년 오전|오후 시:분:초 요일"
 * 조건 : 입력되는 0,1,2,3은 숫자에 따라 (0-한국, 1-미국, 2-일본, 3-캐나다) 나라 날짜 형식이 반환되어야 한다.
 * 입력되는 값이 0,1,2,3 이 아니라면 0으로 설정하여 처리하세요.
 */
public class PrintYearMonthday {

	public PrintYearMonthday() {
		
		PrintYearMonthday pymd = new PrintYearMonthday();
		String formatData=pymd.format(new Date());
		
	}
	public static void main(String[] args) {
	
		new PrintYearMonthday();

	}//main

}//class
