package Ch11;

import java.util.*;

public class ArraysEx {
   public static void main(String[] args) {
      int[] arr = { 0, 1, 2, 3, 4 };
      int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

      System.out.println("arr=" + Arrays.toString(arr));
      System.out.println("arr2D=" + Arrays.deepToString(arr2D)); // 2차원 배열의 출력은 deepToString()을 이용

      int[] arr2 = Arrays.copyOf(arr, arr.length); // arr배열을 전체복사
      int[] arr3 = Arrays.copyOf(arr, 3); // arr배열 인덱스번호 3까지 복사(3은 미포함)
      int[] arr4 = Arrays.copyOf(arr, 7); // arr배열 인덱스번호 7까지 복사(7 미포함) 더이상 복사할게 없으면 0입력
      int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr배열 인덱스번호 2부터(포함) 4까지(미포함) 복사
      int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr배열 인덱스번호 0부터(포함) 7까지(미포함) 복사 더이상 복사할게 없으면 0입력

      System.out.println("arr2=" + Arrays.toString(arr2));
      System.out.println("arr3=" + Arrays.toString(arr3));
      System.out.println("arr4=" + Arrays.toString(arr4));
      System.out.println("arr5=" + Arrays.toString(arr5));
      System.out.println("arr6=" + Arrays.toString(arr6));

      int[] arr7 = new int[5];
      Arrays.fill(arr7, 9); // 배열을 9로 채움
      System.out.println("arr=7" + Arrays.toString(arr7));

      Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1); // 화살표함수
      System.out.println("arr=7" + Arrays.toString(arr7)); // setAll(배열명, 함수 또는 람다식)

      for (int i : arr7) { // for in 문으로 이해하면됨
         char[] graph = new char[i];
         Arrays.fill(graph, '*');
         System.out.println(new String(graph) + i);
      }

      String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
      String[][] str2D2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };

      System.out.println(Arrays.equals(str2D, str2D2)); // equals는 일차원 배열에 사용
      System.out.println(Arrays.deepEquals(str2D, str2D2)); // deepEquals는 이차원 배열에 사용

      char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

      System.out.println("chArr=" + Arrays.toString(chArr));
      System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B')); // binarySearch()는 배열을 먼저 정렬하고 사용해야한다.
      System.out.println("= After sorting = ");
      Arrays.sort(chArr);
      System.out.println("chArr=" + Arrays.toString(chArr));
      System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B'));
   }
}
