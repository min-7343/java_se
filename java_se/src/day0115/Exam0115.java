package day0115;
class Exam0115 {
	public static final int POCKET_MONEY=400000;
	public static final int DAY=20;
	public static void main(String[] args) {
		int oneWay=1800;
		int fullWay=oneWay*2;
		int lunch=8000;
		
		System.out.println("한달 용돈 "+ POCKET_MONEY+ "원 하루 용돈은 " + DAY+"일 기준 " + (POCKET_MONEY/DAY) +"원 입니다.");
		System.out.println("하루 지출은 편도 교통비"+oneWay+"원, 왕복 교통비 " + fullWay+"원 점심식대 "+lunch+ "원으로 총 "+(fullWay+lunch)+"원이 지출됩니다.");
		System.out.println("한달이 지났을 때 잔액은 "+ (POCKET_MONEY-(20*(fullWay+lunch)))+"원 입니다.");
		System.out.println();
		
		System.out.println("< Constant의 최대값, 최소값 >");
		System.out.println("byte의 최대값 :  "+Byte.MAX_VALUE+"최소값 : "+Byte.MIN_VALUE);
		System.out.println("short의 최대값 :  "+Short.MAX_VALUE+"최소값 : "+Short.MIN_VALUE);
		System.out.println("int의 최대값 :  "+Integer.MAX_VALUE+"최소값 : "+Integer.MIN_VALUE);
		System.out.println("long의 최대값 :  "+Long.MAX_VALUE+"최소값 : "+Long.MIN_VALUE);
		System.out.println("Character의 최대값 :  "+(int)Character.MAX_VALUE+"최소값 : "+(int)Character.MIN_VALUE);
		System.out.println("float의 최대값 :  "+Float.MAX_VALUE+"최소값 : "+Float.MIN_VALUE);
		System.out.println("double의 최대값 :  "+Double.MAX_VALUE+"최소값 : "+Double.MIN_VALUE);
		System.out.println();
		
		int i=15;
		/*System.out.println(i+"를 1의 보수 연산자를 사용한 값을 그대로, 부호만 변경되게 하기.");
		i=~i;
		System.out.println(i+1);*/
		System.out.println(-i);
		//System.out.println("~"+i+" = "+i);
		
		
	}//main
}//class
