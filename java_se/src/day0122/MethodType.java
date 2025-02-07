package day0122;

/**
 * method의 4가지 형태 <br>
 */
public class MethodType {
	/**
	 * 고정일 - 항상 같은 일을 수행 <br>
	 * 반환값이 없고, 매개 변수도 없는 형
	 */
	public void typeA() {
		System.out.println("고정일 : 반환값 없고 같은일 수행");
	}//typeA
	
	/**
	 * 가변일 - 입력되는 값에 따라 다른 일을 수행<br>
	 * param 입력되는 값
	 */
	public void typeB(int param) {
		System.out.println("가변일 : "+ param);
	}//typeB
	
	/**
	 * 고정 값 - 항상 같은 값을 반환 <br>
	 * @return 올해
	 */
	public int typeC() {
		int year=2025;
		return year; //담을 변수가 필요하다.
	}//typeC
	
	/**
	 * 가변 값 - 반환형 있고, 매개변수 있는 형.
	 * @param d 입력값(실수)
	 * @return 정수로 변환된 값.
	 */
	public int typeD (double d) {
		
		return (int)d;
	}//typeD
	
	public static void main(String[] args) {
		//객체화 : 클래스명 객체명 = new 클래스명();
		MethodType mt = new MethodType();
		//method 호출
		System.out.println("------------고정 일 호출--------------");
		mt.typeA();
		System.out.println("------------가변 일 호출-------------");
		mt.typeB(22);
		mt.typeB(23);
		System.out.println("------------고정 값 호출-------------");
		mt.typeC();
		// 반환형이 있는 method는 값이므로 사용 (출력, 연산, 재할당)해야한다.
		System.out.println("출력 : "+mt.typeC());
		System.out.println("연산 : "+(mt.typeC()+1));
		//재할당
		int i=mt.typeC();
		System.out.println("재할당된 값 : "+ i);
		
		System.out.println("------------고정 값 호출-------------");
		mt.typeD(2025.1);
		// 반환형이 있는 method는 값이므로 사용 (출력, 연산, 재할당)해야한다.
		System.out.println("출력 : "+ mt.typeD(1.22));
		System.out.println("연산 : "+ (mt.typeD(2025.1)+1));
		//재할당
		i=mt.typeD(3.16);
		System.out.println("재할당된 값 : "+ i);
		
		
		
	}//main

}//class
