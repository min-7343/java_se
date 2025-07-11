package day0211;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


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
		
		
		System.out.println("----------------------------------------");
		
		//날짜만 사용.
		LocalDate ld2=LocalDate.of(2026,3,5);
		//시간 사용
		LocalTime lt2= LocalTime.of(12,25);
		//날짜와 시간을 한번에 사용.
		LocalDateTime ldt2 =LocalDateTime.of(ld2,lt2);
		
		System.out.println(ld2);
		System.out.println(lt2);
		System.out.println(ldt2);
		
		System.out.println("------------method 사용----------------------------");
		
		System.out.println("LocalDate");
		StringBuilder ldOut=new StringBuilder();
		ldOut
		.append(ld.getYear()).append("년 ")
		.append(ld.getMonthValue()).append("월 ")
		.append(ld.getDayOfMonth()).append("일 ")
		.append(ld.getDayOfWeek()).append("요일 ")
		.append("일,월,화,수,목,금,토".split(",")[ld.getDayOfWeek().getValue()]).append("요일 ")
		;
		
		System.out.println(ldOut);
		
		System.out.println();
		
		System.out.println("LocalTime");
		StringBuilder ltOut=new StringBuilder();
		ltOut
		.append(lt.getHour()).append(":")
		.append(lt.getMinute()).append(":")
		.append(lt.getSecond()).append(":")
		.append(lt.getNano())
		;
		
		System.out.println(ltOut);
		System.out.println();
		
		DateTimeFormatter dft= DateTimeFormatter.ofPattern("yyyy-MM-dd a hh(kk,HH,KK):mm:ss EEEE");
		DateTimeFormatter dft2= DateTimeFormatter.ofPattern("yyyy-MM-dd a hh(kk,HH,KK):mm:ss EEEE",Locale.UK);
		System.out.println( ldt.format(dft));
		System.out.println( ldt.format(dft2));
		
		System.out.println("-------------년, 월, 일 변경---------------------------");

		System.out.println("변경 전 ld : "+ld);
		//년을 변경해 보자
		
//		ld.withYear(2024);//method만 호출하면 변경된 날짜 정보가 적용되지 않는다.
		//날짜를 변경하고, 변경된 날짜를 자신객체에 재할당해야한다.
		ld=ld.withYear(2024);
		ld=ld.withMonth(12);
		ld=ld.withDayOfMonth(25);
		
		System.out.println("변경 후 ld : "+ld);
		
		System.out.println("---------년, 월, 일 변경 동적-------------------------------");
		
		LocalDate ld3=LocalDate.now();
		System.out.println("변경 전 ld3 : "+ld3);
		
		ld3=ld3.plusYears(1);//일년 후 //동적
		System.out.println("변경 후 ld3 : "+ld3);
		
		ld3=ld3.minusYears(2);//이년 전 //동적
		System.out.println("변경 후 ld3 : "+ld3);
		
		System.out.println("---------두 날짜간의 비교-------------------------------");
		LocalDate ld4 =LocalDate.now(); //2025-2-11 : 현재날짜
		LocalDate ld5 =LocalDate.of(2025,2,12); //2025-2-12 : 이 후날 //내일

		System.out.println(ld4+" /"+ld5);
		
		System.out.println(ld4.isAfter(ld5));
		System.out.println(ld4.isBefore(ld5));
		System.out.println(ld4.isEqual(ld5));
		
		System.out.println("---------두 날짜간의 연산-------------------------------");
		//1. 비교할 날짜를 가진 객체 생성
		LocalDate ld6 =LocalDate.now(); //2025-2-11 : 현재날짜
		LocalDate ld7 =LocalDate.of(2026,3,11); //2025-2-12 : 이 후날 //내일
		
		System.out.println("현재 날 : "+ld6+ ", 비교할 날짜 : "+ ld7);
		
		//2. 날짜를 연산하기위한 객체 얻기
		Period p=Period.between(ld6, ld7);
		
		//3. 날짜간의 연산 (해당날짜끼리만 연산 수행 => 년-년  월-월  일-일 매칭)
		System.out.println("년도의 차이 : "+p.getYears());
		System.out.println("월의 차이 : "+p.getMonths());
		System.out.println("일의 차이 : "+p.getDays());
		
		
		
		
	}//UseTimePackage
	
	public static void main(String[] args) {
		new UseTimePackage();
		
		
		
	}//main

}//class
