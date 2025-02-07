package day0205;

/**
 * 홍길동은 사람(Person에서 제공되는 자원을 사용)이고, 다른 사람과의 차별점은 싸움을 잘한다.<br>
 * 사람의 평균 싸움 레벨은 2 정도이고, 최대 싸움 레벨 10까지만 가능.<br>
 * 홍길동은 싸움 레벨을 6정도 가지고 있다.<br>
 */
public class HongGilDong extends Person {
	
	private int level;
	
	/**
	 * 홍길동은 싸움레벨을 6으로 가지고 생성된다.
	 */
	public HongGilDong() {
		//super(); //숨어 있다.
		level=6;
	}//HongGilDong

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * 싸우는 일을 하는 method
	 * @param yourLevel 상대방의 레벨
	 * @return 싸움의 결과
	 */
	public String fight( int yourLevel ) {
		String result="";
		
		if(level<yourLevel) { //싸움에 지는 경우 : 레벨이 1 낮아진다. 
			level--;
			if(level<1) {
				level=1;
			}//end if
			result= "싸움에 졌음. OTL";
		}else if(level > yourLevel) {//싸움에 이긴 경우 : 레벨이 1 높아진다.
			level++;
			if( level > 10) {
				level=10;
			}//end if
			result="싸움에 이겼음. s('.^)V";
		}else {//비기는 경우 : 레벨의 변화는 없음.
			result="비겼음. ㅡㅡ+;;";
		}
		
		return result;
		
	}//fight

	@Override
	public String eat() {
		
		return getName() + "이 집에서 밥을 먹는다.";
	}
	
	
	@Override
	public String eat(String menu, int price) {
		
		return getName() + "이 주막에서 " + menu + "인 음식을 " + price + "전 내고 먹는다.";
	}
	
	public Person getPerson() {
		return this;  //new GilDong
	}
	
	
	

}//class
