package day0212;

import java.util.Scanner;

public class UseScanner {

	public UseScanner() {
		//콘솔에 입력되는 키보드값 받기.
		Scanner scan = new Scanner(System.in);
		System.out.println("아무문자열이나 입력하고 엔터");
//		String temp=scan.next();  //이벤트가 발생하기 전까지 멈춰있다가, 이벤트가 발생하면 이벤트가 동작을 이어나가는 일
		//코드의 실행을 멈추는 blocking method //공백이후는 못 가져옴.
		String temp=scan.nextLine();
		System.out.println("입력 값 : "+ temp);
		
		System.out.println("당신의 나이를 입력 ");
		int age=scan.nextInt();
		System.out.println("당신의 나이는 : "+ age);
		
		System.out.println("당신의 태어난 해를 입력 ");
		int birth=scan.nextInt();
		System.out.println("당신이 태어난 해 : "+ birth);
	
		scan.nextLine(); // 숫자를 입력받은 후 입력 버퍼를 비우고
		
		System.out.println("당신의 거주지를 입력 ");
		String addr=scan.nextLine();//문자열을 입력 받는다
		System.out.println("당신의 거주지 : "+ addr);

	
	}
	
	
	public static void main(String[] args) {
		new UseScanner();
		

	}//main

}//class
