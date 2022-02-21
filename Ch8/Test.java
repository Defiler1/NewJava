package Ch8;

public class Test {
   public static void main(String[] args) {
      try {
         System.out.println(0 / 0);
      } catch (ArithmeticException ae) {
         ae.printStackTrace();
         System.out.println(ae.getMessage());
      }
   }
}
