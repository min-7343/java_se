package day0204;

/**
 * 가변배열
 * 예 ) 시간마다 변하는 것 ( 시간당 버스 배차시간 )
 */
public class VariableArray {
	public VariableArray() {
		//1.선언) 데이터형[][] 배열명=null;
		int[][] arr=null;
		//2.생성) new 데이터명[행의수][]; //열의 수를 설정하지 않는다.
		arr=new int[5][];
		//3.행마다 열을 생성 ) 배열명[행의번호]=new 데이터형[열의수]; // <-heap에 올라가 자동 초기화
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[] {1,2,3,4,5}; //크기 주면 error
		arr[3]=new int[] {1};
		arr[4]=new int[] {10,20,30,40};
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d]행에 열의 수 %d 개\n", i,arr[i].length);
		}
		
		//4.값할당 ) 배열명[행의번호][열의번호]=값;
		arr[0][0]=10;
		arr[1][1]=10;
		arr[2][3]=50;
		System.out.println();
		//5.값사용 ) 배열명[행의번호][열의번호]
		//개선된 for
		for(int[] oneArr : arr) {//이차원 배열의 한행은 일차원 배열로 이루어져있다.
			for(int value : oneArr) {//일차원 배열의 방은 단일 형으로 이루어져있다.
				System.out.printf("%d\t",value);
			}//end for
			System.out.println();
		}//end for
		
		
		
		
	}//VariableArray

	public static void main(String[] args) {
		new VariableArray();
	}//main

}//class
