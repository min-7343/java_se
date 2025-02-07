package day0124;



/**
 * 생성자의 사용.
 */
public class TestConstructor {
	//기본생성자
	public TestConstructor() {
		System.out.println("default constructor!!");
	}//TestConstructor
	
	public TestConstructor(int i) {
		System.out.println("오버로드된 매개변수 있는 생성자!");
		//test method 호출! - 영역같음 -> 객체명 없이 호출가능하다.
		//method 직접 호출했음!
		test();
		
	}//TestConstructor
	
	public void test() {
		System.out.println("test method!!!");
		//생성자는 method 호출하듯이 직접 호출할 수 없다.
//		TestConstructor();
	}//test
	
	public static void main(String[] args) {
		new TestConstructor();
		new TestConstructor(2);// 객체 생성 자유롭다.
		
	}//main

}//class
