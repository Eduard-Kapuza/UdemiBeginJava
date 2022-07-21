package Sait.sait.main.java.com.store_phone_smart.smartphone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sign_in")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String login;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }


}
