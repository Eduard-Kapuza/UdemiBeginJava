package Test;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> igra = new ArrayList<>();
        System.out.println("Введите числа: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            igra.add(scanner.nextInt());
        }
        System.out.println("Числа для игры" + igra);

        int sum1 = 0, a = 0, sum2 = 0, b = 0;
        boolean check = true;
        while (check) {

            player1:

            a = igra.get(0);
            b = igra.get(igra.size() - 1);
            if (a > b) {
                sum1 += a;
                igra.remove(0);
            } else if (a < b ) {
                sum1 += b;
                igra.remove(igra.size() - 1);
            } else {
                sum1 += b;
                igra.remove(igra.size() - 1);
            }
            a = 0;
            b = 0;

        if (igra.size() == 0) {
            check = false;
        }

        player2:

        a = igra.get(0);
        b = igra.get(igra.size() - 1);
        if (a > b) {
            sum2 += a;
            igra.remove(0);
        } else if (a < b) {
            sum2 += b;
            igra.remove(igra.size() - 1);
        } else {
            sum2 += b;
            igra.remove(igra.size() - 1);
        }

        a = 0;
        b = 0;
        if (igra.size() == 0) {
            check = false;

        }

    }
        System.out.println("Игрок 1 "+sum1);
        System.out.println("Игрок 2 "+sum2);
}}




