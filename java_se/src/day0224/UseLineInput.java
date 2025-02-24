package day0224;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드로 입력된 엔터가 쳐지기 전까지 한줄을 읽기<br>
 * - 한글이 깨짐 => Stream을 결합
 */
public class UseLineInput {

	public UseLineInput() throws IOException {
		System.out.println("당신의 이름을 넣고 엔터를 눌러주세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String name= br.readLine();
			System.out.println(name + "님 안녕하세요? ");
		}  finally {//반드시 실행 영역 예외를 처리하는 기능은 없다.
				if(br!=null) { br.close();
					}//버퍼가 생성이 되면 반드시 닫아라/끊어라
		}//finally
		
	}// UseLineInput

	public static void main(String[] args) {
		try {
			new UseLineInput(); //업무처리 코드와
		} catch (IOException e) {
			e.printStackTrace();//문제가 발생했을 때 처리 코드를 분리하여 작성할 수 있다.
		} // end catch
	}// main

}// class
