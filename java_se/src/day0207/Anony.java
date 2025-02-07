package day0207;

import day0205.Clark;
import day0205.Fly;

public class Anony{
	public void useFly( Fly fly ) {
	
		//fly 객체가 입력되는 객체에 따라 다른 일을 수행
		System.out.println("양력 : "+ fly.lift());
		System.out.println("추진력 : "+fly.thrust());
	}//useFly
	
	

	public static void main(String[] args) {
		//useFly method를 호출
		Anony anony=new Anony();
		//인터페이스는 객체화가 될 수 없지만 구현 클래스의 객체주소를 저장할 수 있다.
		//클락은 Fly 이다.
		//클락을 인스터스화
		Clark superman = new Clark();
		anony.useFly(superman);
		FlyImpl f= new FlyImpl();
		anony.useFly(f);
		
		//구현 클래스를 별도로 생성하지 않고, 이름이 없는 클래스를 생성하여 argumensts로 입력할 수 있다.
		anony.useFly(new Fly() {

			@Override
			public String lift() {
				
				return "신발";
			}

			@Override
			public String thrust() {
				
				return "점프";
			}
			
		});
		
		
		
	}//class

}//main
