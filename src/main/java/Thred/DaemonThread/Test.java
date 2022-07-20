package Thred.DaemonThread;

public class Test {
    public static void main(String[] args) {
        Thread thread=new Thread(new UsedThread());
        Thread thread1=new Thread(new DaemonThread());
        thread1.setDaemon(true);

        Thread thread2=new Thread(new DaemonThread1());
        thread2.setDaemon(true);
        thread.setName(" User Thread");
        thread1.setName(" Daemon Thread");



        thread.start();
        thread1.start();
        thread2.start();
    }
}

class UsedThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" daemon "+isDaemon());
        for (char i = 'A'; i < 'L'; i++) {
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" daemon "+isDaemon());
        for (int i = 1; i < 1000; i++) {
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class DaemonThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" daemon "+isDaemon());
        for (int i = 1; i < 1000; i++) {
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Daemon №"+i);
        }
    }
}