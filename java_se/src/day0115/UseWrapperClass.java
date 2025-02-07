package day0115;
/**
기본형 데이터형을 객체로 감싸서 다양한 기능을 사용할 수 있도록 제공하는 클래스들.
*/class UseWrapperClass{
	public static void main(String[] args) {
		//Wrapper class에서 제공하는 Constant를 사용하여 
		//기본형 데이터형의 최소값 ~ 최대값을console에 출력
		
		System.out.println("byte의 최소값 : "+Byte.MIN_VALUE);
		System.out.println("byte의 최대값 : "+Byte.MAX_VALUE);
	}//main
}//class
