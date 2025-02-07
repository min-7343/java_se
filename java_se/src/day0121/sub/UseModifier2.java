package day0121.sub;

import day0121.ModifierA;
//import day0121.ModifierB; //ㅔackage접근지정자
/**
 * 다른 패키지에 존재하는 클래스를 사용하는 클래스.
 *  
 */
public class UseModifier2 {

	public static void main(String[] args) {
		ModifierA ma =new ModifierA();//public 접근지정자를 가진 클래스
//		ModifierB mb =new ModifierB(); //package접근지정자는 같은 패키지 안에서만 접근 가능
		System.out.println("public "+ma.a);
//		System.out.println("protected "+ma.b);// protected접근 불가
//		System.out.println("default "+ma.c); // default접근 불가
//		System.out.println("private "+ma.d); // private 접근불가
		
		
		
	}//main

}//class
