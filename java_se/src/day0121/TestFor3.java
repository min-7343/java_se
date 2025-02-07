package day0121;

/**
 * for문의 다양한 형태
 */
public class TestFor3 {

	public static void main(String[] args) {
	
		//여러 개의 초기ㅏ값을 가지는 for : 인덱스르 여러개 사용할 수 있다.
		for(int i=0, j=10,k=100;i<10;i++,j--,k+=3) {
			System.out.println("i = "+i+ " , j = "+ j + ", k = "+k);
		}//end for
		
		//무한 루프 : 조건식이 생략
		//증가하는 수를 세는 무한루프
		for(int i=0; ;i++) {
			System.out.println("무한 루프: "+ i);
			if ( i==50) {
				break;
			}
		}//end for
		System.out.println("안녕");
		
		//증가하는 수를 체지 않는 무한루프
	//	for (; ;) {
	//		System.out.println("무한 루프 : ");
	//	}// ctrl + art + delete -> 작업관리자 -> openJDK
		//1~100사이의 홀수를 출력 : continue
		for(int i=1 ;i <101 ; i++) {
			if (i%2==0) {
				continue;
			}//end if
			System.out.print(i+" ");//선택적 반복
		}//end for
		
		
		
	}//main
	
}//class
