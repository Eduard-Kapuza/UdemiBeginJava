package Logi;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Log {
    public static void main(String[] args) {

//        Logger logger= LogManager.getLogger();
//        logger.info("hi");
//        logger.error("bad");
//        logger.warn("warn");

        Test test=new Test();
        test.pokupka(30);

    }
}

class Test{

    List<Integer> list=new ArrayList<>();
    int kol_voMaschin=0;
    int schet=15;

    void pokupka(int a){

        list.add(15);
        list.add(5);
        list.add(11);
        list.add(10);
        list.add(12);
        list.sort(Integer::compareTo);
        System.out.println(list);

        for (int i = 0; i < list.size()-1; i++) {
while (a<=0){
            if (a!=list.get(i)){
                a-=list.get(i);
                kol_voMaschin++;
                }
                }

            if (a>=schet){

                System.out.println("По цене "+list.get(i)+" можно купить "+kol_voMaschin);
            }


    }}
}