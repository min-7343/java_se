package day0122;

public class Exam0122 {

   void fullName() {//이름출력하기 고정일
      System.out.println("1번 김민경");
   }

   void firstName(String name) {//성 출력  고정값
      System.out.println("2번 성 : " + name.charAt(0));
   }

    void scoreJu(int sc) {//점수 판정기  가변일
      System.out.println("3번 점수 판정기");
      System.out.println("점수 : " + sc);
      if (sc < -1 && sc > 101) {  //비교당하는 값(score) > 기준 값(101)
         System.out.println("잘못된 점수");
      } else {
         switch (sc / 10) {
         case 0, 1, 2, 3:
            System.out.println("과락");
            break;
         case 4, 5:
            System.out.println("다른 과목 참조");
            break;
         case 6, 7, 8, 9, 10:
            System.out.println("합격");
            break;
         }//end switch
      }//end if~else
   }// end scoreJu

   public void charJu(char ch, int... i) { //가변일
      System.out.println("4번 입력받은 문자 : " + ch);
      if ('A' <= ch && ch <= 'Z') {
         System.out.println(ch + " - 대문자");
      } else if ('a' <= ch && ch <= 'z') {
         System.out.println(ch + "- 소문자");
      } else if ('0' <= ch && ch <= '9') {
         System.out.println(ch + " - 숫자");
      } else {
         System.out.println("대문자, 소문자, 숫자 모두 아닙니다.");
      }
   }// end charJu

    int ageJu(int year) {//가변값
      int myAge = 2025 - year + 1;
      return myAge;
   }

    int threeJu(int num1, int num2, int num3) {//가변값
      int temp = 0;
      if (num1 < num2) {
         temp = num1;
         if (num1 < num3) {
         } else {
            temp = num3;
         } // end else
      } else if (num2 < num3) {
         temp = num2;
      } else {
         temp = num3;
      }
      return temp;
   }
    
    


   public static void main(String[] args) {

      // 1. 자신의 이름을 콘솔에 출력하는 method
      // 2. 자신의 이름 중 "성"을 반환하는 method
      // 3. 점수를 입력받아서 점수의 판정을 콘솔에 출력하는 method
      // 점수는 0~100사이일때만 판정을 한다. 그렇지 않으면 "잘못된 점수"를 출력한다.
      // 0~39 - 과락 40~59 - "다른과목참조" 60~100 - 합격 을 출력
      // 4. 문자를 입력 받아서 해당문자가 "대문자"인지 "소문자"인지 "숫자"인지를 판단하여 콘솔에 출력하는 method를 작성
      // 태어난 해를 입력 받아서 반환하는 method 작성
      // 6. 숫자 3개를 입력 받아서 가장 작을 수를 반환하는 method작성.
      Exam0122 fn = new Exam0122();
      System.out.println("-------------------------");
      fn.fullName();
      System.out.println("-------------------------");
      String nameStr = "김민경";
      fn.firstName(nameStr);
      System.out.println("-------------------------");
      fn.scoreJu(52);
      System.out.println("-------------------------");
      fn.charJu('5');
      System.out.println("-------------------------");
      fn.ageJu(1995);
      int age2 = fn.ageJu(1995);
      System.out.println("5번 나이 : " + age2);
      System.out.println("-------------------------");
      fn.threeJu(99, 45, 64);
      int smallNum = fn.threeJu(99, 45, 64);
      System.out.print("6번 가장작은 숫자 : "+smallNum);
      
   }// main

}// class
