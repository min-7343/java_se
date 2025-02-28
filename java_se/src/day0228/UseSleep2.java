package day0228;
//1. Runnable 구현
public class UseSleep2 implements Runnable {
//2. run()  override
	@Override
	public void run() {
		// 3. Thread로 동작해야할 코드( 동시에 실행되어야 할 코드 )
		for(int i=0;i<500;i++) {
			System.out.println("run method i========"+ i);
		}//end for
	}//run

	public void method() {
		for(int i=0;i<500;i++) {
			System.out.println("method i--------------"+ i);
		}//end for
	}//end method
	
	public static void main(String[] args) {
		//4.runnale으 구현한 클래스를 객체화
		UseSleep2 ur=new UseSleep2();
		//5. Thread 클래스르 Runnable 구현 클래스와 has a 관계로 객체화
		Thread t=new Thread(ur); //has a 관계 지우면 나의 run이 호출되지 않느다.
		
		//6. Thread 객ㅁ체의 start()호출
		t.start();
//		ur.method(); //메소드 두 개가 동시 호출되고 있다.
	}//main

}//class
