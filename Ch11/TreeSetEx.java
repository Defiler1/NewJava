package Ch11;

import java.util.*;

public class TreeSetEx {
   public static void main(String[] args) {
      Set set = new TreeSet(); // 범위검색, 정렬, 정렬 필요없음
      // Set set = new HashSet<>(); // 정렬 필요

      while (set.size() < 6) {
         int num = (int) (Math.random() * 45) + 1;
         set.add(num);
         // set.add(new Integer(num));
      }
      // List list = new LinkedList<>(set);
      // Collections.sort(list);
      // System.out.println(list);
      System.out.println(set);
   }
}
