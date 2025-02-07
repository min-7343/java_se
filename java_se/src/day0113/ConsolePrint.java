package day0113;

/**
	강제 형 변환 
	-개발자가 필요한 데이터형으로 일시적인 변환을 하는 것
	-값 손실이 발생할 수 있다.
*/
	class Casting {
	public static void main(String[] args) {
		float floatValue;
		floatValue=(float)1.14;//리터럴은 8byte이고 casting하여 값으 4byte로 변환		
		//(float)1.14F 면 리터럴이 준다. 단수 casting은 값만 손실된다.
		
		//변수앞에 casting
		double doubleValue=1.14;
	//	int i=doubleValue;//데이터형과 크기가 다르므로 할당 되지 않는다.
	//	int i=doubleValueF;//형명식는 상수 앞에만 된다.
		int i=(int)doubleValue;//값 중에 정수부만 잘라서 할당>1할당
		
		System.out.println(floatValue);
		System.out.println(i);
		
		char c='A';
		//i=c;
		//System.out.println(i);
		System.out.println(c+" 문의 unicode값 : "+(int)c);
		c='\u0000';
		System.out.println("[ "+(int)c+" ] ");//int로 케스팅으로 하니 출력된다.
		
		byte num=10;
		byte num2=20;
		byte result=(byte)(num+num2);//(num+num2)가 먼저 int로 케스팅 되고 (byte)로 케스팅(값손실 일어날 수 있음)
		
		System.out.println(num +" + "+ num2 +" = "+result);
		
		//casting이 되지 않는 상황.
		//boolean형은 다른 데이터형으로 casting되지 않는다.
		boolean flag=true;
	//	i=(int)flag;
		boolean flag2=(boolean)flag;//boolean은 boolean으로만 casting된다.
		
		//기본 형 데이터형이 참조형 데이터형으로 변환되지 않는다.(그 반대도 되지 않는다.)
		String str="10"; //문자열의 10 - 연산x 
		//i=10; // 정수의 10 > 연산o
		//i=str;//문자열(참조형)은 기본형에 할당되지 않는다.
		//i=(int)str;//casting되지 않는다.
		
		//str=i;// i=1 //기본형 (int)는 문자열(참조형)으로 할당 할 수 없다.
		//str=(String)i;
		
	
	}
}
