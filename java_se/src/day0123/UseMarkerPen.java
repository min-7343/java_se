package day0123;

/**
 * MarkerPen을 객체 생성하여, 객체가 제공하는 기능을 사용하는 클래스.
 */
public class UseMarkerPen {

	public static void main(String[] args) {
		// MarkerPen 4.객체 생성
	
		MarkerPen black = new MarkerPen();

		// 생성된 마카펜 객체에 검은색을 설정하고 싶다.
		// black.color=20;//변수의 접근 지정자가 private이기 때문에 직접 접근 할 수 없다.
		// => setter method사용하여 접근

		black.setCap(1);
		black.setBody(1);
		black.setColor("회색");

		System.out.println("마카펜 객체가 가진 값");
		System.out.println("뚜껑 : " + black.getCap() + ", 몸체 " + black.getBody() + ", " + black.getColor() + "색");
		// 마카펜 객체가 가진 값을 printf로 출력해 보세요.
		System.out.printf("뚜껑 :  %d개  몸체 : %d개, %s 색\n", black.getCap(), black.getBody(), black.getColor());
		// 5.만들어진 객체 사용
		String result = black.write("아파트아파트");
		System.out.println(result);

		System.out.println("-----------------------------");

		// 파란색 마카펜을 생성하고 칠판에 "오늘도 수고 많으셨습니다."를 써보세요.
		MarkerPen blue = new MarkerPen(2, 2, "파란");
//		blue.setCap(1);
//		blue.setBody(1);
//		blue.setColor("파란");

		String result2 = blue.write("오늘도 수고 많으셨습니다.o(^^O) (O^^)o");
		
		System.out.println(result2);
		
		System.out.println(black);
		System.out.println(blue); // heap의 주소를 stack에 저장시킨 것
		
	}// main

}// class
