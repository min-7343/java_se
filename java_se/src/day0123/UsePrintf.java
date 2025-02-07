package day0123;

/**
 * variable arguments가 도입된 console출력 method 사용
 */
public class UsePrintf {

	public void useVariableArguments() {
		int year = 2025, month = 1, day = 23;
		System.out.printf("정수출력 %d \n", year);
		System.out.printf("정수 자릿수 출력[%6d]\n", year);
		// 6자리에서 오른쪽으로 정렬해서 출력
		System.out.printf("정수 자릿수 출력[%-6d]\n", year);
		// 6자리에서 왼쪽으로 정렬해서 출력
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", year, month, day);
		System.out.println("오늘은 " + year + "년 " + month + "월" + day + "일");

		char c = 'A';
		System.out.printf("문자 [%c][%3c][%-3c]\n", c, c, c);

		double d = 2025.01;
		System.out.printf("실수 출력 %f \n", d);
		d = 12.12345;
		System.out.printf("실수자리수 [%10.2f]\n", d);
		System.out.printf("실수자리수 [%-10.2f]\n", d);
		System.out.printf("실수소수점만 조절 출력 [%.2f]\n", d);
		
		boolean b=true, b2=false;
		System.out.printf("불린 출력 %b, %b\n",b,b2);
		System.out.printf("불린 자릿수 [%6b] [%-8b]\n",b,b2);
		
		String name="홍길동";
		System.out.printf("문자열 출력 %s \n", name);
		System.out.printf("문자열 자릿수 [%5s] [%-5s] \n", name,name);
		
		
		
		
		}
	
	

	public static void main(String[] args) {

		UsePrintf us = new UsePrintf();
		us.useVariableArguments();

	}// main

}// class
