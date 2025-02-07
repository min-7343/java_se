package day0121;

public class ExamFor250121 {

	public static void main(String[] args) {
		// 출력될 수 있돓ㄱ for문을 사용해 보세요
//		0
//		 1
//		  2
//		   3
//		    4
//		     5
		for (int i = 0; i < 6; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			} // end for
			System.out.println(i);
		} // end for

//		for문을 사용하여 1월 달력을 출력해 보세요.
//		공백이 필요하면 '\t'특수문자로 공백을 구분하세요.
//
//		일  월  화  수  목  금  토
//		          1    2   3    4
//		  5   6    7     8   9  10  11
//		  12 13  14  15  16  17  18
//		  19  20  21  22  23  24  25
//		  26  27  28  29  30  31

//		int month=Integer.args[0];
//		String startDay=String.args[1];
		System.out.println();
		int temp2=3;
		System.out.println("\t\t  =====달력 출력====");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		for (int k = 1; k < 35; k++) {
			if (k<4) {
				System.out.print("\t");
			}else if (3<k && k<10) {
				System.out.print(" "+ (k-3)+"\t");
			}else {
				System.out.print((k-3)+"\t");
			}
			if (k%7==1) {
				System.out.println();
			}
		}
		
		System.out.println("\n");
		int month = Integer.parseInt(args[0]);// 달
		int lastDate = Integer.parseInt(args[2]);// 마지막날짜
		int temp = 0;

		if (0 > month || month > 13) {// month 확인
			System.out.println("잘못된 달 입니다.");
		} else {
			if (args[1].equals("월") || args[1].equals("화") || args[1].equals("수") || args[1].equals("목")
					|| args[1].equals("금") || args[1].equals("토")) {

				switch (args[1]) {
				case "일": temp = 1; break;
				case "월": temp = 2; break;
				case "화": temp = 3; break;
				case "수": temp = 4; break;
				case "목": temp = 5; break;
				case "금": temp = 6; break;
				case "토": temp = 7; break;
				}//end switch
				if (lastDate == 28 || lastDate == 30 || lastDate == 31) {
					System.out.println("\t\t  "
							+ "=== " + month + "월 달력 ===");
					System.out.println("일\t월\t화\t수\t목\t금\t토");
					for (int i = 1; i < temp; i++) {
						System.out.print("\t ");
					}
					for (int i = 0; i < lastDate; i++) {
						if ((i + temp) % 7 == 0) {
							System.out.println((i + 1));
						} else {
							System.out.print((i + 1) + "\t");
						}
					}//end lastDate
				} else {
					System.out.println("마지막 일을 잘못 입력하셨습니다.");
				}
			} else {
				System.out.println("요일을 잘못 입력하셨습니다.");
			} // end else 요일확인
		}//end month

	}// main
}// class
