package day0121.sub;

import day0121.ModifierA;

/**
 * 다른 패키지에 존재하는 클래스를 상속받은 자식 클래를 상속받은 자식 클래스<br>
 * 자식클래스에서는 부모클래스의 자원(변수, method)을 자신이 가지고 있는 것 처럼 사용
 */
public class UseModifier3 extends ModifierA{

	public static void main(String[] args) {
		//상속관계에서는 자식 클래스를 생성하여 부모클래스의 변수나 method를 사용한다.
		UseModifier3 um3=new UseModifier3();
		System.out.println("public : "+um3.a);//부모의 public 사용가능
		System.out.println("protected : "+ um3.b);//부모의 prtected 사용 가능 
		//같은 패키지, 
//		System.out.println("default : "+ um3.c);  //부모의 default 사용불가
//		System.out.println("private : "+ um3.d);  //부모의 private사용 불가
	}//main
}//class
