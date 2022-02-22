// package Ch11;

// import java.util.*;

// class Person {
// String name;
// int age;

// @Override
// public boolean equals(Object o) {
// if (o == this)
// return true;
// if (!(o instanceof Person)) {
// return false;
// }
// Person person = (Person) o;
// return Objects.equals(name, person.name) && age == person.age;
// }

// @Override
// public int hashCode() {
// return Objects.hash(name, age);
// }

// Person(String name, int age) {
// this.name = name;
// this.age = age;
// }

// public String toString() {
// return name + ":" + age;
// }
// }

// public class Ch11_11 {
// public static void main(String[] args) {
// HashSet set = new HashSet();
// set.add("abc");
// set.add("abc");
// set.add(new Person("David", 10));
// set.add(new Person("David", 10));

// System.out.println(set);

// }
// }
