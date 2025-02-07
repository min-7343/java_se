package day0206;

/**
 * 부모클래스
 */
public class TestSuper {
	int i;
	int j;

	public TestSuper() {
		// super(); //-> Object으로 간단 => 모든 자바의 부모
		// 객체가 만들어지기 위해서는 부모 Object이 만들어져야 한다.
		this(100);
		System.out.println("부모 기본생성자 " );
	}// TestSuper

	public TestSuper(int i) { // 오버로딩된 TestSuper
		this.i =i;
		System.out.println("부모 매개 생성자 " + i);
	}// TestSuper
}
