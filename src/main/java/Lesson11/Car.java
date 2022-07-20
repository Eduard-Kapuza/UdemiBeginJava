package Lesson11;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    int door;
    String color;
    String engine;

    Car(int door, String color, String engine){
        this.door=door;
        this.color=color;
        this.engine=engine;
    }
    Car(String color){
        this.color=color;
    }



}

class CarTest{
    public static void main(String[] args) {
        Car car1=new Car(4, "red","v6");
        Car car2=new Car(5, "black", "v4");
        //izmColor(car1,car2);
        izmDoor(car1, 10);
        System.out.println(car1);
        System.out.println(car2);

    }

    static void izmDoor(Car car, int a){
        car.door=a;
    }

    static void izmColor(Car car1, Car car2){
        Car car=new Car(car1.color);
        car1.color= car2.color;
        car2.color= car.color;



    }

}