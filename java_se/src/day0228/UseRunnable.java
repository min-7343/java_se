package day0228;

import java.util.Random;

//1. Runnable 구현
public class UseRunnable implements Runnable {
//2. run()  override
	@Override
	public void run() {
		System.out.print("loading ");
		// 3. Thread로 동작해야할 코드( 동시에 실행되어야 할 코드 )
		Random r = new Random();
		for (int i = 0; i < 15; i++) {
			System.out.print(" . ");
			try {
				Thread.sleep(100 * r.nextInt(10));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end catch

			System.out.print(" . ");
		} // end for
		System.out.print("finish ");
	}// run

	public static void main(String[] args) {
		// 4.runnale으 구현한 클래스를 객체화
		UseRunnable ur = new UseRunnable();
		// 5. Thread 클래스르 Runnable 구현 클래스와 has a 관계로 객체화
		Thread t = new Thread(ur); // has a 관계 지우면 나의 run이 호출되지 않느다.
		// 6. Thread 객ㅁ체의 start()호출
		t.start();
	}// main

}// class
