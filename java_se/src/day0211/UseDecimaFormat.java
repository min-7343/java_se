package day0211;

/**
 * 숫자형식의 사용.
 */
public class UseDecimaFormat {
	public UseDecimaFormat() {
		
		int temp= 2_500_000;  //java는 ,을 못 쓰는 대신 _를 사용한다. 출력해도 안나온다.
		
		System.out.println(temp);
		//
		
		
		
	}//UseDecimaFormat

	public static void main(String[] args) {
		new UseDecimaFormat();

	}//main

}//class
