package day0206;

/**
 * 무접점 키보드<br>
 * Keyboard의 상속을 받는다.
 */
public class ContactlessKeyboard extends Keyboard {

	int capacitance;//정전용량
	
	public ContactlessKeyboard() {
		this.drivingMethod="Spring";
		this.capacitance=0;
	}
	/**
	 * 축전량의 연속적인 변화량에 따른 신호
	 * @param electric 감지된 센서
	 */
	public void capacitance(int electric) { 
		String result = "";
		
		if(electric>0) {
			if(electric<20) {
				result ="감지된 센서의 개수가 20개 미만 입니다.";
				this.capacitance=0;//다시 초기화
			}else if(electric > 19 && electric < 50) {
				result="감지된 센서의 개수가 50개 미만 입니다.";
				this.capacitance=0;//다시 초기화
			}else if(electric > 49 && electric < 101) {
				result="모든 키의 센서가 느껴졌습니다. ⊙_⊙";
				this.capacitance=0;//다시 초기화
			}
		}else {
			result="입력 키가 없습니다. 확인해주세요.◡( ╹◡╹ )◡";
		}
		System.out.println(result);
	}
	
	@Override
	public void rubberDome() { //러버돔이 하는 일
		System.out.println(this.getName()+"은 "+this.drivingMethod+"방식 키보드로, 러버돔은 방진과 스피링을 고정합니다.");
		
	}

	@Override
	public void wherePrefer() {  //선호되는 장소
		System.out.println( this.getName()+"은 사무실, 도서관에서 사용하는 것을 추천합니다.");
	}
}
