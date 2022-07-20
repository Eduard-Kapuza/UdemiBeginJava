package Lesson8;

public class Test {
    static final double PI= 3;

    void plKruga(int a){
        System.out.println(PI*a*a);
    }

    void dlKruga(int a){
        System.out.println(2*PI*a);
    }

    void showInfo(Test test, int b){
        System.out.print("Площадь круга ");
        test.plKruga(b);
        System.out.print("Длина окружности ");
        test.dlKruga(b);
    }

}

class Test1{
    public static void main(String[] args) {
        Test test=new Test();
        test.showInfo(test, 3);
    }
}
