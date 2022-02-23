package Ch11;

import java.util.*;

public class StackQueueEx3 {
   static Queue q = new LinkedList();
   static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.

   public static void main(String[] args) {
      System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

      while (true) {
         System.out.print(">>");
         try {
            // 화면으로 부터 라인단위로 입력받는다
            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim(); // trim()문자열의 앞뒤 공백 없애줌

            if ("".equals(input)) // 입력된 문자열이 빈 문자열이면 다시 위로가서 입력받음
               continue;
            if (input.equalsIgnoreCase("q")) { // equals와 같지만 대소문자를 구별안함
               System.exit(0); // exit() - 0일때 정상종료 1일때 비정상 종료
            } else if (input.equalsIgnoreCase("help")) {
               System.out.println(" help - 도움말을 보여줍니다.");
               System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
               System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
            } else if (input.equalsIgnoreCase("history")) {
               int i = 0;
               // 입력받은 명령어를 저장
               save(input);

               // LinkedList와 내용을 보여준다.
               LinkedList tmp = (LinkedList) q; // 아래서 ListIterator를 위해 queue인 q를 List로 구현
               ListIterator it = tmp.listIterator();

               while (it.hasNext()) // 큐에 저장된 요소가 있으면 요소를 출력
                  System.out.println(++i + "." + it.next());
            } else {
               save(input);
               System.out.println(input);
            } // if(input.equalsIgnorecase("q"))
         } catch (Exception e) {
            System.out.println("입력오류 입니다.");
         }
      } // while(true)
   } // main()

   public static void save(String input) {
      // queue에 저장
      if (!"".equals(input))
         q.offer(input);

      // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
      if (q.size() > MAX_SIZE) // size()는 collection인터페이스에 정의
         q.remove();
   }
} // end of class
