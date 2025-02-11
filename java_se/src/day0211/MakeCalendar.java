package day0211;

import java.util.Calendar;

public class MakeCalendar {

	public MakeCalendar() {
		
	}//MakeCalendar
	public void makeCalendar(int year, int month) {
		Calendar cal= Calendar.getInstance();
		cal.set(year, month-1,1);
		
		
		
		
		
		StringBuilder date=new StringBuilder();
	}

	public static void main(String[] args) {
		new MakeCalendar();

	}// main

}// class
