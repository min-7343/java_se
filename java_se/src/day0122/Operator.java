package day0122;

/**
 * 숫자 두 개 받아서 덧셈하는 함수 만들기<br>
 */
public class Operator {
	
	public static void plus(int num1, int num2) {
		int sum=0;
		sum=num1+num2;
		System.out.println("num1 + num2 = "+ sum);
	}
	public static void main(String[] args) {
		plus(1,2);
		Operator.plus(3,4);
	}//main
}//class
