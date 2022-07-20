package Thred.McDonalds;

public class Mc {

    static final Object lock = new Object();
    static volatile int a = 0;


    public static void Ochered_Na_Zakaz() {
        synchronized (lock) {
            System.out.println("Клиент " + Thread.currentThread().getName() + " стал в очередь");
            a++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Ochered_Na_Poluchenie() {
        synchronized (lock) {
            System.out.println("Клиент " + Thread.currentThread().getName() + " получил заказ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Добро пожаловать в МАК");
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        Thread thread3 = new Thread(new MyRunnable());
        Thread thread4 = new Thread(new MyRunnable());
        Thread thread5 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        System.out.println("Все клиенты получили заказ");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {

        Mc.Ochered_Na_Zakaz();

        try {
            Thread.sleep( Mc.a * 100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Mc.Ochered_Na_Poluchenie();

    }
}