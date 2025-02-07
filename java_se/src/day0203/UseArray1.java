package day0203;

import day0204.ScoreProcess;

/**
 * 일차원 배열 : 열로만 구성된 배열
 */
public class UseArray1 {
	public UseArray1() {
		// 1.선언 : 데이터형[] 배열명=null;
		int[] arr = null;
//		int arr1[]=null, arr3=null; //배열기호[]는 데이터형 뒤에 작성하는 것을 권장,
		// arr1은 배열, arr3은 그냥 int형 변수
		// 2.생성 : 배열명=new 데이터형[방의수]; //heap에 생성, 모든방 초기화, 크기는 병경된지 않는다.
		arr = new int[5];
		System.out.println("arr의 주소 : " + arr + ", 방의 수 : " + arr.length); // heap의 주소
		System.out.printf("초기화 값 : arr[0]=%d, arr[1]=%d, arr[2]=%d, arr[3]=%d, arr[4]=%d\n", arr[0], arr[1], arr[2],
				arr[3], arr[4]);
		// 3.값할당 : 배열명[방의번호]=값;
		arr[0] = 2025;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 16;
		arr[4] = 46;
		// 4.값사용 : 배열명[방의번호]
		System.out.printf("값 할당 후 : arr[0]=%d, arr[1]=%d, arr[2]=%d, arr[3]=%d, arr[4]=%d\n", arr[0], arr[1], arr[2],
				arr[3], arr[4]);

		// 일괄처리 : 모든 방의 값을 한번에 처리한다.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
			sum += arr[i];
		} // end for
		System.out.println("arr배열 방의 합 : " + sum);

		// 배열 모든 방의 값을 더한 후 평균값을 출력하기
		// 평균은 소수점 이하 두자리까지만 출력.
		sum = 0;
		double average = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			average = sum / arr.length;
		}
		System.out.printf("arr배열의 합 : %d arr배열의 평균 : %.2f\n", sum, average);

	}// UseArray1

	public void usePrimitiveType() {
		System.out.println("----------------------------------------------------------");
		// 배열에 할당될 값을 알고 있을 때 사용하는 문법.
		// 학생의 점수를 저장하는 배열 선언하고
		// 자바점수 75, 오라클점수 89, jdbc점수 93, html점수 99점 할당

		// 1. 선언 및 값 할당 : 데이터형[] 배열명={값,,,,}
//		int[] scoreArr= new int[]{75,89,93,99}; //new int[]가 생략되어 있는 것. heap에 만들어 진다,
		int[] scoreArr = new int[] { 75, 62, 99, 83 };
		System.out.println("배열 방의 수 : " + scoreArr.length);

		// 2. 일괄처리
		int sum = 0;
		System.out.println("자바\t오라클\tJDBC\tHTML\t총점\t평균");
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%d\t", scoreArr[i]);
			sum += scoreArr[i];
		}
		System.out.printf("%d\t%.2f\n", sum, sum / (double) scoreArr.length);

		// scoreArr 배열 방의 값을 마지막 방부터 처음방까지 출력.
		System.out.println("scoreArr 배열 방의 값을 마지막 방부터 처음방까지 출력");
		for (int i = scoreArr.length - 1; i > -1; i--) {
			System.out.printf("%d\t", scoreArr[i]);
		} // end for

		System.out.println("\n------------------향상된 for------------------");
		sum = 0;
		System.out.println("자바\t오라클\tJDBC\tHTML\t총점\t평균");
		for (int score : scoreArr) {
			System.out.printf("%d\t", score);
			sum += score;
		} // end for
		System.out.printf("%d\t%.2f\n", sum, sum / (double) scoreArr.length);

		// 점수 중: 최고 점수를 출력
		System.out.println("-------------최고점 출력-------------");
		int maxScore = scoreArr[0];
//		for (int i = 1; i < scoreArr.length ; i++) {
//			if (maxScore < scoreArr[i]) {
//				maxScore = scoreArr[i];
//			}//end if
//		}//end for
		
//		//개선된 for
//		for(int tempScore: scoreArr ) {
//			if(maxScore <tempScore) {
//				maxScore = tempScore;
//			}
//		}
		System.out.printf("제일 높은 점수는 %d점 입니다.\n",maxScore);
		
		System.out.println("------------------------------------------------------------");
		
		// 75	62	99	83 => 99	83	75	62 내림차순 정렬
		//앞 방과 다음 방을 비교해서 앞방의 값이 작다면 앞방의 값과 다음 방의 값을 변경한다, 
		//앞방과 그 다음 방을 비교해서 앞방의 값이 작다면 앞방의 값과 그 다음 방의 값을 변경한다.
		//이와 같이 앞방부터 모든 방의 값을 비교해서 끝방까지 비교가 완료되면
		//다음 방도 이전 비교와 동일하게 끝방까지 비교해나간다.
		//모든 방을 비교하지만 가장 마지막 방을 비교하지 않는다.
		//모든 방을 비교하기 때문에 속도가 떨어지는 것이 단점이지만 index에 대한 사용 이해 상승.
		int temp=0;
		for(int i=0;i<scoreArr.length-1;i++) {
			for(int j=i+1;j<scoreArr.length;j++) {
				if(scoreArr[i]<scoreArr[j] ){
					temp=scoreArr[i];
					scoreArr[i]=scoreArr[j];
					scoreArr[j]=temp;
				}// end if
			}//end for
		}//end for
		
		for(int tempScore : scoreArr) {
			System.out.printf("%d\t",tempScore);
		}
				
		

	}// usePrimitiveType

	public static void main(String[] args) {
//	UseArray1 ua = new UseArray1();
//	ua.usePrimitiveType();

		// 객체 생성 후 method를 하나만 호출하는 경우.
		// new 생성자().method명();
		new UseArray1().usePrimitiveType();

	}// main

}// class
