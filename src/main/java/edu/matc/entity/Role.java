package edu.matc.entity;

import org.hibernate.annotations.*;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
/**
 * Created by netherskub on 11/29/16.
 */
@Entity
@Table(name = "user_roles")
public class Role {

    @Id
    @Column(name ="user_name")
    private String user_name;

    @Id
    @Column(name ="role_name")
    private String role_name;

    public Role() {
    }

    public Role(String user_name, String role_name) {
        this.user_name = user_name;
        this.role_name = role_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "user_name='" + user_name + '\'' +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
