package day0210;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

/**
 * 0,1,2,3을 입력받는 method를 작성하고, 문자열로 날짜를 반환하는 method 작성.
 * 반환되는 날짜 형식 "월-일-년 오전|오후 시:분:초 요일"
 * 조건 : 입력되는 0,1,2,3은 숫자에 따라 (0-한국, 1-미국, 2-일본, 3-캐나다) 나라 날짜 형식이 반환되어야 한다.
 * 입력되는 값이 0,1,2,3 이 아니라면 0으로 설정하여 처리하세요.
 */
public class PrintYearMonthday {

	public PrintYearMonthday(int num) {
	/*	SimpleDateFormat format0=new SimpleDateFormat("MM-dd-yy a hh : mm : ss EEEE",Locale.KOREA);
		SimpleDateFormat format1=new SimpleDateFormat("MM-dd-yy a hh : mm : ss EEEE",Locale.US);
		SimpleDateFormat format2=new SimpleDateFormat("MM-dd-yy a hh : mm : ss EEEE",Locale.JAPAN);
		SimpleDateFormat format3=new SimpleDateFormat("MM-dd-yy a hh : mm : ss EEEE",Locale.CANADA);
		
		switch(num) {
		case 0: System.out.println("0번 한국 : "+format0.format(new Date())); break;
		case 1: System.out.println("1번 미국 : "+format1.format(new Date())); break;
		case 2: System.out.println("2번 일본 : "+format2.format(new Date())); break;
		case 3: System.out.println("3번 캐나다 : "+format3.format(new Date())); break;
		default :System.out.println("그 외의 번호: "+format0.format(new Date())); break;
		}//switch
		*/
		String result ="";
		//(0-한국, 1-미국, 2-일본, 3-캐나다)
		Locale[] loc={Locale.KOREA,Locale.US,Locale.JAPAN,Locale.CANADA};
		
//		if(!(countryCode? -1 && countryCode<4)) {
//			countryCode=0;
//		}//end if
//		
//		SimpleDateFormat sdf
//		=new 
//		
		
	}//PrintYearMonthday
	
	public static void main(String[] args) {
	
		new PrintYearMonthday(0);
		new PrintYearMonthday(1);
		new PrintYearMonthday(2);
		new PrintYearMonthday(3);

	}//main

}//class
