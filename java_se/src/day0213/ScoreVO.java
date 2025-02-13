package day0213;
/**
 * Inpitdialog에 입력된 값을 넣어 업무를 처리하는 프로그램을 작성하세요.
 * 1.입력 데이터가 csv형태라면 ScoreVo객체를 생성하여 입력값을 할당하고
 * ScoreVO객체를 java.util.List에 추가하는 작업을 수행.
 * 그 후 사용자에게 다시 InputDialog를 제공한다.
 * 
 * 2. csv형태가 아니고 "출력"이 입력되면 java.util.List에 추가된 모든 ScoreVO객체의 값을 
 * Console에 아래와 같이 출력한다.
 * 예) 
 * 번호	 이름		자바	오라클점수	총점		평균
 * 1	강태일	95	97		xxx		xx.xx
 * 2	김영하	45	90		xxx		xx.xx
 * 
 * 번호는 출력시 사용하는 번호, 의미x
 * 
 * csv 형태가 아니고 "종료"가 입력되면 종료.
 */
public class ScoreVO {
	
	private String name;
	private int java;
	private int oracle;
	
	public ScoreVO(){
		
	}
	
	public ScoreVO(String name, int java, int oracle) {

	}//ScoreVO
	
	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public int getJava() {
		return java;
	}//getJava

	public void setJava(int java) {
		this.java = java;
	}//setJava

	public int getOracle() {
		return oracle;
	}//getOracle

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}//setOracle
	
	public String toString() {
		return "";
	}

	
	
	
	
	

}
