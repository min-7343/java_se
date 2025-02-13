package day0212;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 *  매개변수로 년,월을 입력 받아 해당 년, 월,일에 대한 마지막 일까지를 List<Integer>에 할당하고
 *  반환하는 일을 하는 method를 작성하세요.(일은 1일로 설정되도록 객체 얻기)
 *  List<Integer> 매개변수로 받아 출력하는 일  method 작성
 */
public class ListCalendar {
	 static List<Integer> ymd= new ArrayList<Integer>();

	/**
	 * 원하는 년도, 달을 입력 받아 리스트에 저장
	 */
	public void makeListCalendar() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 년도 입력 : ");
		int year=scan.nextInt();
		System.out.println("원하는 달 입력 : ");
		int month=scan.nextInt();
		int currentDay=1;
		
		LocalDate ld = LocalDate.of(year, month, currentDay);
		
		int lastDay=ld.lengthOfMonth(); //달의 마지막 날을 받는다.
		
		System.out.println("입력한 날  : "+ year+"년"+month+"월");
		for(int i=0;i<lastDay;i++) {
			ymd.add(currentDay);
			currentDay++;
		}
		
		print(ymd);
		
		scan.close();
	}
	
	
	/**
	 * 리스트를 매개변수로 받아 출력
	 * @param list
	 */
	public static void print(List<Integer> list) {
		
		for(int i=0;i<ymd.size();i++) {
			System.out.printf(ymd.get(i) + "  ");
		}
	}

	public static void main(String[] args) {
		ListCalendar lc = new ListCalendar();		
		lc.makeListCalendar();

	}//main

}//class
