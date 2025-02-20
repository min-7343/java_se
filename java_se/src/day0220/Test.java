package day0220;


public class Test {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=10;
		arr[5]=60;
		
		try {
			Class.forName("java.lang.String"); //C 대문자
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
