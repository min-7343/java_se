package day0211;

import java.util.Random;

/**
 * 
 */
public class UseRandom {
	public UseRandom() {
		//1. 객체 생성
		
		Random r=new Random();
		Random r2=new Random(r.nextLong() ); //seed random  //난수의 난수
		//정수의 난수를 얻어보자
		System.out.println(r);  //toString의 오버라이딩이 안됐다.
		
		int i= r.nextInt();//-21억 ~ +21억
		System.out.println("발생한 값  : "+i);
		
		System.out.println("범위의 난수 값  : "+i%10);//난수 발생 -9 ~ 9
		System.out.println("범위의 난수 값에서 양수만(절대값)  : "+Math.abs(i%10));//양수만 -> 절대값 
		
		System.out.println(r.nextInt(10)); //범위의 난수 //(int bound) 0-9까지의 난수 발생
		System.out.println(r2.nextInt());
		
		double d=r.nextDouble();
		System.out.println("발생한 값 : "+d);
		System.out.println("범위 값 : "+d*10);
		System.out.println("범위 값에서 정수 : "+(int)(d*10));
		
		
		System.out.println(r.nextBoolean());
		System.out.println(r.nextBoolean());
		
		
		

	}//UseRandom

	public static void main(String[] args) {
		
		new UseRandom();		
	}//main

}//class
