package Ch7;

class Outer {
   Inner i = new Inner();

   class Inner {
      int iv = 100;
   }
}

public class Ex7_6 {
   public static void main(String[] args) {
      Outer o = new Outer();
      System.out.println(o.i.iv);
   }
}
