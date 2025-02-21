package day0221;

/**
 * main method에서 입력된 arguments 두개의 수를 입력받아, 두 수를 나누는 일.
 */
public class TestRuntimeException {

	public static void main(String[] args) {
		try {
		int num1=Integer.parseInt(args[0]); //문자열은 정수형으로 들어가지 않는다.
		int num2=Integer.parseInt(args[1]); //문자열은 정수형으로 들어가지 않는다.
		
		int result =num1/num2;

		System.out.println(num1+" / "+ num2+" = "+ result);
		}catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("죄송합니다.");
			System.out.println("실행법 ) java TestRuntimeException 값 값");
			System.err.println("간단한 message" +aioobe.getMessage() );
			System.err.println("예외처리객체와 간단한 메시지"+aioobe);//sysee
			//눈에 보이지 않지만 객체가 만들어진다.
			aioobe.printStackTrace();
		}catch (NumberFormatException nfe) {
			System.out.println("죄송합니다.");
			System.out.println("같은 숫자형태로만 입력해 주세요");
		}catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch( Exception e) {
			System.out.println("개발자가 인식하지 못한 예외 발생");
		}finally {
			System.out.println("사용해 주셔서 감사합니다.");
		}
	}//main

}//class
