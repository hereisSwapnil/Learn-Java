public class deep_copy_constructor {

  public static void main(String args[]) {
    Student s1 = new Student();
    s1.name = "Swamp";
    s1.rollno = 1;
    s1.marks = new int[] { 1, 2, 3 };
    for (int i = 0; i < s1.marks.length; i++) {
      System.out.println(s1.marks[i]);
    }
    Student s2 = new Student(s1);
    s1.marks[0] = 9;
    for (int i = 0; i < s2.marks.length; i++) {
      System.out.println(s2.marks[i]);
    }
  }
}

class Student {

  String name;
  int rollno;
  int marks[];

  Student() {}

  Student(Student s1) {
    marks = new int[s1.marks.length];
    this.name = s1.name;
    this.rollno = s1.rollno;
    for (int i = 0; i < marks.length; i++) {
      this.marks[i] = s1.marks[i];
    }
  }
}
