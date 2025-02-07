package day0114;
/**
 지역변수를 사용하기 위한 클래스.
*/

class LocalVariable {
	int dayOfMonth;//낙타체, 단어마다 앞자리는 대문자, instance(momber) variable: class field영역
	/**
	Java Application을 생성하기 위한 method.(main method)
	*/
	//class필드와 local필드는 영역이 다르므로 dayOfMonth변수를 하나씩 할 수 있다.
	public static void main(String[] args) {//local field
		//선언) 데이터형 변수명; //초기화값이 들어가지 않는다.
		int nowYear;
		//현재월을 저장할 수 있는 변수를 선언하고 
		int nowmonth;
		//2. 값 할당) 변수명=값;
		//int nowYear//error
		//하나의 영역에서는 같은 이름의 변수 선언(데이터형 변수명)을 하나만 할 수 있다.
		//영역이 다르면 같은 이름의 변수 선언할 수 있다.
		int dayOfMonth;
		nowYear=2025;
		//현재월을 할당하고
		nowmonth=1;
		//3. 값 사용) 출력, 연산, 재할당.
		dayOfMonth=14;
		/*
		지역변수는 자동초기화가 되지 않고, 개발자가 초기화를 수동으로 해주어야한다.
		초기화 값으 설정하지 않은 변수를 사용하면 에러가 발생한다.
		*/
		//출력
		System.out.print(nowYear+"년");
		System.out.print(nowmonth+"월");
		System.out.println(dayOfMonth+"일");
		//내일을 출력하고 싶다. 14->15일 출력: 변수는 변하는 수(바뀜)
		dayOfMonth=15;
		System.out.println("내일"+dayOfMonth+"일");//15: 같은 이름의 변수지만 다른 값이 출력
		//변수명은 한글로도 가능하다.(한글로 변수를 선언하지 않는다.)
		//int myAge=25;
		//System.out.println("나의 나이는 "+myAge+"살");
		
		LocalVariable lv= new LocalVariable();
		System.out.println(lv);
	}//main
}//class
