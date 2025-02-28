package day0228;

@FunctionalInterface // 추상메소드가 하나인 인터페이스
public interface LambdaTypeA {

	/**
	 * 반환형 없고, 매개변수 없는 형
	 */
	public void test();
//	public void test2(); -> @FunctionalInterface는 추상 메소드를 1개만 가질 수 있다.
	
}
