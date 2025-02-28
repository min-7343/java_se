package day0228;

import java.util.Date;

@FunctionalInterface // 추상메소드가 하나인 인터페이스
public interface LambdaTypeD {

	/**
	 * 반환형 있고, 매개변수 있는 형
	 */
	public String test(Date date);
//	public void test2(); -> @FunctionalInterface는 추상 메소드를 1개만 가질 수 있다.
	
}
