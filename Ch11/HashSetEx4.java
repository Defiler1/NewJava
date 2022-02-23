package Ch11;

import java.util.*;

public class HashSetEx4 {
   public static void main(String[] args) {
      HashSet setA = new HashSet<>();
      HashSet setB = new HashSet<>();
      HashSet setHab = new HashSet<>();
      HashSet setKyo = new HashSet<>();
      HashSet setCha = new HashSet<>();

      setA.add("1");
      setA.add("2");
      setA.add("3");
      setA.add("4");
      setA.add("5");
      System.out.println("A = " + setA);

      setB.add("4");
      setB.add("5");
      setB.add("6");
      setB.add("7");
      setB.add("8");
      System.out.println("B = " + setB);

      // 교집합
      // 공통된 요소만 남기고 삭제
      // setA.retainAll(setB);
      // System.out.println(setA);

      // 합집합
      // setB의 모든 요소를 추가(중복 제외)
      // setA.addAll(setB);
      // System.out.println(setA);

      // 차집합
      // setB와 공통 요소를 제거
      // setA.removeAll(setB);
      // System.out.println(setA);

      Iterator it = setB.iterator();
      while (it.hasNext()) {
         Object tmp = it.next();
         if (setA.contains(tmp)) // setA에 tmp가 있으면
            setKyo.add(tmp); // setB와 setA에 공통으로 있는 요소를 setKyo에 복사해서 저장
      }

      it = setA.iterator();
      while (it.hasNext()) {
         Object tmp = it.next();
         if (!setB.contains(tmp)) // setB에 setA의 요소가 없을때
            setCha.add(tmp); // setCha에 복사해서 저장
      }

      it = setA.iterator();
      while (it.hasNext())
         setHab.add(it.next()); // setHab에 setA의 모든 요소 저장

      it = setB.iterator();
      while (it.hasNext())
         setHab.add(it.next()); // setHab에 setB의 모든 요소 저장
      // 기존에 있던 setA의 요소들과 중복 되는건 set이기 때문에 자동적으로 중복 지워짐

      System.out.println("A 교집합 B = " + setKyo);
      System.out.println("A 합집합 B = " + setHab);
      System.out.println("A 차집합 B = " + setCha);
   }
}
