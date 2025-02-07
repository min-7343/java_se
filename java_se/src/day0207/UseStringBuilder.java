package day0207;

/**
 * 긴 문자열 다루기.<br>
 * StringBuffer, StringBuilder : 문자열을 heap에 생성하고, method를 호출하면<br>
 * heap에 생성된 문자열에 직접 작업을 한다. 긴 문자열(+)을 작업 할 때 속도악 String보다 빠르다.
 */
public class UseStringBuilder { //다른 사람도 내가 사용하고 있을 때 쓸 수 있다.
	public void useStringBuilder() {
		//1. 생성 ) 1. 추상클래스가 아닌가 확인
		StringBuilder sb=new StringBuilder();
		//2. method 호출)
		//3. 값을 추가) 기존의 값 뒤에 붙기때문에 원본문자열이 계속 변경된다.
		sb.append("안녕 하세요?");  //문자열 heap에 생성
//		sb.append("25");
		sb.append(25).append("년");
		
		//값삽입) insert
		sb.insert(7,"올해는");
		
		//값 삭제) delete(시작인덱스, 끝인덱스+1)
		sb.delete(2,6);
		
		//문자열의 순서변경( 뒤에 글자가 앞으로 올 수 있게)
		sb.reverse();
		
		
		System.out.println(sb);
		
		
		
	}//useStringBuilder

	public void useStringBuffer() { //객체명이 같아도 오류가 나지 않는다.
		//1. 생성 ) 1. 추상클래스가 아닌가 확인
		StringBuffer sb=new StringBuffer();
		//2. method 호출)
		//3. 값을 추가) 기존의 값 뒤에 붙기때문에 원본문자열이 계속 변경된다.
		sb.append("안녕 하세요?");  //문자열 heap에 생성
//		sb.append("25");
		sb.append(25).append("년");
		
		//값삽입) insert
		sb.insert(7,"올해는");
		
		//값 삭제) delete(시작인덱스, 끝인덱스+1)
		sb.delete(2,6);
		
		//문자열의 순서변경( 뒤에 글자가 앞으로 올 수 있게)
		sb.reverse();
		
		
		System.out.println(sb);
		
		

	}//useStringBuffer

	public static void main(String[] args) {
		
		UseStringBuilder usb = new UseStringBuilder() ;
	
		System.out.println("---------------------StringBuilder의 사용--------------------------");
		usb.useStringBuilder();// 객체를 출력했는데 주소가 아니라 값이 나올까? Objet.String에서 toString메소드를 오버라이딩해서
		System.out.println("---------------------StringBuffer의 사용---------------------------");
		usb.useStringBuffer();
		
		
		
	}// main

}// class
