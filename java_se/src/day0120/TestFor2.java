package day0120;

/**
 * 다중 for : 바깥 for가 한번 반복할때, 안족 for는 몇번 반복하는 가?<br>
 * for (초기값; 조건식. 증,감소식){ <br>
 * 단일 for 영역 <br>
 * for(초기값; 조건식. 증,감소식){ <br>
 * 단일 for영역 <br>
 * } }
 */
public class TestFor2 {
	public static final int SHUTTLE_BUS = 1200;
	public static final int BUS = 1400;
	public static final int SUBWAY = 1500;
	public static final int MONTH_DAY = 20;

	// int shuttlBus=1200, bus=1400, subway=1500;
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i= " + i + ", j =" + j);
			} // end for
			System.out.println("-------------------------------");
		} // end for

		System.out.println("---------구구단 전단 출력----------------------");
		// 구구단 2단 ~ 9단
		for (int i = 2; i < 10; i++) {
			System.out.println(+i + "단 시작");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			} // end for
			System.out.println(i + "단 끝");
		} // end for
		System.out.println("-------------------------------");
		// 출력하기
		// i j i j i j i j
		// 0 0
		// 1 0 1 1
		// 2 0 2 1 2 2
		// 3 0 3 1 3 2 3 3
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + " " + j + " ");
			} // end for
			System.out.println();
		} // end for
		System.out.println("-------------------------------");
		// 출력
		// i j i j i j i j
		// 0 1 0 2 0 3 0 4
		// 1 2 1 3 1 4
		// 2 3 2 4
		// 3 4
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}

		// 제시된 요금표를 사용하여 콘솔에 출력하는코드 작성
		// 대중교통수단 args[0]과 이동거리 args[1]를 main method의 arguments로 입력 받아 처리하는 프로그램 제작
		// 입력한 대퉁교통 숫단이 "마을 버스","버스", "지하철"인 경우에만 아래의 출력 형식으로 출력하고, 그렇지 않다면 "대퉁교통수단이
		// 아닙니다."를 출력한다.
		// 출력 형식)
		// 입력하신 교통수단은 [xx]이고 이동거리는 [xx]km입니다.
		// 교통수산의 기본요금 : [xx]원
		// 편도요금 : [xx]원 // 이동거리가 10km까지는 기본 요금으로 처리되지만 10km를 초과하면 매 5km마다 100원 요금이 가산된다.
		// 왕복요금 : [xx]원
		// 한달 20일 기준 총 교통요금은 [xx]원 입니다.

		// 마을버스 1200 버스 1400 지하철 1500

		 int distance = Integer.parseInt(args[1]);
		 int shuttlBus=1200, bus=1400, subway=1500;
		 if (args[0].equals("마을버스") || args[0].equals("버스") || args[0].equals("지하철")) {
			 System.out.println("입력하신 교통수단은 [ "+args[0]+ " ]이고 이동거리는 [ "+args[1]+" ]km 입니다.");
			 System.out.print("교통수단의 기본 요금 : ");
			 if (args[0].equals("마을버스")) {
				 System.out.println("["+shuttlBus+"]원");
				 System.out.print("편도요금 : ");
				 if (distance >= 10) {
					 shuttlBus += (((distance-10)/5)+1)*100;
				 }
				 System.out.println(shuttlBus+"원");
				 System.out.println("왕복요금 : "+shuttlBus*2 + "원");
				 System.out.println("한달 20일 기준 총 요금은 "+ 2*20*shuttlBus+ "원 입니다.");
			 }else if (args[0].equals("버스")) {
				 System.out.println("["+bus+" ]원");
				 System.out.print("편도요금 : ");
				 if (distance > 10) {
					 bus += (((distance-10)/5)+1)*100;
				 }
				 System.out.println(bus+"원");
				 System.out.println("왕복요금 : "+shuttlBus*2 + "원");
				 System.out.println("한달 20일 기준 총 요금은 "+ 2*20*bus+ "원 입니다.");
			 }else if (args[0].equals("지하철")) {
				 System.out.println("["+subway+" ]원");
				 System.out.print("편도요금 : ");
				 if (distance >= 10) {
					 subway += (((distance-10)/5)+1)*100; 
				 }
				 System.out.println(subway+"원");
				 System.out.println("왕복요금 : "+shuttlBus*2 + "원");
				 System.out.println("한달 20일 기준 총 요금은 "+ 2*20*subway+ "원 입니다.");
			 }
		 }//if대중교통end
	}//main

}//class