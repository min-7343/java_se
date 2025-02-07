package day0120;

/**
 * switch ~ case : 일치하는 정수를 비교하는 일. + 가독성 Constant
 * 
 */
public class TestSwitchCase2 {

	public static void main(String[] args) {
		// 메인 메소드의 argument(args[1])에 태어난 해를 입력받아서
		// 나이와 띠를 콘솔에 출력하는 코드를 작성하세요
		// 0-원숭이 1-닭 2-개 3-돼지 4-쥐 5-소 6-호랑이 7-토끼 8-용 9-뱀 10-말 11-양
		int birth = Integer.parseInt(args[0]);
		int zodiacFlag = birth % 12;
		int age = 2025 - birth + 1;
		
		System.out.println("나이 "+ age+ "살");
		System.out.print("띠는 ");
		switch (zodiacFlag) {
		case ZodiacStr.MONKEY:
			System.out.println("원숭이");
			break;
		case ZodiacStr.CHICKEN:
			System.out.println("닭");
			break;
		case ZodiacStr.DOG:
			System.out.println("개");
			break;
		case ZodiacStr.PIG:
			System.out.println("돼지");
			break;
		case ZodiacStr.RAT:
			System.out.println("쥐");
			break;
		case ZodiacStr.OX:
			System.out.println("소");
			break;
		case ZodiacStr.TIGER:
			System.out.println("호랑이");
			break;
		case ZodiacStr.RABBIT:
			System.out.println("토끼");
			break;
		case ZodiacStr.DRAGON:
			System.out.println("용");
			break;
		case ZodiacStr.SNAKE:
			System.out.println("뱀");
			break;
		case ZodiacStr.HORSE:
			System.out.println("말");
			break;
		default :
			System.out.println("양");
			break;
		}

	}// main

}// class
