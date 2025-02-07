package day0207;

/**
 * Math<br>
 * 객체화할 수 없고, 제공되는 method를 호출하여 일을 수행하는 클래스<br>
 */
public class UseMath {

	public static final int PASSWORD_LENGTH = 8;
	private String pw;

	public static void main(String[] args) {
//		Math math=new Math();  //생성자가 없음

		int i = 7;
		double d = -2.7;

		int iResult = Math.abs(i);
		double dResult = Math.abs(d);//

		System.out.println(i + "의 절대 값 " + iResult);
		System.out.println(d + "의 절대 값 " + dResult);

		System.out.println("------------------------------------------------");
		d = 2.07; // 소수점 이하 첫번째 자리에서만 반올림
		System.out.println(d + " 반올림 " + Math.round(d));

		d = 2.00501; // 0만아니면 무조건 올린다.
		System.out.println(d + " 올림 " + Math.ceil(d));
		// 내림 floor
		System.out.println(d + "내림 " + Math.floor(d));

		// 정수부분만 얻기
		System.out.println(d + " 실수부를 절사 " + (int) d);

		// 난수
		d = Math.random(); // 소수점 이하 15~17자리
		System.out.println("발생한 난수 : " + d);
		System.out.println("범위의 난수 : " + d * 10);
		System.out.println("범위의 난수 정수만 얻기: " + (int) (d * 10));

		System.out.println("------------------------------------------------");

		// 객체생성

		UseMath um = new UseMath();

		// 비밀번호를 char[]에 저장
		char[] tempPass = um.createPassword();
		// 콘솔에 출력

		um.printPassword(tempPass);

	}// main

	// 비밀번호 생성 반환 method
	public char[] createPassword() {

		// 비번 8자 : 대문자(65-90), 소문자(92-122), 숫자(48-57)

		char[] tempPass = new char[8];

		/*
		 * int flag = 0;
		 * 
		 * for (int i = 0; i < tempPass.length; i++) { flag = (int) (Math.random() * 3);
		 * //0,1,2 switch (flag) { case 0: tempPass[i] = (char) ((Math.random() * 26) +
		 * 65);// 대문자 break; case 1: tempPass[i] = (char) ((Math.random() * 26) + 97);//
		 * 대문자 break; default: tempPass[i] = (char) ((Math.random() * 10) + 48);// 대문자
		 * break; } }
		 */

	/*	//언제 끝날지 모른다는 단점이 있다.
	 * int tempChar=0;
		for (int i = 0; i < tempPass.length; i++) {
			tempChar=(int)(Math.random()*123);
			if( ( tempChar>47 && tempChar <58) || ( tempChar>64 && tempChar <91)
					||( tempChar>96 && tempChar <123)) {
				tempPass[i]=(char)tempChar;
			}else {
				i--;
			}
			
		}*/
		
		int tempChar=0;
		
		//특수문자를 넣어야 한다면 목록을 정해서 하면 좋다.
		String temp="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm12345789~!@#$%^&*";
		for (int i = 0; i < tempPass.length; i++) {
			tempPass[i]=temp.charAt((int)(Math.random()*temp.length()));
		}//end
		
		
		return tempPass;
	}//createPassword

	public void printPassword(char[] tempPass) {
		System.out.println(tempPass);

	}// printPassword
	// 비밀번호 출력 method

}// class
