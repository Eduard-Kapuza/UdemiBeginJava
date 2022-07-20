package Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String a = null;
        int  summa1 = 0, summa2 = 0;

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        char[] chislo = a.toCharArray();


        for (int i = 0; i <( chislo.length +1)/ 2; i++) {
                summa1 += Integer.parseInt(String.valueOf(chislo[i]));
        }

        for (int i = (chislo.length+1) / 2; i < chislo.length; i++) {
                summa2 += Integer.parseInt(String.valueOf(chislo[i]));
        }
        System.out.println(summa1);
        System.out.println(summa2);


    }
}
