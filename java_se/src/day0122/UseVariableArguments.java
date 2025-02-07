package day0122;

/**
 * JDK1.5에서 부터 지원되는 Variable Arguments의 사용. <br>
 * 매개변수는 하나이지만 인수 ( 입력값(arguments))를여러개 넣을 수 있는 기능. 
 */
public class UseVariableArguments {

	/**
	 * VA의 사용
	 * @param va 정수의 값을 몇개든 출력할 수 있다.
	 */
	public void vaMethod(int ...va) {
		//V.A는 배열로 처리된다. (출력하면 값이 아닌 주소가 출력된다.)
		for(int i=0;i<va.length;i++) {
			System.out.println(va[i]);
		}//end for
	}//vaMethod
	//(참조형 : class Sting array <-주소 사용)
	
	//VA는 단일형의 parameter와 함께 정의하면 가장 마지막에 정의한다.
	public void va2(int i, int ...j) {
		
	}
	public void va2(int i,char c ,int ...j) {
		
	}
	//V.A는 가장 마지막에만 정의해야 한다.
//	public void va4(int ...i, int j) {
//		
//	}
		
	
	
	public static void main(String[] args) {
		//객체화) 클래스명 객체명 =new 클래스명();
		
		UseVariableArguments uva = new UseVariableArguments();
		//V.A를 가지고 있는 method를 호출
		uva.vaMethod();
		System.out.println("-------------------");
		uva.vaMethod(1);
		System.out.println("-------------------");
		uva.vaMethod(1,2,3,4,5,6,7);
		
		
	}//main
}//class
