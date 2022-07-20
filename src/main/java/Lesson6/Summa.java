package Lesson6;

public class Summa {
    public static void main(String[] args) {

        SummaTest sT=new SummaTest();
        System.out.println(sT.sum());
        System.out.println(sT.sum(2,4));
        System.out.println(sT.sum(3,1,4));
        System.out.println(sT.sum(2,1,3,5));

    }
}

class SummaTest{

    int sum(){
        return 0;
    }

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return sum(a,b)+c;
    }

    int sum(int a, int b, int c, int d){
        return sum(a,b,c)+d;
    }
}
