package day0204;

/**
 * char형으로 배열을 만들고, 출력을 하면 주소가 아닌 배열의 값이 그대로 출력된다.
 */
public class UseCharArr {
	

	public static void main(String[] args) {
//		double[] dArr=new double[4];
		double[] dArr= {1.2, 3.14, 2025.2 };
		boolean[] bArr= {true, false, false};
		String[] sArr= {"안녕", "오늘은 화요일","입니다."};
		
		System.out.println( dArr );// 배열의 객체를 출력하면 주소 출력
		System.out.println( bArr );// 배열의 객체를 출력하면 주소 출력
		System.out.println( sArr );// 배열의 객체를 출력하면 주소 출력
		
		char[] cArr= {'이','것','이',' ','자','바','다','!','숙','제','멈','춰'};
		for(int i=0;i<cArr.length;i++) {
			System.out.print(cArr[i]);
		}//end for
		System.out.println(cArr); //char형은 출력하면 문자열로 출력
		
		
	}//main

}//class
