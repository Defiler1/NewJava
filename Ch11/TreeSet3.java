package Ch11;

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TreeSet3 {
   public static void main(String[] args) {
      TreeSet set = new TreeSet<>();
      int[] score = { 80, 95, 50, 35, 45, 65, 10, 100 };

      for (int i : score) { // for in
         set.add(i);
      }

      System.out.println(set);
      System.out.println("50보다 작은 값: " + set.headSet(50)); // 지정된 객체보다 작은 값 리턴(지정된 개체 미포함)
      System.out.println("50보다 큰 값: " + set.tailSet(50)); // 지정된 객체보다 큰 값 리턴 (지정된 객체 포함)
   }
}
