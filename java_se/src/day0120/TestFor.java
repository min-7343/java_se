package day0120;

/**
 * for : 시작과 끝을 알 때 사용하는 반복문<br> 
 * for( 초기값 ; 조건식 ; 증,감소식){ <br>
 * 	반복수행문장들...<br>
 * }
 */
public class TestFor {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i+" 안녕하세요");
		}//end for
		
		System.out.println("----------------------------------");
		//1에서부터 100까지 1씩 증가하는 값을 옆으로 출력해 보세요.
		
		for(int i=0; i<100; i++) {
			System.out.print((i+1)+" ");
		}

		System.out.println("\n----------------------------------");
		//1에서부터 100까지의 수 중에 짝수만 옆으로 출력해 보세요.
		int cnt=0;
		for(int i=1; i<101; i++) {
			cnt++;
			if (i%2==0) {
			System.out.print(i+" ");
			}//if
		}//for
		System.out.println("\n"+ cnt+ "번 수행");
		System.out.println("\n----------------------------------");
		//1에서부터 100까지의 수 중에 홀수만 옆으로 출력해 보세요.
		for(int i=1; i<101; i++) {
			//++, --, +=, -+ 둥 변수에 값ㅇㄹ 변경하고 유지할 수 있는 연산자르 사용
			cnt++;
			if (i%2==1) {
			System.out.print(i+" ");
			}//if end
		}//for end
		
		System.out.println("\n----------------------------------");
		//대문자를 모두 출력해 보세요,ABC...
		for(char i=65;i<='Z';i++) {// char i=65 -> A
			System.out.print(i+"("+(char)(i+32)+") ");
		}//end for
		
		System.out.println("\n----------------------------------");
		//1에서부터 100가지의 합 출력
		int temp=0;
		for(int i=1; i<101;i++) {
			temp+=i;
		}
		System.out.println("1부터 100까지의 합 : "+temp);
		System.out.println("\n----------------------------------");
	
		//구구단 2단	
		for(int i=1;i<10; i++) {
			System.out.println("2X"+i+"= "+2*i);
		}
		System.out.println("\n----------------------------------");
		//알파벳 Z에서 A까지 출력
		for(char i=90; i>=65; i--) {// char i=65 -> A
			System.out.print(i+" ");
		}//end for
		
		//출력 A(z), B(y)....
		System.out.println("\n----------------------------------");
		char upper='A', lower='z';
		for(int i=0; i<26; i++) {
			System.out.print((upper++) +"("+(lower--)+")"+" ");
		}//for end
		System.out.println("\n----------------------------------");
		//입력받아서 구구단 만들기.
		int multiplicationTable=Integer.parseInt(args[0]);
		if(multiplicationTable>1 && multiplicationTable<10){
			System.out.println("< "+multiplicationTable+"단 >");
			for (int i=1;i<10;i++) {
				System.out.println(multiplicationTable+"x"+i+"="+multiplicationTable*i);
				}
		}else{
			System.out.println("유효한 숫자가 아닙니다.");
		}
		//다중 for문
//		for (int i=2; i<10;++i) {
//			System.out.println();
//			for(int j=1;j <10 ;j++) {
//				System.out.println(i+"x"+j+"="+(i*j));
//			}

	}//main
}//class
