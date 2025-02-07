package day0204;

public class UseArray3 {
	
	public UseArray3() {
		//1.선언 ) 데이터형[][][] 배열명=null;
//		int[][][] arr3=null;
//		//2. 생성) 배열명=new 데이터형[면의 수][행의수][열의수];
//		arr3=new int[3][5][6];//5행 5열이 3면 있다.
//		
		//1+2)
		int[][][] arr3=new int[3][5][6];
		
		System.out.printf("면 %d, 행 %d, 열 %d\n",
				arr3.length, arr3[0].length,arr3[0][0].length);
		
		//3. 값 할당) 배열명[면의번호][행의번호][열의번호]=값;
		for(int i=0;i<arr3.length;i++) {//면
//			System.out.printf("arr3[%d]면이 시작.\n",i);
			for(int j=0;j<arr3[0].length;j++) {//행
//				System.out.printf("arr3[%d][%d]행이 시작.\n",i,j);
				for(int k=0;k<arr3[0][0].length;k++) {//열
//					System.out.printf("arr3[%d][%d][%d]=%-5d이 시작.",i,j,k,arr3[i][j][k]);
					if(j==0 || j==arr3[0].length-1 || k==0 || k==arr3[0][0].length-1) {
						arr3[i][j][k]=1;
					}
					System.out.printf("%d\t",arr3[i][j][k] );
				}
				System.out.println();
//				System.out.printf("\narr3[%d][%d]행이 끝.\n",i,j);
			}//end for	
			System.out.println();
//			System.out.printf("arr3[%d]면이 끝.\n",i);
			
		}//end for
		
		//삼차원 배열의 기본형 형식의 사용.
		//면구분괄호와  행구분괄호를 사용해야한다.
		int[][][] arr= {{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}};  //[2][2][3]
		
		System.out.printf("%d면 %d행 %d열\n", arr.length, arr[0].length,arr[0][0].length);
		
		//향상된 for
		for(int[][] twoArr : arr) {//삼차원 배열의 한 며은 이차원 배열로 이루어져 있다.
			for( int[] oneArr: twoArr) {//이차원 배열의 한 행은 일차원 배열로 이루어져 있다.
				for( int value: oneArr) {//일차원 배열은 단일 형으로 이루어져있다.
					System.out.printf("%d\t",value);
				}//end for
				System.out.println();
			}//end for
			System.out.println();
		}//end for
		
		
		
		//4. 값 사용) 배열명[면의번호][행의번호][열의번호]
		
		}//UseArray3

	public static void main(String[] args) {		
		new UseArray3();
	
	
	}//main
	
}//class
