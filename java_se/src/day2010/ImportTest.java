package day2010;


//import java.util.*; //util패키지의 모든 클래스나 인터페이스를 참조하여 사용할 때=> 권장x

/**
 * 현재 패키지의 다른 클래스,  java.lang 패키지에서 제공하는 클래스들은
 * import 없이 사용가능하다.
 */
public class ImportTest {
	
	
	public static void main(String[] args) {
		
		String s="ddd";//java.lang
		Math.abs(33);//java.lang
		StringBuilder sb=new StringBuilder();//java/lang

		UseStringTokenizer ust = new UseStringTokenizer(); //현재 
		
		Date d=new Date();
		List l=new ArrayList();
		
	}//main

}//class
