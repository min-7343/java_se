package day2010;

import java.util.StringTokenizer;

/**
 * 문자열을 짧은 하나의 마디로 구분하는 String tokenizer의 사용.<br>
 */
public class UseStringTokenizer {
	public UseStringTokenizer() {
//		String s="ddd";//java.lang
//		Math.abs(33);//java.lang
//		StringBuilder sb=new StringBuilder();//java/lang
		
		String data="안녕 하세요? 오늘은 월요일 입니다."; //자르기 위한 대상 문자열
		//data는 문자열의 시작주소를 갖고 있는 것
		
		
		//시작주소를 할당. StringTokenizer은 문자열을 가지고 있지 않다.
		StringTokenizer stk = new StringTokenizer(data);
		System.out.println(stk);
		
		//포인터가 있는 위치에서 잘려질 수 있는 토큰이 몇개인가. 절대적x
		System.out.println(stk.countTokens());//잘려질 수 있는 토큰이 몇개인가?
		
		String token="";
		while(stk.hasMoreTokens()) { //토큰이 존재하는 지?
			System.out.println("남아있는 토큰 "+ stk.countTokens());
			token=stk.nextToken(); //토큰을 얻고, 포인터를 다음으로 이동시킨 후
			System.out.println(token);
		 }//end while 매번 바뀌기 대문에 for문으로 할 수 없다.
		
		
		System.out.println("남아있는 토큰 "+ stk.countTokens());
		
		System.out.println("-----------------------------------------------------------");
		
		data="Java,Oracle,JDBC.HTML,CSS.JavaScript~jQuery,Vue.js~Servlet!JSP";
		
		//특정문자로 토큰을 생성하는 생성자 사용.
		StringTokenizer stk2=new StringTokenizer(data,",.~!",false);//true : ""안에 해당하는 것도 token으로 만든다 (or기능)
		System.out.println(data+"를 전달 했을 때 토큰의 수 : "+ stk2.countTokens());
		while(stk2.hasMoreTokens()) {//token이 존재하면(true)
			stk2.nextToken();  //method 한번 사용할 때마다 포인터가 이동하게 된다. //자를수 있는게 없으면 error 발생
			//token이 존재하면 포이터가 2개 옮겨간다.
			System.out.println(stk2.nextToken());
			//두개를 넘어가서 오류가 난다. 
		}//end while
		
//		System.out.println("----------------------------------------------");
//		String email="skejkf23kdjkejfkk@dkdk.com";
//	
//		StringTokenizer stk3=new StringTokenizer(email,"@.");
//		
//		while(stk3.hasMoreTokens()) {//token이 존재하면(true)
//			System.out.println(stk3.nextToken());
//			
//		}//end while

		
		
		
//		System.out.println(stk.hasMoreTokens());//토큰이 존재하는 지 여부?
//		System.out.println(stk.nextToken());// 토큰을 얻고 포이터를 다음으로 이동
//		System.out.println(stk.countTokens());//잘려질 수 있는 토큰이 몇개인가?
//		
//		System.out.println(stk.hasMoreTokens());//토큰이 존재하는 지 여부?
//		System.out.println(stk.nextToken());// 토큰을 얻고 포이터를 다음으로 이동
//		System.out.println(stk.countTokens());//잘려질 수 있는 토큰이 몇개인가?
	
	
	}

	public static void main(String[] args) {
		new UseStringTokenizer();  //인스터스화 5가지 (자식, new, inner, ?,?) 
		}//main

}//class
