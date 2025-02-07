package day0121;

/**
 * instance(member) variable사용.<br>
 * -객체마다 생성되고 사용되는 변수. <br>
 * 객체화 후 객체명.변수명 으로 사용.<br>
 * 객체마다 같은 이름의 변수가 생성된다.
 */
public class UseInstanceVariable {
	//1.변수 선언
	public int i; 
	public void temp() {
		i=100;
	}
	public static void main(String[] args) {
		//2.Static영역에서 instance 변수를 사용하기 위해 객체화가 선행되어야 한다.
		//객체화 문법 : 클래스명 객체명 = new 클래스명;
		UseInstanceVariable uiv = new UseInstanceVariable();// uiv라는 객체가 생성된다
		UseInstanceVariable uiv2 = new UseInstanceVariable();//uiv라는 객체가 생성된다.
		//3.값 할당 ) 객체명. 변수명= 값
		uiv.i=10; // 객체 (uiv)마다 같은 이름의 변수 (i)가 존재
		uiv2.i=21;// 객체 (uiv2)마다 같은 이름의 변수 (i)가 존재
		//instance변수는 객체 만드는 대로 만든다. static은 하나!
		//4.값 사용)  객체명.변수명
		System.out.println("uiv객체 i변수 : "+ uiv.i);
		System.out.println("uiv2객체 i변수 : "+ uiv2.i);
		

	}//main
}//class
