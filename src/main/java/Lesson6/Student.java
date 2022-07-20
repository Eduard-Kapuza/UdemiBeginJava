package Lesson6;

public class Student {

    int id;
    String name;
    String surName;
    int course;
    double srednjajaNot;

    public Student(){}

    public Student(int id2, String mane2, String surName2, int course2) {
        id = id2;
        name = mane2;
        surName = surName2;
        course = course2;
    }

    public Student(int id3, String name3, String surName3, int course3, double srednjajaNot3) {
        this (id3, name3, surName3, course3);
        srednjajaNot = srednjajaNot3;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                ", srednjajaNot=" + srednjajaNot;
    }

}
