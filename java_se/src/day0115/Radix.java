package day0115;
/**
진수 사용
*/
class Radix 
{
	public static void main(String[] args) {
		int binary=0b1010;//2진수 사용		: 0b숫자
		int octal=017;//8진수				: 0숫자
		int decimal=10;//10진수			: 숫자
		int hex=0xA;//16진수				: 0x숫자
		
		System.out.println(binary+" "+octal+" "+ decimal+" "+hex);
		//개발자가 어떤 진수를 사용하든 JVM에서 2진수로 저장되고 2진수가 연산되고
		//결과는 10진수로 나온다.
		System.out.println(binary+octal+decimal+hex);
		
		int i=300;
		System.out.println(i + " 를 2진수로 변환하면 "+ Integer.toBinaryString(i));
		
		i=24;//10진수를 8진수로 변환
		System.out.println(i + " 를 8진수로 변환하면 "+ Integer.toOctalString(i));
	}//main
}//class
