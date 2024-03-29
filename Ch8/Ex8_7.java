package Ch8;

import java.util.*;

public class Ex8_7 {
   public static void main(String[] args) {
      // 1~100사이의 임의의 값을 얻어서 answer에 저장
      int answer = (int) (Math.random() * 100) + 1;
      int input = 0; // 사용자 입력을 저장할 공간
      int count = 0; // 시도횟수를 세기 위한 변수

      do {
         count++;
         System.out.print("1과 100사이의 값을 입력하세요: ");
         // input = new Scanner(System.in).nextInt();
         try {
            input = new Scanner(System.in).nextInt();

         } catch (InputMismatchException e) {
            System.out.print("유효하지 않은 값");
            continue;
         }

         if (answer > input) {
            System.out.println("더 큰수 입력");
         } else if (answer < input) {
            System.out.println("더 작은 수 입력");
         } else {
            System.out.println("맞췄습니다.");
            System.out.println("시도 횟수는 " + count + "번입니다.");
            break;
         }
      } while (true);
   }
}
