package Ch11;

import java.util.*;

public class ArrayListEx {
   public static void main(String[] args) {
      ArrayList list1 = new ArrayList<>(10);
      // list1.add(new Integer(5));
      list1.add(5); // 5는 자동으로 new Integer(5)가 되서 컴파일됨
      list1.add(4);
      list1.add(2);
      list1.add(0);
      list1.add(1);
      list1.add(3);

      // System.out.println(list1);

      ArrayList list2 = new ArrayList<>(list1.subList(1, 4)); // subList(from, to) from인덱스 부터 to인덱스 사이에 저장된 객체를 반환
      // System.out.println(list2);
      print(list1, list2);

      Collections.sort(list1);
      Collections.sort(list2);
      print(list1, list2);

      System.out.println("list1.containsAll(list2): " + list1.containsAll(list2)); // 객체 list2가 list1에 포함되어 있는지 확인

      list2.add("B");
      list2.add("C");
      list2.add(3, "A");
      print(list1, list2);

      list2.set(3, "AA"); // set(int index,Object element) 주어진 객체(element)를 지정된 위치에 저장한다.
      print(list1, list2);

      // boolean retainAll(Collection c) ArrayList에 저장된 객체 중에서 주어진 컬렉션과 공통된 것들만을 남기고
      // 나머지는 삭제한다.
      // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
      System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
      print(list1, list2);

      // list2에 list1과 같은 요소가 있을경우 삭제함
      for (int i = list2.size() - 1; i >= 0; i--) {
         if (list1.contains(list2.get(i))) // Object get(int index) 지정된 위치에 저장된 객체를 반환한다.
            list2.remove(i); // 인덱스가 i인 곳에 저장된 요소를 삭제
      }
      print(list1, list2);

   }

   static void print(ArrayList list1, ArrayList list2) {
      System.out.println("list1: " + list1);
      System.out.println("list2: " + list2);
      System.out.println();
   }
}
