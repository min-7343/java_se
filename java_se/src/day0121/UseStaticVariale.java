package day0121;

/**
 * static 변수의 사용.
 */
public class UseStaticVariale {
	//1.선언) : 접근지정자 static 데이터형 변수명;
	public static int i;// 어디에서도 속하지 않음. 공용(우리거, 내거x)
	
	//기본값으로 자동초기화가 된다.
	public static int a; //정수형에  default value: 0
	public static char c; // 문자형에 default value ": '\u0000'
	public static double d; //실수형에 default value : 0.0
	public static boolean b; // 불린형 default value : false
	
	public static UseStaticVariale usv;//참조형 class default value : null
	public static String str; //참조형 String default value : null
	public static int[] arr; // 참조형 array default value : null
	
	
	public static void main(String[] args) {
		//2. 값 할당) 클래스명.변수명=값;	변수명=값;
		UseStaticVariale.i=21;
		
		
		//3. 사용  클래스명.변수명, 변수명
		System.out.println(UseStaticVariale.i);
		System.out.println(i);
		
		//객체화 : static 변수를 가진 클래스로 객체를 몇개를 생성하든 static변수는 하나만 생성된다.
		UseStaticVariale usv=new UseStaticVariale();
//		System.out.println(usv.i); //인스턴수 변수 사용, 내 변수야
		//static 변수는 특정객체에 속해있는 변수가 아니므로
		//객체명.변수명( usv.i )의 형태로 접근은 알 수 있으나 올바른 문법은 아니다.
//		UseStaticVariale usv2=new UseStaticVariale();//객체 두 개
//		System.out.println("usv객체명으로 사용하는 i "+ usv.i);
//		usv.i=100;
//		System.out.println("usv2객체명으로 사용하는 i "+ usv2.i);
		
		//static variable, instance variable default value출력
		//static 변수 => 공용 , 어디에도 속하지 않는다.
		System.out.println("정수형 " +": " +UseStaticVariale.a);
		System.out.println("문자형 : ["  +UseStaticVariale.c+"]");
		System.out.println("실수형 : "  +UseStaticVariale.d);
		System.out.println("블린형 : "  +UseStaticVariale.b);
		
		System.out.println("참조형 class : "  +UseStaticVariale.usv);
		System.out.println("참조형 String : "  +UseStaticVariale.str);
		System.out.println("참조형 array : "  +UseStaticVariale.arr);
		
		
	}//main

}//class
