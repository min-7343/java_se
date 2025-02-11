package day0211;

import java.time.LocalDate;
import java.time.Month;

public class UseWeek {
	public UseWeek() {
		//1.이넘 객첵 얻기
		Week week=Week.TUE;
		
		//2.getter 호출
		System.out.println(week); //영어 요일명
		System.out.println(week.getName()); //한글요일명
		System.out.println(week.getValue());//한글 요일요소의 식별번호
		System.out.println(week.ordinal());//영어 요일요소의 식별번호
		
		System.out.println("-----------Week enum의 모든 요소 값 출력-----------------------");
		
		for( Week tempWeek : Week.values()) {
			System.out.println(tempWeek + " / "+ tempWeek.getName()
			+ " / "+ tempWeek.getValue()+ " / "+ tempWeek.ordinal());
		}//end for
		
		//switch
		System.out.println("--------------------------------------------");
		Week key =Week.MON;
		
		switch(key) {//Week 의 영역이 된다.
		case MON: System.out.println(key.getName()); break;
		case TUE: System.out.println(key.getName()); break;
		case WEN: System.out.println(key.getName()); break;
		case THU: System.out.println(key.getName()); break;
		case FRI: System.out.println(key.getName()); break;
		case SAT: System.out.println(key.getName()); break;
		case SUN: System.out.println(key.getName()); break;
		
		}
		
		System.out.println("--------------------------------------------");
		
		LocalDate ld=LocalDate.now();
		Month month=ld.getMonth();
		System.out.println(month + " / "+ month.ordinal()+ " / "+ month.getValue());
		
		switch (month) {  //month의 영역 // switch 로 하지 만ㄹ고 배열로 하는것이 좋다.
		case JANUARY : System.out.println("1월"); break;
		case FEBRUARY : System.out.println("2월"); break;
		case MARCH : System.out.println("3월"); break;
		
		}
		
		System.out.println("--------------------------------------------");
		
		//배열로 1월 ~12월 까지를 생성하고  Month를 사용하여 한글로 출력해 보세요.
//		String[] monthArr= "1월,2월,3월,4월,5월,6월,7월,8월,9월,10,월,11월,12월";
		String[] arr="일월,이월,삼월,사월,오월,육월,칠월,팔월,구월,십월,십일월,십이월".split(",");
		System.out.println(arr[month.ordinal()]);
	}//UesWeek

	public static void main(String[] args) {
		new UseWeek();

	}//main

}//class
