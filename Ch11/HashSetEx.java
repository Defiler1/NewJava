package Ch11;

import java.util.*;

public class HashSetEx {
   public static void main(String[] args) {
      Object[] objArr = { "1", 1, "2", "2", "3", "3", "4", "4", "4" };
      Set set = new HashSet<>(); // HashSet에 objArr의 요소들을 저장한다.

      for (int i = 0; i < objArr.length; i++) {
         set.add(objArr[i]);
      }
      // HashSet에 저장된 요소들을 출겨한다.
      System.out.println(set);

      // HashSet에 저장된 요소들을 출력한다.(Iterator이용)
      Iterator it = set.iterator();

      while (it.hasNext())
         System.out.println(it.next());
   }
}
