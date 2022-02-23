package Ch11;

import java.util.*;

public class HashMapEx {
   public static void main(String[] args) {
      HashMap map = new HashMap<>();
      map.put("myId", "1234");
      map.put("asdf", "1111");
      map.put("asdf", "1234"); // 이미 존재하는 키 추가기능 기존 값은 없어짐

      System.out.println(map);

      Scanner s = new Scanner(System.in);

      while (true) {
         System.out.println("id를 입력해 주세요.");
         System.out.print("id: ");
         String id = s.nextLine().trim();

         System.out.println("password를 입력해주세요.");
         System.out.print("id: ");
         String password = s.nextLine().trim();
         System.out.println();

         if (!map.containsKey(id)) { // HashMap에 지저된 키가 포함되어 있는지 true,false반환
            // 입력된 id가 포함되어 있지 않을때
            System.out.println("id가 존재하지 않습니다. 다시 입력해 주세요.");
         }

         if (!(map.get(id)).equals(password)) {
            System.out.println("비밀번호가 틀렸습니다.");
         } else {
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
         }

      }
   }
}
