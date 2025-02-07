package day0123;

/**
 * 마카펜을 대상을 만드는 설계도<br>
 * 마카펜을 추상화 (객체모델링)<br>
 * 	명사적 특징 (눈에 보이는 특징 - 값 저장): 뚜껑 , 몸체, 색<br>
 * 	동사적 특징 (객체가 제공하는 기능) : 쓴다. <br>
 */
public class MarkerPen {
	//인스턴스 변수는 객체가 생성되면 자동 초기화 된다.
	private int cap;
	private int body;
	private String color;
	
	/**
	 * 마카펜 클래스의 기본 생성자<br>
	 * 뚜껑 1개, 몸체 1개, 검은색인 마카펜을 생성한다.
	 */
	public MarkerPen() {
//		cap=1;
//		body=1;
//		color = "검은색";
		this(1,2,"검은"); //this를 사용하면 중복 코드르 줄일 수 있다.
	}//MarkerPen
	
	/**
	 * 마카펜 클래스의 매개변수 있는 생성자<br>
	 * 뚜껑, 몸체, 마카펜의 색을 외부에서 설정한 값으로 마카펜을 생성한다.<br>
	 * 두껑과 몸체는 1~10개 까지 설정할 수 있고, 색은 검은색, 파란색, 빨간색으로만 설정할 수 있다.
	 * 설정되는 값이 맞지 않으면 뚜껑과 몸체는 1개로 설정되고, 색은 검은색으로 설정된다.
	 * <p>
	 * 사용법) <br>
	 * <strong>MarkerPan 객체명 = new MarkerPen(뚜껑의 개수, 몸체의 개수, 색);</strong>
	 * </p>
	 * @param cap 뚜껑의 개수
	 * @param body 몸체의 개수
	 * @param color 색
	 */
	public MarkerPen(int cap, int body, String color) {
		
		if(!(cap>0&& cap<11)) {
			cap=1;
		}//end if
		if(!(body>0 && body<11)) {
			body=1;
		}//end if
		if(!("검은".equals(color) || "파란".equals(color) || "빨간".equals(color))){
			color="검은";			
		}
		this.cap=cap;
		this.body=body;
		this.color=color;
	}//MarkerPen
	
	/**생성된 마카펜 객체의 뚜껑 개수를 설정하는 일<br>
	 * 뚜껑의 개수 1로만 설정 가능합니다. 값설정 유효성 검증
	 * @param cap 설정할 뚜껑의 개수
	 */
	public void setCap(int cap) {
		if(cap!=0) {
			cap=1;
		}//end if
		this.cap=cap;
	}//setCap
	
	/**생성된 마카펜 객체의 몸체 개수를 설정하는일<br>
	 * 몸체 개수 1개로만 설정 가능합니다.
	 * @param body
	 */
	public void setBody(int body) {
		if(body!=0) {
			body=1;
		}//end if
		this.body=body;
	}//setBody
	
	/**마카펜 객체의 쓰는 일에 대한 동사적인 특징을 구현한 method<br>
	 * @param msg 칠판에 쓸 메시지
	 * @return 작성 결과
	 */
	public String write(String msg) {
		return color + "색으로 \""+msg + "\"를 칠판에 쓴다.";
	}//write
	
	/** 생성된 마카펜 객체의 색을 결정<br>
	 *  색은 검은색, 파란색, 빨간색만 설정 가능<br>
	 *  다른 색이 설정되면 검은색으로 변경되어 설정된다.<br>
	 * @param color 검은, 파란, 빨강
	 */
	public void setColor(String color) {
		if(!("검은".equals(color) ||"파란".equals(color) ||"빨간".equals(color))) {
			color="검은";
		}//end if
		this.color=color;
		}//setColor
	
	/**
	 * 생성된 마카펜 객체의 설정된 뚜껑의 개수를 얻는 일<br>
	 * @return 뚜껑의 개수
	 */
	public int getCap() {
		return cap;	
	}//getCap
	
	/**
	 * 생성된 마카펜 객체에 설정된 몸체의 개수를 얻는 일.<br>
	 * @return 몸체의 수
	 */
	public int getBody() {
		return body;
	}//getbody
	
	/**
	 * 생성된 마카펜 객체에 설정된 색을 얻는 일<br>
	 * @return 설정된 색
	 */
	public String getColor() {
		return color;
	}//getColor
}//class

