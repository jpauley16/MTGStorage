package edu.matc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
/**
 * Created by netherskub on 10/25/16.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name ="user_name")
    private String user_name;

    @Column(name ="user_pass")
    private String user_pass;

    public User() {
    }

    public User(String user_name, String user_pass) {
        this.user_name = user_name;
        this.user_pass = user_pass;
    }

    public String getUser_name() { return user_name; }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    @Override
    public String toString() {
        return "User{" +
                " user_name='" + user_name + '\'' +
                ", user_pass='" + user_pass + '\'' +
                '}';
    }
}
