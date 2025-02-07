package day0205;

/**
 * 클락은 사람(Person에서 제공되는 자원을 사용)이고, 다른 사람과의 차별점은 힘이 쎄다.<br>
 * 일반 사람의 힘이 3정도이고, 슈퍼맨은 태어나면서 10의 힘을 가지고 있다.<br>
 * 최대 가질 수 있는 힘은 10이다.<br>
 */
public final class Clark extends Person implements Fly{
	public int power;
	
	public Clark() {
		//super(); //숨어있다.
		power=10;
	}//Clark
	
	/**
	 * 돌의 종류에 따라 슈퍼맨의 힘이 달라진다.
	 * @param stone 돌의 종류
	 * @return 입력되는 돌에대한 결과.
	 */
	public String power(String stone) {
		String result="";
		
		if(stone.equals("다이아몬드")) {
			result="감사합니다. o(^^O)(O^^)o";
			power=10;
		}else if(stone.equals("크립토나이트")) {
			result="대응할 힘 없음. ~(_-_)~";
			power=0;
		}else { //짱돌
			result="개킹받쥬~\\(--\\)"; // \라서 2번 쓴다.
			power=12;
		}//end else
		
		return result;
		
	}//power

	@Override
	public String eat() {
		
		return getName()+"이 집에서 빵을 와구와구 먹는다.";
	}

	@Override
	public String eat(String menu, int price) {
		
		return getName() + "이 레스토랑에서 " + menu + "인 음식을 " + price + "달라 내고 먹는다.";
	}
	
	public Person getPerson() {
		return this;  //new clark
	}//getPerson
	
	

	@Override
	public String lift() {
		return "망토";
	}//lift

	@Override
	public String thrust() {
		return "무릎을 꿇어서";
	}//thrust
	
	


}//class
