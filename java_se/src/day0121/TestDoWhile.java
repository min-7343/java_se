package day0121;

/**
 * do ~ while : 최소 1번 수행, 초대 조건까지 수행<br>
 * do {
 * 	반복수행 문장들...<br>
 * 	증감소식;<br>
 * }while ( 조건식 );<br>
 */
public class TestDoWhile {

	public static void main(String[] args) {
		int i=100;
		do {
			System.out.println("i = "+ i); // 한 번은 수행
			i++;
			
		}while(i<10);

		//do~while로 구구단 5단 출력
		i=1;
		do {
			System.out.println("5 x "+i+" = "+(i*5));
			i++;
		}while (i<10);
	}//main

}//class
