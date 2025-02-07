package day0114;
/**
	자바에서 제공하는 Primitive type의 사용.
*/class  DataType{
	public static void main(String[] args) {
		System.out.println("정수 상수 값을 저장할 수 있는 데이터 형");
		byte byteValue;//sign value: -128~+127
		byteValue=127;
		System.out.println("byte : "+ byteValue);
		
		short shortValue=32767;//14~32767
		System.out.println("short : "+ shortValue);
	
		int intValue=2147483647;
		System.out.println("int : "+ intValue);
		
		long longValue=14;//21억초과 숫자
		System.out.println("long : "+ longValue);
		//내가 모으고 싶은 자산을 변수로 선언하고 할당한 후 출력
		long myAsset;
		//myAsset=2147483647;//literal에 딱 맞는다.
		myAsset=300000000l;//literal의 크기를 변경하여야 21억이 초과되는 값을 저장할 수 있다.
		System.out.println("내 자산 : "+myAsset);
		
		byte num1=10;//demotion 동작(-128 ~ +127)
		byte num2=20;//demotion 동작
		int result=0;//byte가 연산되면 결과가 int로 promotion되기 때문에 int에 할당한다.
		result=num1+num2;
		System.out.println(num1 + "+" +num2+"="+result);
		
		System.out.println("문자 상수 값을 저장할 수 있는 데이터형");
		char upperCase=65;//'로 감싸진 영문자 한자, 할당되는 값은 unicode가 저장된다. unicode값 직접할당가능
		char lowerCase='a';
		char number='0';//'로 감싸진 숫자 한자
		//char hagul='가';
		char hangul=44032;
		char temp='\u0000';//0~65535 unsignde value
		
		//System.out.println("char : "+ upperCase+", "+ lowerCase+", "+number+", "+hangul+", [ "+temp+" ]");
		System.out.println("실수 상수 값으 저장할 수 있는 데이터형");
		float floatValue;
		//floatVolue=1.14;//literal의 크기는 8byte이고 float데이터 형은 4byte이므로 error발생
		//형명시 필수! literal의 크기를 8byte에서 4byte로 변경하는 형명시가 필요.
		floatValue=1.14F;
		System.out.println("float : "+ floatValue);
		
		double doubleValue;
		doubleValue=1.14;
		System.out.println("double: "+doubleValue );
		System.out.println(Math.random());//15~16자리
		
		System.out.println("불린 상수 값으 저장할 수 있는 데이터형");
		boolean flag=true;
		boolean flag2=false;
		System.out.println("boolean : "+flag+" , "+flag2);
		
		byte b=10;
		byte b2=20;
		int c=b+b2;//무조건 byte! -> 케스팅 필요 //int로 안하면 error
		
		System.out.println(c);
		
	}//main
}//class
