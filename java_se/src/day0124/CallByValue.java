package day0124;

/**
 * method의 매개변수가 기본형 데이터 형으로 선언되어 있다면 할당되는 값은 복사되어 들어간다.
 */
public class CallByValue {

	public void swap(int i, int j) {
		int temp =0;
		temp=i;
		i=j;
		j=temp;
		System.out.printf("swap method 안 i : %d, j : %d\n",i, j);
	}//swap
	public static void main(String[] args) {
		
		CallByValue cbv =new CallByValue();
		int i=2025;
		int j=1;
		System.out.printf("swap method 흐름 전 i : %d, j : %d\n",i, j);
		cbv.swap(i, j);
		System.out.printf("swap method 흐름 후 i : %d, j : %d\n",i, j);
	}//main
}//class
