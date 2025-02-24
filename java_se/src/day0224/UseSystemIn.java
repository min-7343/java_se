package day0224;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class UseSystemIn {

	public static void main(String[] args) {
	
		System.out.println("아무키나 누르고 엔터");
		
		try {
//			int input=System.in.read();
//			System.out.println("입력 값 : "+ (char)input);
			int inputData = 0;
//			System.out.println(KeyEvent.VK_ENTER); //엔터키의 번호(키의 번호, 아스키아님)
			while( (inputData=System.in.read()) !=10 ){
				System.out.print((char)inputData);
			}//end whihle
			///사용자가 몇 글자를 쓸 지 모르기 때문에 while문으로 한다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end catch
		
	}//main
}//class
