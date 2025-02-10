package day0210;

import java.util.Date;

public class UseDate {
	public UseDate() { //생성자
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
	
		Date date=new Date(); // 시스템의 현재날짜를 연산하여, 현재날짜 정보를 가진 객체가 생성 
		System.out.println(date);
		
		//현재날짜가 아닌 다른 날짜를 얻을 때
		//100*초*분*시*일*월*년
		System.out.println(1000L*60*60*24*30*12*10);
		Date date2=new Date(System.currentTimeMillis()+(1000L*60*60*24*30*12*10));
		// + 1000 : 시간이 1초 더 먼저 간다. +(1000*60*3) : 3분 먼저 간다. +(1000*60*60*3) : 3시간 먼저 간다
		//연산결과가 21억을 초과하면 int는 값을 저장할 수 없기 때문에 long으로 연산한다.
		System.out.println(date2);
		
		//어제 날짜
		Date date3=new Date(System.currentTimeMillis()-(1000*60*60*24*1));
		System.out.println(date3);
		
	
	
	}//UseDate

	public static void main(String[] args) {
		new UseDate(); //인스턴스화

	}//main

}//class
