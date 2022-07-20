package Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {


    static ArrayList<String> abc(String...s) {
        ArrayList<String> arrayList=new ArrayList<>();
        for (String s1:  s ) {
           arrayList.add(s1);
        }
        System.out.print(arrayList);
        Collections.sort(arrayList);
        return  arrayList;
    }


    public static void main(String[] args) {
        System.out.print(abc("П", "Т", "В", "А"));
    }
}
