package day0117;

/**
 *문자열 비교 
 */
public class TestIf3 {

	public static void main(String[] args) {
		
//		if (args[0].equals("Java") || args[0].equals("java")) {
//			System.out.println("WORA, 완벽한 OOP언어, 메모리 관리의 편의성");
//		}//end if
		if ("Java".equals(args[0]) || "java".equals(args[0])) {
			System.out.println("WORA, 완벽한 OOP언어, 메모리 관리의 편의성");
		}//end if
		
		//main method의 두 번째 (args[1])입력받은 값을 정수로 저장하여
		//"0~100사이인 경우에만 XX점은 유효한 점수 입니다."를 콘솔에 출력하는 코드작성
		
		int num = Integer.parseInt(args[1]);
		if (num >=0 && num<=100){
			System.out.println(args[1]+"점은 유효한 점수입니다.");
		}
		
		if(Integer.parseInt(args[2]) >=0 && Integer.parseInt(args[2])<=100){
			System.out.println(args[2]+"점은 유효한 점수입니다.");
		}
		

	}//main

}//class
