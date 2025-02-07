package day0131;

public class ResidentNumber {
   private String ssn;//주민번호
   private int fullYear;//태어난 4자리 연도
   public static final int SSN_LENGTH=14;//주민번호 14자리
   public static final int DASH_POSITION=6;//"-"의 위치
   
   /**
    * 기본 생성자<br>
    */
   public ResidentNumber() {
   }//ResidentNumber
   
   /**
    * 생성자<br>
    * 오버라이딩<br>
    * @param ssn 받은 주민번호
    */
   public ResidentNumber(String ssn) {
      this.ssn=ssn;
   }//ResidentNumber
   
   /**
    * 생성된 객체의 주민번호 출력<br>
    */
   public void printSsn() {
      System.out.println("주민번호: "+this.ssn);
   }//printSsn
   
   /**
    * 주민번호의 길이가 14자리가 맞는지 확인<br>
    * @param ssn 주민번호 14자리
    * @return 14가 맞으면 true, 아니면 false 반환
    */
   public boolean vaildSsnLenght() {
      if(ssn.length()==SSN_LENGTH) {
//         System.out.println("true");
         return true;
      }else {
//         System.out.println("false");
         return false;
      }//end else vaildSsnLenght
   }//vaildSsnLenght
   
   /**
    * '-'자리가 6번째가 맞는지 확인하는 boolean<br>
    * @return '-'의 자리가 6번째가 맞으면 true 아니면 false 반환
    */
   public boolean dashPosition() {
      if(ssn.indexOf("-")==DASH_POSITION) {
//         System.out.println("6번째 맞습니다.");
         return true;
      }else {
//         System.out.println("6번째 아닙니다.");
         return false;
      }//end else dashPosition
   }//dashPosition
   
   /**
    * 생년월일을 반환하는 연산<br>
    * 0,1번: 년도, 2,3번: 달, 4,5번: 일, 6번:- ,7번: 성별<br>
    * 7번째 숫자로 파악한 태어난 연도<br>
    * 0,9: 1800년대, 1,2,5,6: 1900년대 3,4,7,8: 2000년대<br>
    * @return xxxx년xx월xx일
    */
   public String birth() {//'=='로 만들어서 해보기
      String result =""; //결과출력저장소
      //주민번호 7번째 - 성별
      int gender = Integer.parseInt(ssn.substring(7,8));
      int representYear=0;//4자리 연도
      
      String year=ssn.substring(0,2);
      String month=ssn.substring(2,4);
      String day=ssn.substring(4,6);
      
      switch(gender) {
      case 0,9: representYear=18; break;
      case 1,2,5,6: representYear=19;break;
      case 3,4,7,8: representYear=20;break;
      }//end switch(gender)
      
      this.fullYear=Integer.parseInt(representYear+year);
      result=this.fullYear +"년 "+ month+"월 "+day+"일";
      return result;
   }//birth
   
   /**
    * 나이를 계산하는 method<br>
    * @return 나이
    */
   public int age() {
      return 2025-this.fullYear+1;
   }//age
   
   /**
    * 국적을 판별하는 method<br>
    * 7번째 숫자가<br>
    * 0,1,2,3,4,9: 내국인<br>
    * 5,6,7,8 : 외국인<br>
    * @return 내,외국인
    */
   public String nation() {
      String str="";
      int foreign=Integer.parseInt(ssn.substring(7,8));
      switch(foreign) {
      case 0,1,2,3,4,9: str="내국인"; break;
      case 5,6,7,8 : str="외국인"; break;
      }
      return str;
   }//nation
   
   /**
    * 성별을 판단하는 method<br>
    * 7번째 숫자가<br>
    * 0,1,3,5,7: 남성<br>
    * 2,4,6,8,9: 여성<br>
    * @return 남성 여성
    */
   public String genderClassification() {
      String gender="";
      int num=Integer.parseInt(ssn.substring(7,8));
      switch(num) {
      case 0,1,3,5,7: gender="남성"; break;
      case 2,4,6,8,9 : gender="여성"; break;
      }//end switch(num)
      return gender;
   }//end genderClassification
   
   /**
    * 띠를 알아보는 method<br>
    * @return 띠
    */
   public String zodiacSign() {
      String zodiac="";
      int sign = this.fullYear % 12;
      switch(sign) {
      case 0: zodiac="쥐"; break;
      case 1: zodiac="소"; break;
      case 2: zodiac="호랑이"; break;
      case 3: zodiac="토끼"; break;
      case 4: zodiac="용"; break;
      case 5: zodiac="뱀"; break;
      case 6: zodiac="말"; break;
      case 7: zodiac="양"; break;
      case 8: zodiac="원숭이"; break;
      case 9: zodiac="닭"; break;
      case 10: zodiac="개"; break;
      case 11: zodiac="돼지"; break;
      }//end switch sign
      return zodiac;
   }//zodiacSign
   
   
   
}//ResidentNumber
