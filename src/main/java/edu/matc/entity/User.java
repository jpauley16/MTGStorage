package edu.matc.entity;

import org.hibernate.annotations.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Table;
/**
 * Created by netherskub on 10/25/16.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator ="increment")
    @GenericGenerator(name ="increment", strategy = "increment")
    @Column(name ="user_id")
    private int user_id;

    @Column(name ="user_name")
    private String user_name;

    @Column(name ="user_pass")
    private String user_pass;

    public User() {
    }

    public User(int userid, String user_name, String user_pass) {
        this.user_id = userid;
        this.user_name = user_name;
        this.user_pass = user_pass;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

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
                "userid=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_pass='" + user_pass + '\'' +
                '}';
    }
}
