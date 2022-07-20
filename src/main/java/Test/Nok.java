//package Test;
//
//import java.util.*;
//
//public class Nok {
//    public static void main(String[] args) {
//
//        int a;
//        System.out.println("Vvedite kol-vo chusel:");
//        Scanner scanner=new Scanner(System.in);
//        a=scanner.nextInt();
//        int[] chisla=new int[a];
//        for (int i = 0; i <a ; i++) {
//            int b=scanner.nextInt();
//            chisla[i]=b;
//        }
//
//        System.out.print("Vaschi chisla: ");
//        for (int a1: chisla) {
//            System.out.print(a1+"; ");
//        }
//        System.out.println();
//
//        int count;
//        Map<Integer, Integer> map = new HashMap<>();
//        Map<String, Map<Integer, Integer>> mapEnd = new HashMap<>();
//
//
//        L1:
//        for (int i = 2, k=0; i <= chisla.length+1; i++, k++) {
//            count = 0;
//            L0:
//            for (int j = 0; j < 10; j++) {
//                System.out.print("one="+chisla[k]+"; ");
//                System.out.print("  i="+i+"; ");
//                if (chisla[k] % i == 0 ) {//96%2=0 48%2=0 24%2=0 12%2=0 6%2=0      3%3=0
//                    chisla[k] /= i;//96/2=48 48/2=24 24/2=12 12/2=6 6/2=3    3/3=1
//                    count++;//1 2 3 4 5    1
//                    System.out.print(count+"    ");
//                    mapEnd.put(chisla[k], map.put(i, count));// 2;1 2;2 2;3 2;4 2;5    3;1
//                } else {
//                    break L0;
//                }
//
//            }
//        }
//
//        System.out.println("\n"+list);
//
//    }
//}
