package Lesson8;

public class Ex1 {
    static int simple(int a, int b, int c){
        return a*b*c;
    }

    static void simple1(int a, int b, int c){
        System.out.println(a/b);
    }
}


class  Ex{
    public static void main(String[] args) {
        System.out.println(Ex1.simple(2,4,2));
        Ex1.simple1(6,3,1);
    }

}