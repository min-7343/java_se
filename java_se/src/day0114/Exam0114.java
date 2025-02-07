package day0114;
class Exam0114{
	public static void main(String[] args) {
		char firtstName='K';
		char middleName1='M';
		char middleName2='G';
		int bornYear=1995;
		int age = 2025-bornYear+1;
		System.out.println("내 이름은 김민경이고 이니셜은 "+firtstName+" "+middleName1+" "+middleName2+"입니다.");
		System.out.println("태어난 해는 "+bornYear+ " 이고,");
		System.out.println("나이는 "+age+"입니다.");
		
		double leftEye=0.7;
		double rightEye=0.7;
		System.out.println("왼눈 시력 "+leftEye+", 오른눈 시력 : "+rightEye+" 이고, 양안 시력은 "+(leftEye+rightEye)/2 + " 입니다.");
		
		int oneWay=1800;
		System.out.println("편도차비: "+oneWay+" 원, 한달 20일 출근하면 월 교통비는 "+oneWay*2*20+"원 입니다.");
		
		char sign='A';
		System.out.println("대문자 "+ sign +"의 값은 65입니다. '"+sign+"'에 32를 더하면 소문자 "+(char)(sign+32)+"를 만들 수 있다.");
		
	}
}
