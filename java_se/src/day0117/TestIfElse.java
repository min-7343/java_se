package day0117;

/**
 * if else<br>
 * 둘 중 하나의 코드를 실행해야 할 때 사용하는 <br>
 * if(조건식){<br>
 * 	조건에 맞을 대 수행할 문장들...<br>
 * } else{ <br>
 * 	조건에 맞지 않을때 수행할 문장들...
 * }
 * 
 * 
 */
public class TestIfElse {

	public static void main(String[] args) {
		int num=26;
		//짝수, 홀수 인지 (둘중 하나) 판별하는 코드
		System.out.print(num+"는(은) ");
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}//end else

	//수가 음수인지 양수인지를 판별하는 코드.
		int num2=-56;
		System.out.print(num2+"는(은) ");
		if(num2>=0) {
			System.out.println("양수입니다");
		}else {
			System.out.println("음수입니다.");
		}
		//대중교통 : 버스, 지하철, 마을버스
		//main method의 첫 번째 (args[0])대충교통명을 입력받아서
		//대중교통에 해당되면 "XX는 대중교통입니다."를 그러지 않으면 "XX는 대중교통이 아닙니다." 출력
		
		if(args[0].equals("버스") || args[0].equals("지하철") || args[0].equals("마을버스")){
			System.out.println(args[0]+"는(은) 대중교통입니다.");
		}else {
			System.out.println(args[0]+"는(은) 대중교통이 아닙니다.");
		}
		
		
	}//main

}//class
