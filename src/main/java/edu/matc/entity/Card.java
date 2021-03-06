package edu.matc.entity;

import org.hibernate.annotations.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Table;
/**
 * Created by netherskub on 9/21/16.
 */
@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(generator ="increment")
    @GenericGenerator(name ="increment", strategy = "increment")
    @Column(name ="card_id")
    private int cardKey;

    @Column(name ="name")
    private String name;

    @Column(name ="manaCost")
    private String manaCost;

    @Column(name ="superType")
    private String superType;

    @Column(name ="subType")
    private String subType;

    @Column(name ="cardType")
    private String cardType;

    @Column(name ="rarity")
    private String rarity;

    @Column(name ="power")
    private String power;

    @Column(name ="toughness")
    private String toughness;

    @Column(name ="color")
    private String color;

    @Column(name ="qty")
    private int qty;

    @Column(name ="username")
    private String username;


    public Card() {

    }

    public Card(int cardKey, String name, String manaCost, String superType,
                String subType, String cardType, String rarity, String power, String toughness,
                String color, int qty, String username) {
        this.cardKey = cardKey;
        this.name = name;
        this.manaCost = manaCost;
        this.superType = superType;
        this.subType = subType;
        this.cardType = cardType;
        this.rarity = rarity;
        this.power = power;
        this.toughness = toughness;
        this.color = color;
        this.qty = qty;
        this.username = username;
    }

    public int getCardKey() {
        return cardKey;
    }

    public void setCardKey(int cardKey) {
        this.cardKey = cardKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getSuperType() {
        return superType;
    }

    public void setSuperType(String superType) {
        this.superType = superType;
    }

    public String getSubType() { return subType; }

    public void setSubType(String subType) { this.subType = subType; }

    public String getCardType() { return cardType; }

    public void setCardType(String cardType) { this.cardType = cardType; }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUsername() { return username; }

    public  void setUsername(String username) {this.username = username; }

    @Override
    public String toString() {
        return "Card{" +
                "cardKey=" + cardKey +
                ", name='" + name + '\'' +
                ", manaCost='" + manaCost + '\'' +
                ", superType='" + superType + '\'' +
                ", subType='" + subType + '\'' +
                ", cardType='" + cardType + '\'' +
                ", rarity='" + rarity + '\'' +
                ", power='" + power + '\'' +
                ", toughness='" + toughness + '\'' +
                ", color='" + color + '\'' +
                ", qty=" + qty + '\'' +
                ", username=" + username +
                '}';
    }

}

