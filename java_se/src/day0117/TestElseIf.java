package day0117;

/**
 * 다중 if : 연관된 여러 조건을 비교할 때 사용 <br>
 * if(조건){
 * 	조건에 맞을때 수행할 문장들
 * 	}else if{
 * 	조건에 맞을때 수행할 문장들
 * 	}else if{
 * 	조건에 맞을때 수행할 문장들
 * 	}else{
 * 	모든 조건에 맞지 않을때 수행될 문장들
 * 	}
 */
public class TestElseIf {

	public static void main(String[] args) {
		//점수판별
		//점수는 0보다 작을 수 없고 100보다 클 수 없다.
		//0보다 작은 점수 "0보다 작아서 실패"를 출력
		//100보다 크다면 "100보다 커서 실패"를 출력
		//그렇지 않다면 (0~100사이) "정상범위 점수" 출력.
		
		int scor=101;//음수, 0~100의 수, 100초과 
		
		if(scor<0) {
			System.out.println(scor + "는(은) 0보다 작아서 실패!");
		}else if(scor>100) {
			System.out.println(scor +"는(은)100보다 커서 실패!");
		}else {
			System.out.println(scor +"는(은) 정상범위 점수!");
		}//end else
		
		
		System.out.println();
		//메인 메소드의 argument(args[0])에 나이를 입력받아서
		//1~100살 사이일 때 9세까지는 어린이, 10대는 청소년, 그 이외는 어른을 출력
		//1~100살이 아니라면 일반적인 나이가 아닙니다.
		//Flow Chart그리기
		int age=Integer.parseInt(args[0]);
		if(age<=0 || (age>100)) {
			System.out.println(age + "세는(은) 일반적인 나이가 아닙니다.");
		}else if(age/10==1){
			System.out.println(age+"세는(은) 청소년입니다.");
		}else {
			System.out.println(age + "세는(은) 어른입니다.");
		}
		
		//메인 메소드의 argument(args[1])에 태어난 해를 입력받아서
		//나이와 띠를 콘솔에 출력하는 코드를 작성하세요
		//0-원숭이 1-닭 2-개 3-돼지 4-쥐 5-소 6-호랑이 7-토끼 8-용 9-뱀 10-말 11-양
		
		System.out.println();
		
		
		int zodiac =Integer.parseInt(args[1]);//중요! 문자를 숫자로 받기!
		int myAge =2025-Integer.parseInt(args[1])+1;
		int temp = zodiac % 12;
		if (temp==0) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고, 원숭이띠입니다.");
		}else if(temp==1) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고, 닭띠입니다.");
		}else if(temp==2) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,개띠입니다.");
		}else if(temp==3) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,돼지띠입니다.");
		}else if(temp==4) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,쥐띠입니다.");
		}else if(temp==5) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,소띠입니다.");
		}else if(temp==6) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,호랑이띠입니다.");
		}else if(temp==7) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,토끼띠입니다.");
		}else if(temp==8) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,용띠입니다.");
		}else if(temp==9) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,뱀띠입니다.");
		}else if(temp==10) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,말띠입니다.");
		}else if(temp==11) {
			System.out.println(zodiac+"년생은 "+myAge+"세이고,양띠입니다.");
		}
		
	}//main

}//class
