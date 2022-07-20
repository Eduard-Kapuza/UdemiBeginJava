package Lesson6;

public class StudentTest {
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student(22, "Jack", "Wolf", 3);
        Student st3=new Student(17, "Theri", "Cruz", 4, 7.5);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
