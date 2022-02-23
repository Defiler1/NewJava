package Ch11;

import java.util.*;

public class HashMapEx2 {
   public static void main(String[] args) {
      HashMap map = new HashMap<>();
      map.put("김자바", 90);
      map.put("김자바", 100);
      map.put("이자바", 100);
      map.put("강자바", 80);
      map.put("안자바", 90);

      Set set = map.entrySet();
      // System.out.println(set);
      Iterator it = set.iterator();

      while (it.hasNext()) {
         Map.Entry e = (Map.Entry) it.next();
         System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
      }
      set = map.keySet(); // HashMap에 저장된 모든 키가 저장된 Set을 리턴
      System.out.println("참가자 명단 : " + set);

      Collection values = map.values(); // HashMap에 저장된 모든 값을 컬렉션형태로 리턴
      // System.out.println(values);
      it = values.iterator();

      int total = 0;

      while (it.hasNext()) {
         int i = (int) it.next();
         total += i;
      }

      System.out.println("총점 : " + total);
      System.out.println("평균 : " + (float) total / set.size());
      System.out.println("최고점수 : " + Collections.max(values));
      System.out.println("최저점수 : " + Collections.min(values));
   }
}
