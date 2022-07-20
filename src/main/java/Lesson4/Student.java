package Lesson4;

public class Student {

    int numderStudTicket;
    String name;
    String surName;
    int yearLearn;
    double srNoteMath;
    double srNoteEkonom;
    double srNoteInYaz;

    public Student(int numderStudTicket, String name, String surName, int yearLearn, double srNoteMath, double srNoteEkonom, double srNoteInYaz) {
        this.numderStudTicket = numderStudTicket;
        this.name = name;
        this.surName = surName;
        this.yearLearn = yearLearn;
        this.srNoteMath = srNoteMath;
        this.srNoteEkonom = srNoteEkonom;
        this.srNoteInYaz = srNoteInYaz;
    }

    @Override
    public String toString() {
        return  "numderStudTicket=" + numderStudTicket +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", yearLearn=" + yearLearn +
                ", srNoteMath=" + srNoteMath +
                ", srNoteEkonom=" + srNoteEkonom +
                ", srNoteInYaz=" + srNoteInYaz;
    }
}


class StudentTest{
    public double sredyayaNot(Student student){
        double note=(student.srNoteEkonom+student.srNoteMath+student.srNoteMath)/3;

        return note;
    }

    public static void main(String[] args) {
        StudentTest test = new StudentTest();

        Student st1 = new Student(1, "Jack", "Wolf", 3, 5.5, 7.8, 9.0);
        Student st2 = new Student(2, "Niko", "Ruf", 1, 7.3, 5.9, 8.2);
        Student st3 = new Student(2, "Ivan", "Petrov", 2, 8.0, 6.2, 7.9);

        System.out.println(st1 +", средняя оценка "+test.sredyayaNot(st1));
        System.out.println(st2 +", средняя оценка "+test.sredyayaNot(st2));
        System.out.println(st3 +", средняя оценка "+test.sredyayaNot(st3));


    }
}