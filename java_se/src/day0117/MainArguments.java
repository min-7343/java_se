package day0117;

/**
 * main method의 arguments 입력받기
 */
public class MainArguments {

	public static void main(String[] args) {
		
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		
		System.out.println(args[0] + args[1]);//문자열은 +연산자만 사용할 수 있는데 덧붙임의 연산 수행.
		
		//문자열을 숫자로 만들기
//		int num=args[0]; // 형이 안맞음. 참조형 (String -주소)을 기본형 (int -값)에 할당할 수 없다.		
//		int num=(int)args[0]; // 형이 안맞음. 참조형 (String -주소)을 기본형 (int -값)으로 강제형변환 할 수 없다.
//		Wrapper class를 사용하여 문자열을 분석하여 정수로 변환하여 봔황하는 일을 하는 method사용.
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		System.out.println(num1+ " + "+ num2+" = " + (num1+num2));
		
		
	}

}
