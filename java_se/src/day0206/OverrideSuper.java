package day0206;

/**
 * Override(Overriding) 연습용 부모클래스
 */
public class OverrideSuper {
		
		int age;
		int day;
	
		/**
		 * 요일에 메시지를 출력하는 일
		 */
		public void helloMsg() {
			System.out.println("오늘은 수요일 입니다!");
		}
		
		/**
		 * 제공되는 기능을 그대로만 사용해여할 때. => 자식에서 Override하지 못하도록 막기 
		 */
		public final void helloMsg2() {
			System.out.println("안녕하세요?");
		}

}//class
