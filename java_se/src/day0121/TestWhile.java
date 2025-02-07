package day0121;

import java.nio.file.spi.FileSystemProvider;

/**
 * While : 시작과 끝을 모를 대 사용하는 반복문<br>
 * 최소 0번 수행. 최대 조건까지 수행<br>
 * 초기값<br>
 * while (조건식){<br>
 * 	반복수행문장들<br>
 * 	증, 감소식
 * }
 */
public class TestWhile {

	public static void main(String[] args) {
		int i=0;
		while (i<10) {
			System.out.println("i = "+i);
			i++;
		}//end while
		
		//while을 사용하여 1~100사이에 3의 배수 합을 구하여 출력
		
		i=1;
		int sum=0;
		while (i<101) {
			if (i%3==0) {
				sum +=i;
			}//end if
			i++;
		}//end while
		System.out.println("1~100 사이 3의 배수 합 : "+sum);
		
	//while의 무한 루프
		while (true) {
			System.out.println("무한루프");
			break;
		}//end while
		
		
		
		
	}//main

}//class
