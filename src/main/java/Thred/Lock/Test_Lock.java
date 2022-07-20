package Thred.Lock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test_Lock {
    public static void main(String[] args) {
        Call call=new Call();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                call.viberCall();
            }
        });

        thread.start();
        
        thread1.start();
        thread3.start();
    }

}

class Call {

    private Lock lock=new ReentrantLock();

    public void mobileCall(){
        lock.lock();
        System.out.println("mobileCall start");
        try {
            Thread.sleep(3000);
            System.out.println("mobileCall end");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void skypeCall(){
        lock.lock();
        System.out.println("skypeCall start");
        try {
            Thread.sleep(5000);
            System.out.println("skypeCall end");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void viberCall(){
        lock.lock();
        System.out.println("viberCall start");
        try {
            Thread.sleep(7000);
            System.out.println("viberCall end");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}