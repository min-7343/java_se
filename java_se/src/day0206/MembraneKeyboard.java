package day0206;

/**
 * 멤브레인 클래스.<br>
 * Keyboard클래스의 상속을 받는다.<br>
 * 
 */
public class MembraneKeyboard extends Keyboard {
	public static final int MAXKEYINPUT = 6; //멤브레인 키보드 동시 최대 입력 개수

	int inputCount; // 최대동시입력개수count

	/**
	 * MembraneKeyboard 생성자
	 */
	public MembraneKeyboard() {

		this.drivingMethod = "Non-spring";
		this.inputCount = 0;
	}

	/**
	 * 입력되는 자판의 수를 계산
	 * @param input 사용자가 누른 자판의 수
	 */
	public void maxInputCount(int input) {
		String result = ""; //결과 저장

		if (this.inputCount < (MAXKEYINPUT+1) && input < 7) {
			switch (input) {
			case 0, 1, 2, 3, 4, 5, 6:
				this.inputCount += input;
				if (this.inputCount > MAXKEYINPUT) {
					this.inputCount = 0;
					result = "입력 개수가 초과해 아무것도 입력되지 않았습니다. ( Ĭ ^ Ĭ )";
					break;
				}//end if
				result = this.getName() + "키보드에서 자판 " + this.inputCount + "개가 입력되었습니다.";
				break;

			default:
				result = "입력 개수가 초과해 아무것도 입력되지 않았습니다. ( Ĭ ^ Ĭ )";
				break;
			}//end switch
		}else if(this.inputCount > MAXKEYINPUT){
			this.inputCount = 0;
			result = "입력 개수가 초과해 아무것도 입력되지 않았습니다. ( Ĭ ^ Ĭ )";
		}//end else if
		
		System.out.println(result);
	}//maxInputCount

	@Override
	public void rubberDome() { //러버돔이 하는 일
		System.out.println(this.getName() + "은 " + this.drivingMethod + "방식 키보드로 러버돔이 눌리며 입력됩니다.");
	}//rubberDome

	@Override
	public void wherePrefer() { //선호되는 장소
		System.out.println(this.getName() + "은 게임을 할때 편리합니다.");
	}//wherePrefer



}//class
