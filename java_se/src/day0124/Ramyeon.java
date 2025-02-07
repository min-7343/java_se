package day0124;

/**
 * 명사적 기능 : 라면이름, 종류, 개수 동사적 기능 : 먹는다, 맛
 */

public class Ramyeon {
   private String name, taste, type;
   private int price, count;

   /**
    * 라면의 기본 생성자
    */
   public Ramyeon() {

   }

   /**
    * 오버라이딩한 라면의 생성자<br>
    * method overload
    * @param type  종류(컵, 봉지)
    * @param name  라면의 이름
    * @param spicy 맛
    * @param price 가격
    * @param count 개수
    */
   public Ramyeon(String type, String name, String taste, int price, int count) {
      this.type = type;
      this.name = name;
      this.taste = taste;
      this.price = price;
      this.count = count;
   }

   /**
    * 생성된 라면의 종류
    * @param type 종류(컵, 봉지)
    */
   public void setType(String type) {
      this.type = type;
   }

   /**
    * 생성된 라면의 타입을 반환하는 일
    * @return 종류(컵, 봉지)
    */
   public String getType() {
      return type;
   }

   /**
    * 생성된 라면 객체에 이름을 넣는 일 구현
    * @param name 설정할 이름
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * 생성된 라면 객체에 이름을 반환하는 일
    * @return 설정할 이름
    */
   public String getName() {
      return name;
   }

   /**
    * 생성된 라면 객체의 가격을 넣는 일
    * @param price 가격
    */
   public void setPrice(int price) {
      this.price = price;
   }

   /**
    * 생성된 라면 객체의 가격을 반환하는 일
    * @return 설정할 가격
    */
   public int getPrice() {
      return price;
   }

   /**
    * 생성된 라면 객체의 맛을 넣는 일
    * @param taste 맛
    */
   public void setTaste(String taste) {
      this.taste = taste;
   }

   /**
    * 생성된 라면 객체의 수를 넣는 일
    * @param count 개수
    */
   public void setCount(int count) {
      this.count = count;
   }

   /**
    * 생성된 라면 객체의 수를 반환하는 일
    * @return 개수
    */
   public int getCount() {
      return count;
   }

   /**
    * 생성된 라면 객체의 맛을 반환하는 일
    * @return 맛
    */
   public String getTaste() {
      return taste;
   }

   /**
    * 생성된 라면 객체를 설명하는 일
    * @param type  종류(컵, 봉지)
    * @param name  설정할 이름
    * @param price 가격
    * @param taste 맛
    * @param count 개수
    * @return 생성된 라면에 대해 출력하는 일
    */
   public String eat(String type, String name, String taste, int price, int count) {
      return "고른 라면은 (" + type + ")" + name + ", " + taste + "맛 입니다. 가격은 " + price + "원입니다.\n => 개수는 " + count
            + "개, 총 가격은 " + price * count + "원 입니다.\n";
   }

}
