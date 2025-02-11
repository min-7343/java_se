package day0211;

import java.time.Month;

/**
 * Day enum객체를 사용하기위한 클래스
 */
public class UseDayEnum {

	public UseDayEnum() {
		//Day enum의 모든 값(요소)출력 이넘명.values() 사용
		for( Day day: Day.values()) {
			System.out.println(day);
		}//end for
		
		//기존의 for문으로 변환
		
//		Day[] dayArr=Day.values();
//		for(int i=0;i<dayArr.length;i++) {
//			System.out.println(dayArr[i]);
//		}
// java.time 패키지에서 제공하는 Month enum을 사용할 수 있다. 
//		for( Month month : Month.values()) {
//			System.out.println(month);
//		}
		
		System.out.println("----------------------------------------");
		//특정 요소의 값 얻기
		System.out.println(Day.WEN);
		//특정 요소의 번호 : 이넘명.요소명.ordinal()
		System.out.println(Day.MON.ordinal());
		System.out.println(Day.FRI.ordinal());
		
		//요소들 번호 출력
		for( Day day: Day.values()) {
			System.out.println(day+" / "+day.ordinal());
		}//end for
		
		
	}//UseDayEnum
	
	public static void main(String[] args) {
		
		new UseDayEnum();
		
	}//main

}//class
