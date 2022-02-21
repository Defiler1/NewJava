package Ch7;

class Product {
   int price;
   int bonusPoint;

   Product() {
      // 기본생성자 만들어줌
   }

   Product(int price) {
      this.price = price;
      bonusPoint = (int) (price / 10.0);
   }
}

class Tv extends Product {
   Tv() {
      super(1000); // 부모의 생성자를 호출
   }

   public String toString() {
      return "Tv";
   }
}

public class Ex7_3 {
   public static void main(String[] args) {
      Tv t = new Tv();
      System.out.println(t.toString());
   }
}
