package day0212;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class ListCalendar {


	public void printListCalendar(int year, int month) {
		List<Integer> ymd= new ArrayList<Integer>();
		Calendar cal= Calendar.getInstance();
		int lastDay=cal.getActualMaximum(month);
		int currentDay=1;
		System.out.println("입력한 날  : "+ year+"년"+month+"월");
		for(int i=0;i<lastDay;i++) {
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		ListCalendar lc = new ListCalendar();
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 년도 입력 : ");
		int year=scan.nextInt();
		System.out.println("원하는 달 입력 : ");
		int month=scan.nextInt();
		
		lc.printListCalendar(year, month);

	}//main

}//class
