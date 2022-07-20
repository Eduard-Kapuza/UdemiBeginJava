package Lesson18;

public class BoobleSort {


    static int[] sort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length - i; j++) {
                if (ar[i] > ar[j + i]) {
                    int c;
                    c = ar[i];
                    ar[i] = ar[j + i];
                    ar[j + i] = c;
                }
            }
        }
        return ar;
    }


    public static void main(String[] args) {
        int[] ar = {50, 15, 4,200, 6, 0, -10,4, 12,-200, 1,50};

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        sort(ar);
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }


}



