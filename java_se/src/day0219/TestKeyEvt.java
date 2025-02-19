package day0219;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyEvt extends KeyAdapter  {

	private TestKeyDesign tkd;
	
	public TestKeyEvt(TestKeyDesign tkd) { //디자인 클래스와 has a
		this.tkd=tkd;
	}//TestKeyEvt

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("2.keyTyped");
		//키코드에서 얻어지지 않는다.=> 코드작성에서 제외
		System.out.println("눌린 키 코드 : "+ e.getKeyCode()
		+", 눌린키의 문자 : "+ e.getKeyChar() );
	}//keyTyped

//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("1.keyPressed");
//	//키보드의 키가 눌릴때 작업
//		System.out.println("눌린 키 코드 : "+ e.getKeyCode()
//		+", 눌린키의 문자 : "+ e.getKeyChar() );
//	}

	@Override
	public void keyReleased(KeyEvent e) {
		//키보드의 키가 올라올 때 작업
		//키코드는 대소문자가 같다
		System.out.println("3.keyReleased");
		System.out.println("눌린 키 코드 : "+ e.getKeyCode()
		+", 눌린키의 문자 : "+ e.getKeyChar() );
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_ENTER : 
			tkd.dispose();
		case KeyEvent.VK_COMMA:
			tkd.getJtf().setText(tkd.getJtf().getText()+" " );
			// , 하면 자동으로 한 칸 띄기
		}//end switch
	}//end  keyReleased
	
}
