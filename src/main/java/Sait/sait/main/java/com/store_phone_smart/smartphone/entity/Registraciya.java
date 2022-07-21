package Sait.sait.main.java.com.store_phone_smart.smartphone.entity;

import java.util.Objects;

public class Registraciya {
    private int number;
    private String nameUser;
    private String passwordUser;
 //-----------------------------------------------------------
    public Registraciya(int number, String nameUser, String passwordUser) {
        this.number = number;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }
    public Registraciya(){}
//-----------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registraciya that = (Registraciya) o;
        return number == that.number && nameUser.equals(that.nameUser) && passwordUser.equals(that.passwordUser);
    }

//--------------------------------------------------------------
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
 //-----------------------------------------------------------


    @Override
    public int hashCode() {
        return Objects.hash(number, nameUser, passwordUser);
    }
//---------------------------------------------------------
    @Override
    public String toString() {
        return "Registraciya{" +
                "number=" + number +
                ", nameUser='" + nameUser + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                '}';
    }





}
