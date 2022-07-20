package Thred.NotifyWait;



class Main{
    public static void main(String[] args) {
        Market_notify_wait market=new Market_notify_wait();
        Produser produser=new Produser(market);
        Castomer castomer=new Castomer(market);
        Thread thread1=new Thread(produser);
        Thread thread2=new Thread(castomer);

        thread1.start();
        thread2.start();
    }
}

public class Market_notify_wait {

    private static  int breedCount=0;

     synchronized void breeTake() throws InterruptedException {
        while (breedCount<1) {
            wait();
        }
        System.out.println("Покупатель купил хлеб");
        breedCount--;
        System.out.println("Кол-во оставшегося хлеба "+ breedCount);
        notify();

    }

     synchronized void breeCreat() throws InterruptedException {
        while (breedCount>=5) {
            wait();
        }
        System.out.println("Магазин довали 1 хлеб");
        breedCount++;
        System.out.println("Кол-во оставшегося хлеба "+ breedCount);
        notify();
    }
}

class Produser implements Runnable{
    Market_notify_wait market;
    Produser(Market_notify_wait market){
        this.market=market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                market.breeCreat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Castomer implements Runnable{
    Market_notify_wait market;
    Castomer(Market_notify_wait market){
        this.market=market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                market.breeTake();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


