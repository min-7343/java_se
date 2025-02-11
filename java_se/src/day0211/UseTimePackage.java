package day0211;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * JDK 1.8에서부터 제공되는 날짜 관련 클래스를 묶어 놓은 패키지
 */
public class UseTimePackage {

	public UseTimePackage() {
		//날짜만 사용.
		LocalDate ld=LocalDate.now();
		//시간 사용
		LocalTime lt= LocalTime.now();
		//날짜와 시간을 한번에 사용.
		LocalDateTime ldt =LocalDateTime.now();
		
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		
	}//UseTimePackage
	
	public static void main(String[] args) {
		new UseTimePackage();
		
		
		
	}//main

}//class
