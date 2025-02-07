package day0206;

/**
 * Keyboard 추상클래스
 */
public abstract class Keyboard {

	private String name;
	//private int price;
	public String drivingMethod; //작동방법
	
	//이름
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	//추상메소드
	public abstract void rubberDome();  //러버돔이 하는 일 
	public abstract void wherePrefer(); //선호되는 장소
	//public abstract void pricePrint();
	
}//class
