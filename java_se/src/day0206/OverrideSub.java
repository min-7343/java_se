package day0206;

/**
 * Override가 필요한 자식 클래스
 */
public class OverrideSub extends OverrideSuper {
	//아무 것도 없으면 기본 생성자 있음
	
	int day; // 부모클래스의 변수명과 동일한 변수명을 선언.
	
	
	@Override //규칙에 맞게 제대로 작성되었는지 Compiler가 대신 확인 해줌
	public void helloMsg() {
		System.out.println("오늘은 목요일입니다!");
	}//helloMsg
	
//	@Override //부모클래스에서 final이 있는 method는 Override 할 수 없다.
//	public void helloMsg2() {
//		System.out.println("안녕못해요!");
//	}//helloMsg2
	
	public void useSuper() {
		//this가 숨어있다.
		age=25;//부모와 자식간의 같은 이름의 변수가 없다면 기본적으로 부모의 변수를 사용
		System.out.println("부모의 변수 : "+ age);
		day=6; //부모와 자식간의 같은 이름의 변수가 있다면 자식의 변수를 사용한다.
		System.out.println("자식의 변수 : "+ day);
		//부모와 자식간에 같은 이름의 변수가 있을 때 부모의 변수를 사용
		super.day =5;
		System.out.println("자식의 변수 : "+ day + "부모의 변수 : "+ super.day);
		
		//자식의 변수를 쓸 때  this가 숨겨있어서 this.day 와 day는 같다.
		
		
	}
	
	
	public static void main(String[] args) {
		//자식으로 객체화
		OverrideSub os=new OverrideSub();
		os.helloMsg();
		
		//is a 관계의 객체화 : 부모클래스명 객체명=new 자식클래스의생성자();
		//Overriding : 자식의 method가 최우선적으로 호출이 된다.
		OverrideSuper os2=new OverrideSub();
		os2.helloMsg(); //자식의 method가 불러진다. 
		
		System.out.println("---------------------------");
		os.useSuper();
		
		
		
		
	}//main

}//class
