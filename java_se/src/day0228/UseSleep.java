package day0228;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 1. 구현Runnable
public class UseSleep extends JFrame implements Runnable {
	private SimpleDateFormat sdf;
	
	private JLabel jlbl;
	public UseSleep() {
		super("지금 시간은?");
		sdf=new SimpleDateFormat("yyyy-MM-dd EEE hh:mm:ss");
		jlbl = new JLabel(sdf.format(new Date()), JLabel.CENTER);
		jlbl.setFont(new Font("맑은 고딕",Font.BOLD ,30));
		
		add("Center",jlbl);
		
		setBounds(100,100,400,250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}
	
	//2. run()구현
	@Override
	public void run() {
//3. 동시에 실행되어야할 코드 정의

		// sleep은 static 이기 때문에 메소드명.sleep으로 하면 된다.
		try {
			
			while (true) {
				jlbl.setText(sdf.format(new Date()));
				Thread.sleep(1000); // 1초 ,1시간마다 쉬기(1000*60*60)
				
			}//end while
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i);
//				// thread의 Sleep method 호출
//				Thread.sleep(1000); //1시간마다 쉬기(1000*60*60)
//			//runnin <-> block
//			} // end
		} catch (InterruptedException e) {
			e.printStackTrace();
		}// catch

	}// run

	public static void main(String[] args) {
		// 4. 스레드로 돌려야하는 클래스를 객체화
		UseSleep us = new UseSleep();
		// 5. Thread 클래스와 has a 설정
		Thread t = new Thread(us);
		// 6. Thread 객체에 start()
		t.start();

	}

}
