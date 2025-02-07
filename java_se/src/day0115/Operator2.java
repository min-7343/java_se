package day0115;
/**
산술 연산자 : 이항 연산(binary operator)
+, -, *, /, %
사용법)
대상체 연산자 대상체
*/
class Operator2 {
	public static void main(String[] args) {
		int year=2025;
		System.out.println(year+"year은 0,1,2,3 4가지 수 중 "+ year % 4+ "에 해당됩니다.");
		
		int num=9;
		System.out.println(num+"는(은) 0, 1, 2가지 수 중 "+num % 2+ "에 해당됩니다.");
		
		int birth = 1995;
		System.out.println(birth+ "는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 중 "+ birth % 12 +"에 해당됩니다.");
	/*
	0-원숭이 ,1-닭, 2-개, 3-돼지, 4-쥐, 5-소, 6-호랑이, 7-토끼, 8-용, 9-뱀, 10-말, 11-양
	*/
	
	}//main
}//class
