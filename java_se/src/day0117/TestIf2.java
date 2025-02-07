package day0117;

/**
 * 단일 if의 연습 
 */
public class TestIf2 {

	public static void main(String[] args) {
		int num=0;
		
		num=Integer.parseInt(args[0]);
		
		System.out.print(num+" 는(은)");
		
		if (num%2==0) {
			System.out.println("짝수입니다.");
		}//end if
		if (num%2==1) {
			System.out.println("홀수입니다.");
		}//end if
		

	}

}
