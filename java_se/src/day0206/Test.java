package day0206;

import java.awt.Dialog;
import java.awt.Frame;

/**
 * dialog 는 기본 생성자가 존재하지 않는다.<br>
 * 자식클래스를 작성하면 부모클래스의 기본생성자를 호출하는 super()가 생략되어 있다.<br>
 * => 부모의 기본 생성자가 없으므로 error가 발생한다. => 해결 : 생성자를 정의하고 부모에서 제공하는 생성자를 사용하면 된다.<br>  
 */
public class Test extends Dialog{ //기본 생성자가 없어서 error
	
	public Test(String str, int t, double d) {
		super( new Frame()); //부모클래스 생성자를 호출할 수 있도록 자동생성 코드르 변경한다.
	}
	
	public Test(String str) {
		//this();
		//super(); 숨어 있음
		super(new Frame());
	
	}
}
