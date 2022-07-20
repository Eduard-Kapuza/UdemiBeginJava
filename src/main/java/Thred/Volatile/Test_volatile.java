package Thred.Volatile;

public class Test_volatile {
    public static volatile long a=0;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main");
        MyThred myThred =new MyThred();
        MyThred myThred1 =new MyThred();
        MyThred myThred2 =new MyThred();
        MyThred myThred3 =new MyThred();

        myThred3.start();
        myThred2.start();
        myThred3.join();
        myThred2.join();
        System.out.println("End main "+ a);

    }

}

class MyThred extends Thread{
    @Override
    public  synchronized void run() {

        for (int i = 0; i < 10; i++) {

                System.out.println("Name thred: "+Thread.currentThread().getName()+ "        "+ Test_volatile.a);
                Test_volatile.a++;
        }

    }
}

class  MyRannable implements Runnable{

    @Override
    public synchronized void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Nomber Thred "+ Thread.currentThread().getName());
        }
    }
}