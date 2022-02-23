package Ch11;

import java.util.*;

public class HashSetEx2 {
   public static void main(String[] args) {
      Set set = new HashSet<>(); // HashSet - 순서x, 중복x

      while (set.size() < 6) {
         int num = (int) (Math.random() * 45) + 1;
         set.add(num);
      }
      System.out.println(set);
      System.out.println("= After sort = ");
      List list = new LinkedList<>(set); // LinkedList - 순서o, 중복o
      Collections.sort(list);
      System.out.println(list);
   }
}
// Collection은 인터페이스
// Collections는 클래스
