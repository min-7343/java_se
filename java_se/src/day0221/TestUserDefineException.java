package day0221;

import java.util.Random;

public class TestUserDefineException {
	
	/**
	 * 사용자 정의 예외 발생
	 * @return 메시지
	 * @throws TabaccoException 담배에 대한 예외
	 */
	public String taeil() throws TabaccoException {
		String msg="";
		String[] grade= {"대학생","고등학생","중학생","초등학생"};
		
		int random=new Random().nextInt(grade.length);
		String selectGrade=grade[random];
		if(random ==3) {
//			throw new TabaccoException(selectGrade+ "님 지나친 흡연은 건강에 해롭습니다.");//예외를 강제로 발생시키기
			throw new TabaccoException();//기본생성자 TabaccoException
		}//end if
		
		msg=selectGrade+ "이 흡연중 ('' ) ( '') 모른척 지나간다.";
		
		return msg;
	}//taeil
	
	public void useTeail() {
		try {
			System.out.println( taeil() );
			//사용자 정의 예외 처리클래스를 사용하면 가독성 향상
		} catch (TabaccoException e) {
			e.printStackTrace();
		}//end catch
		
	}//useTeail

	public static void main(String[] args) {
		TestUserDefineException tude= new TestUserDefineException();
		tude.useTeail();
	}//main

}//class
