package day0124;

public class UseRamyeon {

    public static void main(String[] args) {
    	//라면객체생성
         Ramyeon rm= new Ramyeon();
         
         System.out.println("라면을 고르세요.(컵/봉지, 라면 이름, 맛(형용사), 가격, 개수 순입니다.)\n");
         System.out.println("--------------------------------------------------------------------------");
         
         System.out.println(rm.eat("컵","신라면","매운", 1300,2));
         System.out.println((rm.eat("봉지","너구리","고소한",1700,1)));
         System.out.println((rm.eat("봉지","안성탕면","담백한",1400,3)));
    }//main
}//class

