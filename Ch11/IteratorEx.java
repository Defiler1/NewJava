package Ch11;

import java.util.*;

public class IteratorEx {
   public static void main(String[] args) {
      ArrayList list = new ArrayList<>();
      list.add("1");
      list.add("2");
      list.add("3");
      list.add("4");
      list.add("5");

      Iterator it = list.iterator();

      while (it.hasNext()) {
         Object obj = it.next();
         System.out.print(obj);
      }
      System.out.println();
      // List클래스들은 iterator대신 for문과 get()으로도 모든 요소 출력 가능
      for (int i = 0; i < list.size(); i++) {
         Object obj = list.get(i);
         System.out.print(obj);
      }
   }
}
