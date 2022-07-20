package Lesson16;

import java.util.ArrayList;
import java.util.List;

public class ViborkaMail {//определение типа почты

    public static void main(String[] args) {


        String s = "ya@yahoo.com; on@mail.ru; ona@gmail.com; suhiufh@vk.com";

        List<String> list=List.of(s.split(" "));
        System.out.println(list);

        for (String a: list) {
            a=a.trim();
            int a1 = a.indexOf("@")+1;
            int a2 = a.indexOf(".");
            System.out.print(a.substring(a1, a2)+" ");
        }
    }
}














//    int a = 0;
//    int b = 0;
//    int c = 0;
//        while (c < s.length() - 1) {
//
//        a=s.indexOf('@',c);//2
//        b=s.indexOf('.',c);//8
//        c=s.indexOf(';',c+1);//12
//
//        System.out.println(s.substring(a+1,b));
//        }
//        }
//
//public static void main(String[] args) {
//        String s1 = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
//        System.out.println(s1.length());
//        int a=0, b=0, c=0;
//        a=s1.indexOf('@',12);//2 16 29
//        b=s1.indexOf('.',12);//8 21 35
//        c=s1.indexOf(';',12+1);//12 24 39
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(s1.substring(a+1,b));
//        email(s1);