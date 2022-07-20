package Lesson14;

public class Time {

    public static void time() {

        HOUR:
        for (int hour = 0; hour < 6; hour++) {
            MINUTA:
            for (int minuta = 0; minuta < 60; minuta++) {
                if (hour>1 && minuta % 10==0 ){
                    break HOUR;
                }
                SECOND:
                for (int second = 0; second < 60; second++) {

                    if (second*hour>minuta) {

                        continue MINUTA;
                    }
                    System.out.println(hour+":"+minuta+":"+second);
                }
            }
        }
    }

    public static void main(String[] args) {
        //time();

        int i=0;
        while (i<10) {
            i++;
        }
    }


}
