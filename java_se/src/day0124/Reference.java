package day0124;

/**
 * 주소전달 : 주소 (유일)를 저장하고 있는 객체를 매개변수로 선언하면 유일한 주소가 전달 된다.. 
 */
public class Reference {
	int i;
	int j;
	
	public void swap(Reference r) {
		int temp =0;
		temp=r.i;
		r.i=r.j;
		r.j=temp;
		System.out.printf("swap method 안 i : %d j : %d\n",r.i, r.j);
		//i=1 j=2025
	}//swap

	public static void main(String[] args) {
		
		Reference r= new Reference();
		r.i=2025;
		r.j=1;
		
		System.out.printf("swap method 흐름 전 i : %d  j : %d\n",r.i, r.j); 
		//i=2025.j=1
		r.swap(r);
		System.out.printf("swap method 흐름 후 i : %d  j : %d\n",r.i, r.j);
		
	}//main

}//class
