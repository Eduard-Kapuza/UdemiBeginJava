package Lesson5;

public class BankAkkaunt {

    private int id;
    private double schet;

    BankAkkaunt(int id, double schet){
        this.id=id;
        this.schet=schet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSchet() {
        return schet;
    }

    public void setSchet(double schet) {
        this.schet = schet;
    }


    public void popolnenie(double popoln){
        setSchet(getSchet()+popoln);
    }

    public void snjatie(double snjat){
        setSchet(getSchet()-snjat);
    }

    public void showInfo(){
        System.out.println("На счёте №"+getId()+" лежит: "+getSchet()+"$");
    }


}


class BankAkkauntTest{


    public static void main(String[] args) {
        BankAkkaunt ba=new BankAkkaunt(1, 200);
        BankAkkaunt ba2=new BankAkkaunt(4, 20);

        ba.showInfo();
        ba.popolnenie(150);
        ba.showInfo();
        ba.snjatie(327);
        ba.showInfo();

        ba2.showInfo();


    }


}