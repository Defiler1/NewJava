package Ch11;

import java.util.*;

class Person {
   String name;
   int age;

   @Override
   public boolean equals(Object o) { // equals는 객체끼리 내용 비교 Call by value
      if (o == this)
         return true;
      if (!(o instanceof Person)) {
         return false;
      }
      Person person = (Person) o;
      return Objects.equals(name, person.name) && age == person.age;
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, age);
   }

   Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public String toString() {
      return name + ":" + age;
   }
}

public class HashSetEx3 {
   public static void main(String[] args) {
      HashSet set = new HashSet<>();
      set.add("abc");
      set.add("abc");
      set.add(new Person("David", 10));
      set.add(new Person("David", 10));
      // HashSet의 add()메서드는 새로운 요소를 추가하기 전에 추가하려는 요소의 equals()와 hashCode()를 호출
      // 고로 상황에 맞게 equals()와 hashCode() 메서드 오버라이딩

      System.out.println(set);

   }
}
