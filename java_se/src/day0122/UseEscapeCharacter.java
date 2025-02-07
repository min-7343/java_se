package day0122;

/**
 * 특수문자
 */
public class UseEscapeCharacter {
	
	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.println("안녕\r\n하세요.");
		System.out.println("안녕\t하세요.");
		System.out.println("안녕\'하\' '세요.");
		System.out.println("안녕\"하\" '세'요.");
		System.out.println("c:\\dev\\test\\temp.txt");
		//자바에서 경로 표현은 \가 아닌 /로 표현 
		System.out.println("ABC\bDEF"); // \b > backspace
		//"c:\test\newFile.txt"
		//"c:\dev\test\newFile.txt"
//		System.out.println("c:\test\newFile.txt");
//		System.out.println("c:\dev\test\newFile.txt"); // \d가 없어서 오류
	}//main
}//class
