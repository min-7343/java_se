package day0131;

public class UseResidentNumber {
   public void printUseResidentNumber(ResidentNumber PersonSsn){
      System.out.println("-----------------------------------------------------------");
      if(PersonSsn.vaildSsnLenght()) {
         if(PersonSsn.dashPosition()) {
            PersonSsn.printSsn();
            System.out.println("생일 : "+PersonSsn.birth());//생년월일
            System.out.println("나이 : "+PersonSsn.age());//나이
            System.out.println("국적 : "+PersonSsn.nation());//외국인, 내국인
            System.out.println("성별 : "+PersonSsn.genderClassification());//성별
            System.out.println("띠  : "+PersonSsn.zodiacSign());//띠
         }else {
            System.out.println("\"-\"의 위치가 올바르지 않습니다.");
         }//end else dashPosition()
         
      }else {
         System.out.println("주민번호가 올바르지 않습니다.");
      }//end else vaildSsnLenght
      System.out.println("-----------------------------------------------------------");
   }//printUseResidentNumber
   
   public static void main(String[] args) {
      
      UseResidentNumber urn = new  UseResidentNumber();//객체를 print하는 method 객체생성
      
      String ssn1="950131-1234567";
      ResidentNumber ParkSsn = new ResidentNumber(ssn1);//객체생성ssn1   
      urn.printUseResidentNumber(ParkSsn);//객체를print하는 method 호출
      
      String ssn2="891231-9234789";
      ResidentNumber HonSsn = new ResidentNumber(ssn2);//객체생성ssn2
      urn.printUseResidentNumber(HonSsn);//객체를print하는 method 호출
      
   }//main
}//class
