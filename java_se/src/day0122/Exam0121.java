package day0122;

/**
 * 
 */

public class Exam0121 {
/**
 * 줄변경을 저장하고 있는 Constant 
*/
	public static final int NEW_LINE=0;
	
	
	public static void main(String[] args) {
		System.out.println("\t\t\t 1월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int dayOfMonth=0;//요일을 저장하기 위한 변수 : 일요일부터 0으로 매칭
		
		switch(args[1]) {
		case "일" : dayOfMonth=0; break;
		case "월" : dayOfMonth=1; break;
		case "화" : dayOfMonth=2; break;
		case "수" : dayOfMonth=3; break;
		case "목" : dayOfMonth=4; break;
		case "금" : dayOfMonth=5; break;
		case "토" : dayOfMonth=6; break;
		}
		
		int lastDayOfMonth=Integer.parseInt(args[2])+1;
		///////달력출력///////////
		for (int i=0; i<dayOfMonth;i++) {
			System.out.print("\t");
		}//end for
		//1월 1~31까지 존재
		
		for(int day=1; day<(lastDayOfMonth);day++) {
			System.out.print(day+"\t");//요일을 출력
			//토요일(? -7)이면 줄을 변경
			dayOfMonth++;
			switch(dayOfMonth%7) {
			case NEW_LINE:
				//System.lineSeparator() Java가 실행되는 운영체제에서 사용하는 개행문자
				//window (\r\n). linux, unix(\n)을 변환하는 일
				System.out.print(System.lineSeparator());
			}
		}

	}//main

}//class
