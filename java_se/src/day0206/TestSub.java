package day0206;

public class TestSub extends TestSuper {
	int i;  //부모와 자식이 같은 이름의 변수 사용
	
	public TestSub() {
		//super();	//기본적으로 있다. super이 없어도 기본적으로 호출된다.
		//super(20);
		//this();//this와 super는 생성자의 첫번째 줄만 쓸 수 있다. 같이 못 쓴다.
		//this(100);
		super();
		System.out.println("자식의 기본 생성자");
		
	}//TestSub
	
	public TestSub(int i) {
		//super(25);
		this();
		System.out.println("자식의 매개 생성자 : "+i);
	}//TestSub
	
}//class
