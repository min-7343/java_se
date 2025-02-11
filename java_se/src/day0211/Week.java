package day0211;

/**
 * 한글로된 요일과 요일의 번호를 저장하는 enum
 */
public enum Week {
	//생성요소 먼저 와야 한다. -> 생성 요소는 생성자를 호출
	MON("월요일",10),
	TUE("화요일",20),
	WEN("수요일",30),
	THU("목요일",40),
	FRI("금요일",50),
	SAT("토요일",60),
	SUN("일요일",70);
	
	//변수는 외부에서 접근하지 못하도록 private설정
	private final String name;
	private final int value;
	
	//생성자 private
	private Week(String name, int value) { //생성자
		this.name=name;
		this.value=value;
	}//Week
	
	/**
	 * 요소로 할당된 이넘 객체의 이름에 저장된 값("월요일") 얻는 일<br>
	 * 사용법 ) <br>
	 * 1.이넘 얻기<br>
	 * 2.이름에 저장된 값 얻는다. ("월요일") <br>
	 * week.getName();
	 * @return 이넘의 요소가 가진 값
	 */
	public String getName() {
		return name;
	}//getName
	
	/**
	 * 요소로 할당된 이넘 객체의 이름에 저장된 값(10) 얻는 일<br>
	 * 사용법 ) <br>
	 * 1.이넘 얻기<br>
	 * Week week=Week.MON;<br>
	 * 2.이름에 저장된 값 얻는다. (10) <br>
	 * week.getName();
	 * @return 이넘의 요소가 가진 값
	 */
	public int getValue() {
		return value;
	}//getValue
	

}
