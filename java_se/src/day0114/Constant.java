package day0114;
class Constant{
	
	public static final int MAX_SCORE=100;
	
	public static void main(String[] args) {
//	System.out.println(100-85); //상수만 사용하면 가독성이 떨어진다.
	// 변수를 사용하면 가독성이 향상된다.
//	int MAXSCORE=100; // 최고 점수> 가독성 유지, 값은 변경되면 안됨-> Constant
	int myScore=85;	//획득 점수
	

	
	
	System.out.println(MAX_SCORE - myScore);//
	System.out.println("최고 점수 "+ MAX_SCORE+" , 획득한 점수 "+ myScore+", 최고점수에서 획득한 점수 차 : "+ (
		Constant.MAX_SCORE-myScore));
	}//main
}//class
