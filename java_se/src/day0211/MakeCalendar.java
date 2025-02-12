package day0211;

import java.util.Date;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;

public class MakeCalendar {

	private int year;
	private int month;


	public MakeCalendar() {


	}// MakeCalendar

	public String printCalendar(String year, String month) {
		StringBuilder csb = new StringBuilder();
		Calendar cal = Calendar.getInstance();
		int printYear=Integer.parseInt(year);
		int printMonth=Integer.parseInt(month);
		cal.set(printYear, printMonth - 1, 1);//원하는 년, 월 세팅.
		// 원하는 달 => 컴퓨터에는 -1, 출력할 때는 +1
		System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 달력");

		int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);// 현재 달의 마지막 일
		int startDay = cal.get(Calendar.DAY_OF_WEEK);// 현재 달의 시작 위치
		int currentDay = 1; // 시작일
		int monthDay = startDay + endDay;// 빈칸을 포함한 달의 일수(달의 틀)

		System.out.println("\n일\t월\t화\t수\t목\t금\t토");
		System.out.println("======================================================");
		//형식에 맞게 년도와 월을 입력한 경우
		for(int blank=1;blank<startDay;blank++) {  //빈 칸 띄기
			csb.append("\t");
		}
		for(int day=1;day<endDay+1;day++) {
			csb.append(day).append("\t");
			day++;
		}
		switch (Calendar.DAY_OF_WEEK) {
		case 7: csb.append("\n");
		}
		
		return csb.toString();
		
		
//			for (int i = 1; i < monthDay; i++) { // 빈칸을 포함한 달의 일수 만큼 돌 때
//				if (i < startDay) { // 시작일까지 빈칸 출력
//					csb.append("\t");
//				} // if
//				else {
//					System.out.println(currentDay+"\t\t"); // 일 출력
//					currentDay++;
//				} // else
//				if (i % 7 == 0) { // 인덱스번호가 7의 배수이면 줄바꾸기
//					csb.append("\n");
//				} // if
//			} // for

	}// printCalendar
	



	public static void main(String[] args) {
		MakeCalendar mc = new MakeCalendar();
		String input=mc.printCalendar("2025","4");
	}// main

}// class
