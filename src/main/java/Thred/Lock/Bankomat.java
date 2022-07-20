package Thred.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock=new ReentrantLock();
        new Employee("Edward", lock);
        new Employee("Jack", lock);
        new Employee("Eddi", lock);
        Thread.sleep(5000);
        new Employee("Niko", lock);
        new Employee("Wolf", lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;
    Employee(String name, Lock lock){
        this.name=name;
        this.lock=lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()){
//        System.out.println(name+" ждёт...");
//        lock.lock();
        System.out.println(name+" пользуется банкоматом");
        try {
            Thread.sleep(2000);
            System.out.println(name+" завершил свои операции");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }else {
            System.out.println(name+" не захотел ожидать и ушёл");
        }
    }

}