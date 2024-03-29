package Ch6;

class Student {
   String name;
   int ban;
   int no;
   int kor;
   int eng;
   int math;

   Student(String name, int ban, int no, int kor, int eng, int math) {
      this.name = name;
      this.ban = ban;
      this.no = no;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
   }

   int getTotal() {
      return this.kor + this.eng + this.math;
   }

   float getAverage() {
      return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
   }

   String info() {
      return this.toString();
   }

   public String toString() {
      return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math;
   }
}

public class Ex6_1 {
   public static void main(String[] args) {
      Student s = new Student("홍길동", 1, 1, 100, 60, 76);

      System.out.println("이름:" + s.name);
      System.out.println("총점:" + s.getTotal());
      System.out.println("평균:" + s.getAverage());
   }
}
