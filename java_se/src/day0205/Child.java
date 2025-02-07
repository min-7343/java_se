package day0205;

import java.util.Date;
import java.util.StringTokenizer;

/**
 * 자식 클래스
 * extends 키워드로 부모클래스 선택.<br>
 * 자식 클래스에서는 선택한 부모클래스의 자원을 자식의 객체명으로 사용할 수 있다.
 * =>코드의 재사용성 <br>
 */
public class Child extends Parent{
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		//자식 클래스로 생성
		Child c= new Child();
		c.setName("자식클래스");//자식클래스의 method
		c.setAge(25); //부모클래스의 method
		
		System.out.println( c.getName()+ " 님의 나이는 "+ c.getAge() + "살이에요." );
		
		System.out.println("---------------------------------------------------------------");
		
		String str=new String("집가기 한시간 전 ^o^b");
		Date date=new Date();
		System.out.println(date.getYear());
		StringTokenizer stk=new StringTokenizer(str);
		
		System.out.println(c); //객체를 출력하면 heap의 주소가 출력된다. => object.toString() 호출
		System.out.println(c.toString()); //객체를 출력하면 heap의 주소가 출력된다.
		System.out.println(str); //객체를 출력하면 heap의 주소가 출력된다.
		System.out.println(date); //입력된 객체의 toStrin()을 호출하여 리턴값을 출력하는 일
		System.out.println(stk); //객체를 출력하면 heap의 주소가 출력된다.
	
		c.toString();
		date.toString();
		stk.toString();
		
	}//main
	
	
	
	@Override
	public String toString() {
		return "나는 주소가 싫어요!";
	}

}//class
