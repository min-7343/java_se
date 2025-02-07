package day0207;

/**
 * 중첩클래스 : 안쪽 클래스르 static 변수처럼 사용할 때
 */
public class Nested {
	
	int outI; //instance variable
	static int outJ; //static variable
	
	public Nested() {
		System.out.println("중첩클래스의 외부 클래스");
	}//Nested
	
	public void outMethodA() {
		System.out.println("외부클래스의 instance method");
	}//outMethodA
	
	public static void outMethodB() {
		System.out.println("외부클래스의 static method");
	}//outMethodB
	
	/////////////////////////중첩클래스의 시작///////////////////////////////////////
	static class Inner{
//		int inI;  //인스턴스 영역
		static int inI; //이텔릭체로 변화 -> static 변수
		
		public static void inMethod() {
			//안쪽 클래스에서 바깥 클래스의 자원 사용.
		//	outI=20; //메모리 넘어가는 영역은 사용 불가
			//static 영역은 클래스 실행 시 가장 먼저 로딩되기 때문에 instance 영역을 사용할 수 없다.
			outJ=20;
			outMethodB();
		
		}//inMethod
	}
	/////////////////////////중첩클래스의 킅///////////////////////////////////////

	public static void main(String[] args) {
		// 중첩클래스는 static으로 구성되기 때문에 객체화없이 직접 호출 가능
		Inner.inMethod();
	}

}
