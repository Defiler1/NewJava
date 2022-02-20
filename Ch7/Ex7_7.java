package Ch7;

class Outer2 {
   static class Inner2 {
      int iv = 200;
   }
}

public class Ex7_7 {
   public static void main(String[] args) {
      Outer2.Inner2 i = new Outer2.Inner2();
      System.out.println(i.iv);
   }
}
