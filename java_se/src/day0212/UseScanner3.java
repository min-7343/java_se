package day0212;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseScanner3 {
//	public UseScanner3() {
//		// 1. 이름을 계속 입력받아 (예 홍길동) List에 넣고, Y 나 y를 입력하면 종료 한 후
//		// 이름을 가진 List를 반환하고
//		// 2. 리스트의 값을 콘솔에 출력하는 코드를 작성.
//		List<String> nameList = new ArrayList<String>();
//		System.out.println("이름을 입력하세요.( , 로 구분)");
//		Scanner scan = new Scanner(System.in);
//		String name="";
//		
//		for( String str : nameList) {
//			name=scan.nextLine();
//			nameList.add(name);
//			if( name == "y" || name== "Y"){
//				break;
//			}
//		}
//		String[] strArr=new String[nameList.size()];
//		System.out.println();
//
//	}// UseScanner3

	public List<String> inputName() {
		List<String> list = new ArrayList<String>();
		boolean exitFlag = false;
		String name = "";
		String exitData = "";
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("이름을 입력해 주세요. 종료하실려면 y, Y를 입력해 주세요");
			name = scan.nextLine();
			list.add(name);
			System.out.println("종료하실려면 y, Y를 입력해 주세요");
			exitData = scan.next();
			exitFlag = "Y".equals(exitData.toUpperCase()); // Y이면 true 발생
		} while (!exitFlag); // !true => false 반복문을 빠져나간다.

		return list;
	}// inputName

	public void printName(List<String> list) {
		for (String name : list) {
			System.out.println(name);
		} // end for

	}// printName

	public static void main(String[] args) {
		UseScanner3 us3=new UseScanner3();
		List<String> list = us3.inputName();
		us3.printName(list);
		
	}// main

}// class
