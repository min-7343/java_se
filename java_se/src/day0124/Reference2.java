package day0124;

/**
 * 주소전달 : 주소 (유일)를 저장하고 있는 객체를 매개변수로 선언하면 유일한 주소가 전달 된다.. 
 */
public class Reference2 {
	int i;
	int j;
	public void setJ(int j) {
		this.j=j;
	}
	public void setI(int i, Reference2 r) {
		//풀이 : 파라미터 i값-> 힙의 주소(instance i)->stack 지역변수 i에 할당
		System.out.println("setI에서 받은 객체 : "+ r);
		System.out.println("setI에서 받은 객체 : "+ this);
		r.i=i;//stack에 있는 i변수를 heap에 있는 i에 할당.
		i=i; //스택의 있는 i변수에 값을 스택에 있는 i변수에 할당하셈 => 아무런 변화가 없다.
	//	i=ii;//스택에 있는 i변수에 있는 값을 stack에 있는 i변수에 할당
	}
	public int getI() {
		return i;
	}
	public static void main(String[] args) {
		
		Reference2 r= new Reference2();
		System.out.println("생성된 객체 : "+ r);
		r.setI(2025,r);
		r.setJ(20);
		
		System.out.println( r.getI() );
		
	}//main

}//class
