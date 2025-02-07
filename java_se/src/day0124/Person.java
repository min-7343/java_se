package day0124;

/**
 * 사람을 대상으로 선정하여 제작하는 클래스<br>
 * <p>
 * 명사적인 특징 : 눈, 코, 입<br>
 * 동사적인 특징 : 먹는일<br>
 * 이 클래스는 일반 클래스로 객체화를 하여서 사용하시면 됩니다.<br>
 * 예) Person 객체명 =new Person();
 * </p>
 */
public class Person {
	// instance variable : 객체가 생성되면 객체마다 가지게 되는 변수. 자동초기화가 된다.
	// 객체가 살아있는 동안 값 유지
	private int eye, nose, mouth;
	private String name;

	/**
	 * 사람 객체가 생성될때 사용되는 기본 생성자<br>
	 * 사람이라면 기본적으로 눈 2개, 코 1개, 입 1개가 설정된다.<br>
	 * 이름은
	 */
	public Person() {
//		eye = 2;
//		nose = 1;
//		mouth = 1;
		this(2,1,1);//this를 사용하면 중복 코드를 줄일수 있다.
	}//Person
	
	/**
	 * 생성자의 Overload (Overloading)<br>
	 * 사람객체가 생성될 때 사용되는 인자있는 생성장<br>
	 * 입력된 값으로 눈, 코, 입이 설정된다.
	 * @param eye 설정할 눈의 개수
	 * @param nose 설정할 코의 개수
	 * @param mouth 설정할 입의 개수
 	 */
	public Person(int eye, int nose, int mouth) {
		//생성자 안에서 하는 일이 비슷하다면 코드를 한쪽으로 집중시킬수 있다.
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}//Person

	/**
	 * 생성된 사람객체에 눈개수를 설정하는 일.
	 * 
	 * @param eye 설정할 눈의 개수.
	 */
	public void setEye(int eye) { // parameter eye는 지역변수-단발성
		this.eye = eye;
	}// setEye

	/**
	 * 생성된 사람 객체에 설정되어있는 눈의 개수를 반환하는 일.
	 * 
	 * @return 설정된 눈의 개수.
	 */
	public int getEye() {
		return eye;
	}// getEye

	/**
	 * 생성된 사람객체에 코의 개수를 설정하는 일.
	 * 
	 * @param nose 설정할 코의 개수
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}// setNose

	/**
	 * 생성된 사람객체에 설정되어있는 코의 개수를 반환하는 일.
	 * 
	 * @return 설정된 코의 개수
	 */
	public int getNose() {
		return nose;
	}// getNose

	/**
	 * 생성된 사람객체에 입의 개수를 설정하는 일.
	 * 
	 * @param mouth 설정할 입의 개수
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}// setMouth

	/**
	 * 생성된 사람객체에 설정되어있는 입의 개수를 반환하는 일.
	 * 
	 * @return 설정된 입의 개수
	 */
	public int getMouth() {
		return mouth;
	}// getMouth

	/**
	 * 생성된 사람객체에 이름을 설정하는 일.
	 * 
	 * @param name 설정할 이름
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 생성된 사람객체에 이름을 반환하는 일.
	 * 
	 * @param name 설정할 이름
	 */
	public String getName() {
		return name;
	}// getName

	/**
	 * 생성된 사람객체가 집에서 밥을 먹는 일 구현.
	 * 
	 * @return 밥을 먹는 행동.
	 */
	public String eat() {
		return name + "이 집에서 밥을 앙냥냥 먹는다.";
	}// eat

	/**
	 * 생성된 사람객체가 식당에서 밥을 사먹는 일 구현.<br>
	 * method overload
	 * 
	 * @param menu  사먹을 음식의 종류
	 * @param price 음식의 가격
	 * @return 식당에서 사먹는 행동
	 */
	public String eat(String menu, int price) {
		return name + "이 식당에서 " + menu + "인 음식을 " + price + "원 내고 먹는다.";
	}// eat

}// main
