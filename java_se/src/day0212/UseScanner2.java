package day0212;

import java.util.Scanner;

public class UseScanner2 {

	public UseScanner2() {
		// , 로 구분된 값 받기
		
		// 1. Scanner 생성
		Scanner scan=new Scanner(System.in);
		//2. 입력되는 값 중 구분자를 설정한다.
		scan.useDelimiter(",");
		System.out.println("값을 ,로 구분하여 입력해 주세요. 종료하시려면 ctrl + z를 눌러주세요.");
		//3. 입력된 값 중 구분자로 구분될 수 있는 값이 있다면
		while(scan.hasNext()) {
			//4.값을 얻고 포인터를 다음으로 이동
			System.out.println(scan.next());
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		new UseScanner2();

	}//main

}//class
