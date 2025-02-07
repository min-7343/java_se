package day0121;

/**
 * 0120의 숙제
 */
public class Exam0120 {
	
 public static void main(String[] args) {
		int distance=Integer.parseInt(args[1]);//입력된 이동거리를 저장
		int fare=0;
		//"마을버스", "버스", "지하철"
		//출력 판단 변수 => flag변수 
//		boolean printFlag=args[0].equals("마을버스") || args[0].equals("버스") || args[0].equals("지하철");
		boolean printFlag=false;
		//교통수단별 기본 요금 구하기 : 같은지를 비교 if - equals, switch~case
		switch (args[0]) {
		case "마을버스" :  fare=Transport.VILLAGE_BUS;	 break;
		case "버스" :  fare=Transport.BUS;	 break;
		case "지하철" :  fare=Transport.SUBWAY;	 break;
		}//end switch
		
		printFlag= fare!=0; //요금이 0원이 아니라면 대중교통 수단으로 생각.
		System.out.println(fare);
		if (printFlag) {
			System.out.println("입력하신 교통수단은 [ "+args[0]+" ]이고, 이동 거리는 [ "+ distance +" ]km 입니다.");
			System.out.println("교통수단의 기본 요금 : "+fare+"원 입니다.");
			if (distance>10) {//가산 요금을 구하는 코드를 실행하기 위한 기준
				fare+=(((distance-10)/5)+1)*100;
			}//end if
			
			System.out.println("편도요금 : ["+fare+"]원 입니다.");
			System.out.println("왕복요금 : ["+fare*2+"]원 입니다.");
			System.out.println("한달 "+Transport.FLAG_DAY + "일 기준 총 교통 요금은 [ "+
			(fare*2)*Transport.FLAG_DAY+" ]원 입니다.");
			
		}else {//그 이외에는 잘못 입력 메시지를 출력.
			System.out.println("입력하신 "+ args[0]+"은 대중교통수단이 아닙니다.");
		}
		
	}//main

}//class
