package day0116;

/**
 * 주석alt shift j 이 클래스는 이클립스를 사용하기위한 클래스
 */
public class Hello2 {
	/**
	 * 최고 점수를 저장하기위한 상수.
	 * 파일명 = 클레스명 -> 파일 선택 오른쪽 리펙터 리네임
	 */
	public static final int MAX_VALUE=100;

	/**
	 * Java Application을 만들기 위한 main method
	 * @param args 외부값
	 */
	public static void main(String[] args) {
		
		int i = 0;
		System.out.println(i);
		
		i=100;
		
		System.out.println("안녕하세요? ");
		System.out.println(i);
		
		int j =i >>2;
		String str="연습";
		
		i++;
		++i;
		
		System.out.println(i + " " + j +" "+ str );
		
 		

	}//main

}//class
