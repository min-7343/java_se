package day0207;

/**
 * Math<br>
 * 객체화할 수 없고, 제공되는 method를 호출하여 일을 수행하는 클래스<br>
 */
public class UseMath {

	public static void main(String[] args) {
//		Math math=new Math();  //생성자가 없음
		
		int i=7;
		double d=-2.7;
		
		int iResult=Math.abs(i);
		double dResult=Math.abs(d);//
		
		System.out.println(i+"의 절대 값 "+iResult);
		System.out.println(d+"의 절대 값 "+dResult);
		
		System.out.println("------------------------------------------------");
		d=2.07;  //소수점 이하 첫번째 자리에서만 반올림
		System.out.println(d+" 반올림 " + Math.round(d));
		
		d=2.00001; //0만아니면 무조건 올린다.
		System.out.println(d+" 올림 "+ Math.ceil(d));
		

	}//main

}//class
