package day0123;

/**
 * Polymorphism : 다형성
 * - 클래스안에서 같은 이름의 method를 하나만 정의할 수 있다.
 */
public class Overload {
	
	/**
	 * 별 하나를 출력
	 */
	public void printStar() {
		System.out.print("★");
	}//printStar
	
	
	/**별을 입력한 개수로 출력하는 일
	 * method Overload
	 * @param starCnr 출력할 별의 개수
	 */
	public void printStar(int starCnt) {
		for(int i=0; i<starCnt; i++) {
			System.out.print("☆");
		}//end for
	}//printStar	
	
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.printStar();
		ol.printStar(5);
		
	}//main
}//clss
