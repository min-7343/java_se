package day0131;

/**
 * this의 method 형식<br>
 * 문법 : <br>
 * this(); 기본생성자를 호출할 때<br>
 * this(값, 값, 값...); 매개변수 있는 생성자를 호출할때 <br>
 * 
 * 생성자안에서 객체생성없이 다른 생성자를 호출할 때<br>
 * 생성자의 첫번째 줄에서만 사용 가능<br>
 * 재귀호출 가능성이 있다면 error발생<br>
 */  
public class UseThis {
	int i; // instance variable : 객체가 생성되면 자동 초기화가 된다.
	
	/**
	 * default constructor
	 */
	public UseThis() {
//		i=2025;
//		new UseThis(2025); //또 하나의 객체가 생성되고 그 객체가 가진 member variable에 값 할당
		this(2025); // 중복코드 줄일 수 있다. 하나의 객체안에서 다른 생성자 호출.
		System.out.println("UseThis의 기본 생성자");
	}//UseThis
	
	/**
	 * 매개변수 있는 생성자
	 * @param i
	 */
	public UseThis(int i) {
//		this(); // 매개변수 x ->기본생성자 호출
		this.i=i; //
		System.out.println("UseThis의 매개 변수 받는 생성자");
	}//UseThis

	public static void main(String[] args) {
		UseThis ut=new UseThis(); //객체생성 : 객체화
		System.out.printf("ut객체(주소: %s)가 가진 i값 %d\n",ut,ut.i);
		
		
		
		
		
	}//main

}//class
