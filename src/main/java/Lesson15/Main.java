package Lesson15;

public class Main {
    public static void main(String[] args) {

        int chas = 0;
        OUTER:
        while (chas < 6) {
            int minuta = -1;
            MIDLE:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0)
                    break OUTER;
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * chas > minuta)
                        continue MIDLE;
                    System.out.println(chas + " : " + minuta + " : " + second);
                    second++;
                }

            } while (minuta < 59);
            chas++;
        }
    }

}

