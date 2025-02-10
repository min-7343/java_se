package day0210;

import static java.lang.String.valueOf;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Long.MAX_VALUE; // 클래스명읜 다르고 constant 명이 같다면 선언은 되나
//사용하는 쪽에 에러가 발생한다.

/**
 * 다른 클래스의 static 변수 (constant)나  static method를 클래스명 없이 사용할 때.
 */
public class UseStaticImport {
	public UseStaticImport() {
		System.out.println("int의 최고값 : "+ Integer.MAX_VALUE);
		int value=MAX_VALUE;  //이렇게 MAX_VALUE를 얻고 싶어! => import static java.lang.Integer.MAX_VALUE;
		System.out.println("int의 최고값2 : " + value);
		System.out.println(MAX_VALUE);
		
		String num="2025.02";
		String num2="2.1";
		
		double d=Double.parseDouble(num); //double-> string
		double d2=parseDouble(num2); //double-> string
		//parseDouble클래스명 없이 바로 쓰고 싶다!!
		//=> import static java.lang.Double.parseDouble; 선언
		
		System.out.println(d+", "+d2);
		
		float f=10.42F;  //항명식

		//String f2=String.valueOf(f);
		String f2=valueOf(f);  // static import 사용하여 method를 처리하고
		//f2변수를 출력해 보세요.
		System.out.println(f2);

		
	}//UseStaticImport

	public static void main(String[] args) {
		
		UseStaticImport ust= new UseStaticImport();
		

	}//main

}//class
