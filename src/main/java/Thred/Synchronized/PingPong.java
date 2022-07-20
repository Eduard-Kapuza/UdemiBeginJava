package Thred.Synchronized;


class Hit {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        Ping ping = new Ping(pingPong);
        Pong pong = new Pong(pingPong);
       // for (int i = 0; i < 50; i++) {


            Thread thread1 = new Thread(ping);
            Thread thread2 = new Thread(pong);
            Thread thread3 = new Thread(ping);
            Thread thread4 = new Thread(pong);
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();

        //}
    }
}

public class PingPong {



    private static int hit = 0;

    public synchronized void hit() throws InterruptedException {
        while (hit != 0) {
            wait();
        }
        hit = 1;
        System.out.println(Thread.currentThread().getName() + " IIIII   "+hit);
        System.out.println();
        notify();
    }

    public synchronized void hit2() throws InterruptedException {
        while (hit != 1) {
            wait();
        }
        hit = 0;
        System.out.println(Thread.currentThread().getName() + " OOOOO   "+hit);
        System.out.println();
        notify();

    }

}

class Ping implements Runnable {
    PingPong pingPong;

    public Ping(PingPong pingPong) {
        this.pingPong = pingPong;
    }

    @Override
    public void run() {

        try {
            pingPong.hit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Pong implements Runnable {
    PingPong pingPong;

    public Pong(PingPong pingPong) {
        this.pingPong = pingPong;
    }

    @Override
    public void run() {

        try {
            pingPong.hit2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
