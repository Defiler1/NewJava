package Ch11;

import java.util.*;

public class StackQueueEx2 {
   public static void main(String[] args) {
      // if (args.length != 1) {
      // System.out.println("Usage:java StackQueueEx2 \" EXPRESSION\"");
      // System.out.println("Example:java StackQueueEx2 \"((2+3)*1)+3\"");
      // System.exit(0);
      // }
      // run configulation argument 설정

      Stack st = new Stack<>();
      // String expression = args[0];
      String expression = "((2+3)*1)+3";

      System.out.println("expression:" + expression);

      try {
         for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
               st.push(ch + "");
            } else if (ch == ')') {
               st.pop();
            }
         }

         if (st.isEmpty()) {
            System.out.println("괄호가 일치합니다.");
         } else {
            System.out.println("괄호가 일치하지 않습니다.");
         }
      } catch (EmptyStackException e) { // 닫는 괄호가 더 많을때 EmptyStackException
         System.out.println("괄호가 일치하지 않습니다.");
      }
   }
}
