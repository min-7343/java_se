package day0204;

/**
 * 행과 열로 구성된 이차원 배열.
 */
public class UseArray2 {
	public UseArray2(){
		//1. 선언 ) 데이터형[][] 배열명 =null;
//		int[][] arr2= null;
		//2. 생성 ) 배열명=new 데이터형[행의수][열의수]; //모든 방의 값은 초기화된다.
//		arr2=new int[3][4];
		
		//1+2)
		int[][] arr2=new int[3][4];//모든방의 값은 초기화된다.
		
		System.out.printf("arr2배열의 행의 수 %d, 열의 수 %d\n",
				arr2.length, arr2[0].length);
		
		//3. 값할당 ) 배열명[행의번호][열의번호];
		arr2[0][0]=2025;
		arr2[0][1]=2;
		arr2[0][2]=4;
		arr2[0][3]=11;
		
		//4. 값사용 ) 배열명[행의번호][열의번호];
		System.out.println("arr2[0][0]= "+arr2[0][0]);
		System.out.println("arr2[0][1]= "+arr2[0][1]);
		System.out.println("arr2[0][3]= "+arr2[0][3]);
		System.out.println("arr2[2][0]= "+arr2[2][0]);
		System.out.println("arr2[2][1]= "+arr2[2][1]);
		System.out.println("arr2[2][3]= "+arr2[2][3]);
		System.out.println("------------------------------------------");
		//일괄처리 : 인덱스가 2개 필요( 행, 열 하나씩)
		for(int i=0;i<arr2.length;i++) {//행의 인덱스를 사용하기 위한 for
			System.out.printf("arr2[%d]행 시작\n",i);
			for(int j=0;j<arr2[i].length;j++) { //열의 인덱스를 사용하기 위한 for
				System.out.printf("arr2[%d][%d]=%-5d", i,j,arr2[i][j]);
			}//end for
			System.out.printf("\narr2[%d]행 끝\n",i);
		}	//end for
		
		
		//이차원 배열의 한행은 일차원 배열로 이루어져 있다.
		System.out.println(arr2[0]);//주소 나온다
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		//이차원 배열의 한행을 일차원 배열에 할당 할 수 있다.
		int[] tempArr=arr2[0];
		//일차원 배열의 값을 이차원 배열의 행에 할당 할 수 있다.
//		arr2[2]=tempArr;
		for(int value : tempArr) {
			System.out.println(value);
		}
		
		System.out.println("--------------향상된 for-------------");
		for(int[] arr : arr2) {// 행 : 이차원 배열의 한 행은 일차원 배열로 이루어져 있다. 
			for(int value :arr) {//열 : 일차원 배열의 한 열은 단일형으로 이루어져 있다.
				System.out.printf("%d\t",value);
			}//end for
			System.out.println();
		}//end for
		
		
	}//UseArray2

	public static void main(String[] args) {
		new UseArray2();

	}//main

}//class
