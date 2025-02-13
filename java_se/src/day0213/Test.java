package day0213;

public class Test {
	int cnt;
	public void method() {
		System.out.println("method호출 " + ++cnt +" 번");
		method();  //
		
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.method();
		

	}

}
