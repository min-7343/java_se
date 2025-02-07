package day0123;

/**
 * 1월 22일 instance method의 연습<br>
 * - 업무에 대한 정확한 정확한 method형태 파악.<br>
 * - instance method를 호출하기 위해서 객체화를 할수 있는 가?
 */

public class Exam0122 {

	/**
	 * 1. 자신의 이름을 콘솔에 출력하는 method : 고정 일 - 반환형x, 매개변수x
	 */
	public void printName() {
		System.out.println("김민경");
	}// printName

	/**
	 * 2. 자신의 이름 중 '성'을 반환하는 method - 고정 값 - 반환형o, 매개변수x <br>
	 * 반환형이 존재하는 method는 method를 호출하는 곳 반환형과 일치하는 데이터형으로 변수를 선언하고 일처리한 결과를 받아서 사용한다.
	 * 
	 * @return 성
	 */
	public char getFamilyName() {
		char familyName = '김';
		return familyName;
	}

	/**
	 * 점수를 입력받아서 점수의 판정을 콘솔에 출력하는 method<br>
	 * - 가변일 : 반환형 없고, 매개변수 있는 형. <br>
	 * 유횩성 검증 : 대부분 if 3. 점수를 입력받아서 점수의 판정을 콘솔에 출력하는 method 점수는 0~100사이일때만 판정을 한다.
	 * 그렇지 않으면 "잘못된 점수"를 출력한다. 0~39 - 과락 40~59 - "다른과목참조" 60~100 - 합격 을 출력
	 * 
	 * @param score 판정을 내려야하는 점수
	 */
	public void printScoreEvaluation(int score) {// void int
		System.out.print("입력된 " + score + " 점은 ");
		if (!(score > -1 && score < 101)) {// 잘못된 점수 판단
			System.out.println("잘못된 점수");
			return;
			// Early Return
			// 반환형이 void일때 사용하는 return 구문으로 값을 반환하는 것이 아닌 코드의 실행을
			// 막을때 사용하는 구문
		} // end if
		if (score < 40) {
			System.out.println("과락 ToT");
		} else if (score < 60) {
			System.out.println("다른 과목의 점수를 참조");
		} else {
			System.out.println("합격! 포항항항 o(^^O)");
		}
	}// end printScoreEvaluation

	/**
	 * 4. 문자를 입력 받아서 해당문자가 "대문자"인지 "소문자"인지 "숫자"인지를 판단하여 콘솔에 출력하는 method를 작성 -
	 * 가변일<br>
	 * 대문자 ('A'65 ~ 'Z'90) 소문자 ('a'97 ~ 'z'122) 문자숫자('0'48~'9'57)
	 * 
	 * @param paramChar
	 */
	public void prirtClassifyCharacter(char paramChar) {
//		if(paramChar > 47 && paramChar > 58){
		if(Character.isDigit(paramChar)) {
			System.out.println(paramChar+"숫자입니다.");
		}//end if
//		if (paramChar > 64 && paramChar > 91) {
		if (Character.isUpperCase(paramChar)) {
			System.out.println(paramChar+"대문자입니다.");
		}//end if
//		if (paramChar > 96 && paramChar > 123) {
		if(Character.isLowerCase(paramChar)) {
			System.out.println(paramChar+"소문자입니다.");
		}//end if
	}//printClassifyCharacter

	
	/**태어난 해를 입력 받아서 반환하는 method 작성 - 가변값<br>
	 * 현재년도 - 태어난 해 + 1
	 * @param birth
	 * @return 태어난 해를 사용하여 연산한 나이
	 */
	public int getAge(int birth) {
		int age = 2025 - birth + 1;
		return age;
	}//get age
	
	
	
	/** 정수 3개를 입력받아서 가장 작은 수를 반환하는 method 작성 -가변값
	 * @param number1 숫자
	 * @param number2 숫자
	 * @param number3 숫자
	 * @return 가장 작은 수
	 */
	public int findSmallestNumber(int number1, int number2, int number3) {
		int smallestNumber =Math.min(Math.min(number1, number2), number3);
		return smallestNumber;
	}
	
	
	
	
	public static void main(String[] args) {
		// static 영역에서 instance 영역의 자원( instance variavble,instance method를
		// 사용하기 위해 객체화를 수행. 클래스명 객체명 = new 클래스명();
		Exam0122 exam = new Exam0122();
//		System.out.println(exam);  //주소 출력
		System.out.println("---고정일 호출---");
		exam.printName();

		System.out.println("---고정값 호출---");
		char familyName = exam.getFamilyName();
		System.out.println("나의 성은 : " + familyName);

		System.out.println("---가변일 호출---");
		int score =55;// 가독성을 위해 score로 입력 받아사용 할 수 있다.
		exam.printScoreEvaluation(score);

		System.out.println("---가변일 호출---");
		char paramChar = 'A';
		exam.prirtClassifyCharacter(paramChar);
		
		System.out.println("---가변 값 호출---");
		int birth =1980;
		int age = exam.getAge(birth);
		System.out.println("태어난 해 "+ birth +"년의 나이는 "+ age+"살입니다.");
		
		System.out.println("---가변 값 호출---");
		int num =2025;
		int num2=1;
		int num3=23;
		
		int smallestNumber = exam.findSmallestNumber(num, num2, num3);
		System.out.println(num+" ,"+ num2+" ,"+num3+ " 중 가장 작은 수는 "+ smallestNumber);
		System.out.printf("%d %d %d 중 가장 작은 수는 : %d", num,num2,num3, smallestNumber);
	}// main

}// class
