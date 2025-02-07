package day0131;

/**
 * 사용장 정의 자료형을 사용하는 클래스.<br>
 */
public class UseStudentInfo {

	public void printStudentInfo( StudentInfo stuInfo) {
		System.out.println("-----------------------------------------------------");
		System.out.println(stuInfo.getName()+" 학생정보");
		System.out.printf("학번 [ %d ] 이름 [ %s ] 이메일[ %s ] \n나이 [ %d ]\t 키[ %.1f ]\t 몸무게[ %.1f ]\n",
				stuInfo.getNum(),stuInfo.getName(),stuInfo.getEmail(),stuInfo.getAge(),
				stuInfo.getHeight(),stuInfo.getWeight());
		System.out.println("-----------------------------------------------------");
	}//printStudentInfo : 출력을 위한 메소드
	
	public static void main(String[] args) {
		//1번, 이장훈 lee@test.com 25살  키: 175.2 몸무게: 65.1kg인 정보를 저장하고 싶다. 
		//2번, 정재균 jeong@sist.co.kr  26살, 키: 182.9 몸무게: 68.4 인 정보를 저장하고 싶다

		//위의 정보를 자바에서 제공하는 데이터형으로 저장
//		int num=1;
//		String name="이장훈";
//		String email="lee@test.com";
//		int age=25;
//		double height=175.2;
//		double weight=65.1;
		
		StudentInfo hunInfo = new StudentInfo();
		hunInfo.setNum(1);
		hunInfo.setName("이장훈");
		hunInfo.setEmail("lee@test.com");
		hunInfo.setAge(25);
		hunInfo.setHeight(175.2);
		hunInfo.setWeight(65.1);
		
//		int num=2;
//		String name="정재균";
//		String email="jeong@sist.co.kr";
//		int age=26;
//		double height=182.9;
//		double weight=68.4;
		
		
		StudentInfo gyunInfo = new StudentInfo(2,"정제균","jeong@sist.co.kr",26,182.9,68.4 );
		UseStudentInfo usi = new UseStudentInfo();
		usi.printStudentInfo(hunInfo);
		//생성할 때 잘못 입력된 값은 setter method로 수정할 수 있다.
		gyunInfo.setHeight(190.9);
		usi.printStudentInfo(gyunInfo);
	}//main

}//class
