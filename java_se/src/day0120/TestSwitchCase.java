package day0120;

/**
 * switch ~ case 일치하는 정수를 비교할 때 사용하는 조건문<br>
 * switch(변수){
 * 	case 상수 : 변수가 상수와 같은 때 실행할 문장들...<br>
 *  case 상수 : 변수가 상수와 같은 때 실행할 문장들...<br>
 *  					.<br>
 *  default : 변수가 상수와 같은 때 실행할 문장들...<br>
 *  }
 */
public class TestSwitchCase {
//class filed   <--constant 선언 (대문자_대문자)
	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;
	
	public static void main(String[] args) {
		String  i= "A";  //byte, short, int, char, String(JDK1.7에서 추가)
		switch(i) {
			case "0": System.out.println("영");
			case "1": System.out.println("일");
			case "A": System.out.println("이");
			case "3": System.out.println("삼");
			default : System.out.println("변수와 일치하는 상수가 없습니다.");
		}//end switch
		
			System.out.println("--------break----------");
			
			int j=0;	
			switch(j) {
			case 0: System.out.println("영");break;
			case 1: System.out.println("일");break;
			case 2: System.out.println("이");break;
			case 3: System.out.println("삼");break;
			default : System.out.println("변수와 일치하는 상수가 없습니다.");
			
		}//end switch
			System.out.println("========범위비교========");
			
			//점수의 대한 학점 구하기.
			char grade='F';
			int score=85;
			if(-1<score && score<101) {//조건식 : 점수가 0~100사이라면
				// <= 은 cpu를 두 번 쓴다.
				switch(score/10){
				case TestSwitchCase.GRADE_A_PLUS :
				case TestSwitchCase.GRADE_A: grade='A'; break;
				case TestSwitchCase.GRADE_B: grade='B'; break;
				case TestSwitchCase.GRADE_C: grade='C'; break;
				case TestSwitchCase.GRADE_D: grade='D'; break;
				default: grade='F'; break;
				}//end case
				System.out.println(score+"학점의 점수는 "+grade+"학점입니다.");
			}else {
				System.out.println(score+" 점은 잘못된 점수 입니다.");
		}//else end
	System.out.println("========break를 최소화한 코드========");
	grade=64;
	score=50;
	if(-1<score && score<101) {//조건식 : 점수가 0~100사이라면
		// <= 은 cpu를 두 번 쓴다.
		switch(score/10){//범위
		case GRADE_D: grade++;//61점 - 65, 76점 - 65
		case GRADE_C: grade++;//61점 - 66, 76점 - 66
		case GRADE_B: grade++;//61점 - 67, 76점 - 66
		case GRADE_A: 
		case GRADE_A_PLUS: grade++; break;//61점 - 68, 76점 - 67
		default: grade+=6;
		
		}//end case
		System.out.println(score+"학점의 점수는 "+grade+"학점입니다.");
	}else {
		System.out.println(score+" 점은 잘못된 점수 입니다.");
}//else end
			
	}//main

}//class
