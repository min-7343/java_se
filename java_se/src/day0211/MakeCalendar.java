package day0211;

import java.util.Date;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;

public class MakeCalendar {

	private int year;
	private int month;


	public MakeCalendar(int year, int month) {
		this.year = year;
		this.month = month;
//
//		if(this.year < 1900 || this.month < 1 || this.month > 12) {
//			 errorPintCalenar();
//		}
		printCalendar(this.year, this.month);

	}// MakeCalendar

	public static void printCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		// 원하는 달 => 컴퓨터에는 -1, 출력할 때는 +1
		System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 달력");

		int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);// 현재 달의 마지막 일
		int startDay = cal.get(Calendar.DAY_OF_WEEK);// 현재 달의 시작 일
		int currentDay = 1; // 시작일
		int monthDay = startDay + endDay;// 빈칸을 포함한 달의 일수

		System.out.println("\n일\t월\t화\t수\t목\t금\t토");
		System.out.println("======================================================");
		//형식에 맞게 년도와 월을 입력한 경우
			for (int i = 1; i < monthDay; i++) { // 빈칸을 포함한 달의 일수 만큼 돌 때
				if (i < startDay) { // 시작일까지 빈칸 출력
					System.out.printf("\t");
				} // if
				else {
					System.out.printf("%2d\t", currentDay); // 일 출력
					currentDay++;
				} // else
				if (i % 7 == 0) { // 인덱스번호가 7의 배수이면 줄바꾸기
					System.out.println();
				} // if
			} // for

	}// printCalendar
	
/*	public static void errorPintCalenar() {  //형식에 맞지 않는 숫자르 입력했을 경우
		LocalDate cld = LocalDate.now();
		
		Calendar calE = Calendar.getInstance();
		
		int endDay = calE.getActualMaximum(Calendar.DAY_OF_MONTH);// 현재 달의 마지막 일
		int startDay = calE.get(Calendar.DAY_OF_WEEK);// 현재 달의 시작 일
		int currentDay = 1; // 시작일
		int monthDay = startDay + endDay;// 빈칸을 포함한 달의 일수

		System.out.println("\n일\t월\t화\t수\t목\t금\t토");
		System.out.println("======================================================");
		 //조건에 맞지 않는 년도와 달을 입력하면 현재 달력 출력
			year=cld.getYear();
			int errorMonth =cld.getMonthValue();// 2-> 2월의 최대날
			calE.set(Calendar.MONTH, errorMonth);
			int errorEndDay=calE.getActualMaximum(Calendar.DAY_OF_MONTH);
			startDay = cld.getMonthValue();
			monthDay = startDay + endDay;
			for (int i = 1; i < monthDay; i++) { // 빈칸을 포함한 달의 일수 만큼 돌 때
				if (i < startDay) { // 시작일까지 빈칸 출력
					System.out.printf("\t");
				} // if
				else {
					System.out.printf("%2d\t", currentDay); // 일 출력
					currentDay++;
				} // else
				if (i % 7 == 0) { // 인덱스번호가 7의 배수이면 줄바꾸기
					System.out.println();
				} // if
			} // for
		}
		*/


	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
//		int y=Integer.parseInt(sb.append("2025"));
		
		String str=sb.append("2025").toString();  //문자열.toString -> 문자
		int y=Integer.parseInt(str);
		
		
		System.out.println(sb);
		
//		String[] inputYear=new String[];
		MakeCalendar mc = new MakeCalendar(2000, 15);

	}// main

}// class
