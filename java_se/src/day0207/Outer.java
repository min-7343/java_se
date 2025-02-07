package day0207;

/**
 * 안쪽 클래스를 인스턴스 변수처럼 사용할 때.
 */
public class Outer {

	int outI;
	
	public Outer() {
		System.out.println("바깥 클래스의 생성자");
	}//Outer
	
	public void outMethod() {
		//inI=10; //안쪽클래스의 자원은 직접 사용불가
		//dfdf
//		inMethod();
		//바깥 클래스에서 안쪽클래스이 자원을 사용할려면 안쪽클래스를 객체화하여 사용.
		Inner in = this.new Inner();//둘이 같다.
//		Inner in = new Inner();// 둘이 같다.
		in.inI=10;
		in.inMethod();
	}//outMethod
	
///////////////////////////////Inner class의 시작///////////////////////////////////////
public class Inner{
	int inI;
	public Inner() {
		System.out.println("Inner class 생성자");
	}
	
	public void inMethod() {
		System.out.println("안쪽클래스의 method");
		//안쪽클래스에서는 바깥 클래스의 자원을 사용할 수 있다.
		outI=2025;
		System.out.println("바깥클래스의 변수 "+ outI);
	}
	
}//class
//////////////////////////////////Inner class의 끝///////////////////////////////////////
	public static void main(String[] args) {
		//객체화
				//1. 외부클래스를 객체화
				Outer out =new Outer();
				
				//2. 외부클래싀의 객체를 사용하여 내부 클래스의 객체를 생성한다.
//				Inner in=new Inner(); // error,  객체화가 특이하다.
				//바깥클래스명.안쪽클래스명 객체명=바깥클래스의객체명.new 안쪽클래스생성자();
				Outer.Inner in=out.new Inner();
				
//				in.inMethod();
				out.outMethod();
	}//main

}//class
