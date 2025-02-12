package day0212;

import java.util.Calendar;
import static java.lang.Integer.parseInt;

/**
 * 입력된 년과 월로 해당월에 달력을 생성하여 반환하는 일
 */
public class Exam0211 {
	/**
	 * 달력을 생성하는 일
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public String createCalendar(String paramYear, String paramMonth) {
		StringBuilder tempCal = new StringBuilder();

		Calendar cal = Calendar.getInstance();
		// 값이 입력되지 않는 경우의 처리
		int tempYear = 0;
		int tempMonth = 0;
		if ((paramYear != null && !paramYear.isEmpty()) || (paramYear != null && !paramYear.isEmpty())) {
			// 매개변수가 참조형일때는 객체가 생성되었는 지 물어봐야하고 ( !=null)
			// 객체에 따라 열결하여(&&) 추가 작업을 수행해야할 수도 있다. ( isEmpty() )
			tempYear = parseInt(paramYear);
			cal.set(Calendar.YEAR, tempYear);// 값이 있는 경우에
		} // end if

		if ((paramMonth != null && !paramMonth.isEmpty()) || (paramMonth != null && !paramMonth.isEmpty())) {
			// 매개변수가 참조형일때는 객체가 생성되었는 지 물어봐야하고 ( !=null)
			// 객체에 따라 열결하여(&&) 추가 작업을 수행해야할 수도 있다. ( isEmpty() )
			tempMonth = parseInt(paramMonth);
			cal.set(Calendar.MONTH, tempMonth - 1);// 값이 있는 경우에
		} // end if
		System.out.println(cal.get(Calendar.YEAR) + " / " + ((cal.get(Calendar.MONTH)) + 1));

		tempYear = cal.get(Calendar.YEAR);
		tempMonth = cal.get(Calendar.MONTH) + 1;

		cal.set(Calendar.DAY_OF_MONTH, 1);

		tempCal.append("\t\t").append(tempYear).append("년 ").append(tempMonth).append("월\n")
				.append("----------------------------------------------------\n").append("일\t월\t화\t수\t목\t금\t토\n")
				.append("----------------------------------------------------\n");

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//1 일의 요일 얻기 1,2,3,4,5,6,7

		for (int blank = 1; blank < dayOfWeek; blank++) {
			tempCal.append("\t");
		}
//		tempCal.append("1");

		int lastDay = cal.getActualMaximum(Calendar.DATE) + 1;// 해당월의 마지막 날
		for (int tempDay = 1; tempDay < lastDay; tempDay++) {
//			System.out.println(lastDay);
			//증가하는 가싱읠 일(tempDay)로 Calendar 객체를 설정
			cal.set(Calendar.DAY_OF_MONTH,tempDay);
			tempCal.append(tempDay).append("\t");
			
			//가상의 날로 설정된 일자의 요일을 가져와서 
			switch(cal.get(Calendar.DAY_OF_WEEK)) {//일치하는 것 => switch
//			case 7: tempCal.append("\n\n");
			case Calendar.SATURDAY: tempCal.append("\n\n");
			}//end switch

		}//end for

		return tempCal.toString();
	}// createCalendar

	/**
	 * 달력을 출력하는 일
	 * 
	 * @param calendar
	 */
	public void printCalendar(String calendar) {
		System.out.println(calendar);

	}// printCalendar

	public static void main(String[] args) {

		Exam0211 exam = new Exam0211();
		String calendar = exam.createCalendar("", "8");
		exam.printCalendar(calendar);
	}

}
