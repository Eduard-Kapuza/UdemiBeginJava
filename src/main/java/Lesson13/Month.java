package Lesson13;

import java.util.Scanner;

import static Lesson13.Month.monthSwitch;

public class Month {
    static int monthSwitch(){
        System.out.println("Введите номер месяца ");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
class Main{
    public static void main(String[] args) {



        switch (monthSwitch()){
            case 12:
            case 10:
            case 8:
            case 7:
            case 5:
            case 3:
            case 1:
                System.out.println("В этом месяце 31 день");
                break;

            case 2:
                System.out.println("В этом месяце 28 дней");
                break;
            case 11:
            case 9:
            case 6:
            case 4:
                System.out.println("В этом месяце 30 дней");
                break;
            default:
                System.out.println("Месяца под таким номером нет");
        }
    }
}
