package Ch11;

import java.util.*;

public class StackQueueEx {
   public static void main(String[] args) {
      Stack st = new Stack();
      Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList를 사용

      st.push("0");
      st.push("1");
      st.push("2");

      q.offer("0");
      q.offer("1");
      q.offer("2");

      System.out.println("= Stack =");
      while (!st.empty()) { // Stack이 비어있는지 알려줌
         System.out.println(st.pop()); // Stack에서 객체를 꺼내서 반환, 비어있으면 EmptyStack Exception 반환
      }

      System.out.println("= Queue =");
      while (!q.isEmpty()) { // Queue가 비어있는지 알려줌
         System.out.println(q.poll()); // Queue에서 객체를 꺼내서 반환, 비어있으면 null반환
      }
   }
}
