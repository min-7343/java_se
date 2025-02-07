package day0116;

public class Exam0116 {
	
	public static void main(String[] args) {
		
		int num1=999, num2=1024, num3=87;
//		1-1 두개의 정수를 저장할 수 있는 변수를 선언하고, 각각의 변수에 임의의 값을 할당하세요.
//		1-2 위에서 선언된 변수에 할당된 값 중 큰 값을 console에 출력하는 코드를 삼항연산자를 사용하여 작성하세요.
		System.out.println("문제 1");
//		System.out.println(num1+" 과 "+num2+"중 큰 수는 "+((num1>=num2)? num1: num2));
		System.out.println(num1+" 과 "+num2+"중 큰 수는 "+Math.max(num1,num2));
		System.out.println();
		
//		2-1 세개의 정수를 저장할 수 있는 변수를 선언하고, 각각의 변수에 임의의 값을 할당하세요.
//		2-2 세게의 숫자 중 가장 작은 값을 출력하는 코드를 삼항연산자를 사용하여 작성하세요.
		System.out.println("문제 2");
		System.out.print(num1+" ,"+num2+" ,"+num3+" 중 가장 작은수는 ");
//		System.out.println((num1 >= num2)?((num2 >= num3)? num3 : num2): ((num1 > num3)? num3 : num1));
//		System.out.println((num1 <=num2 && num1<=num3)?num1:(num2<= num1 && num2<=num3)?num2:num3);
		System.out.println(Math.min(Math.min(num1, num2), num3));
		
		System.out.println();
		
//		int temp=10. temp2=20 이 할당된 변수를 선언하고 아래의 코드를 작성했을때
//		어떤 값이 출력되는 지 예상해보고 어떻게 그런 결과가 도출되었는 지 주석을 열고 설명
		System.out.println("문제 3");
		int temp=10, temp2=20;
		System.out.println(++temp + temp2--);
		//temp는 전위연산으로 print되기 전에 ++된 값이 저장되어  11
		//temp2는 후위연산으로 print 된 다음 temp2에 ++된 값이 저장되어  19 
		//답 30
		System.out.println();
		
//		Inter.MAX_VALUE Constant를 사용하여 Interger의 하위 2Byte가 출력되도록 비트논리 연사자르 사용핟여 출력해 보세요.
//		결과는 65535가 나와야합니다.
		System.out.println("문제 4");
//		int maxValue = Integer.MAX_VALUE;
		System.out.println("Integer.MAX_VALUE를 사용하여 하위 2Byte값 출력");
		System.out.println("-> Integer.MAX_VALUE & 65535 = "+ (Integer.MAX_VALUE & 65535) );
		
		System.out.println();
		
	}//main

}//class
