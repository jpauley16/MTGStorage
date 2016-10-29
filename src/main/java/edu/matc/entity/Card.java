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
@Table(name = "Card")
public class Card {

    @Id
    @GeneratedValue(generator ="increment")
    @GenericGenerator(name ="increment", strategy = "increment")
    @Column(name ="Card_Key")
    private int cardKey;

    @Column(name ="Name")
    private String name;

    @Column(name ="Mana_Cost")
    private String manaCost;

    @Column(name ="Super_Type")
    private String superType;

    @Column(name ="Subtype")
    private String subtype;

    @Column(name ="CardType")
    private String cardType;

    @Column(name ="Rarity")
    private String rarity;

    @Column(name ="Power")
    private String power;

    @Column(name ="Toughness")
    private String toughness;

    @Column(name ="Color")
    private String color;

    @Column(name ="Qty")
    private int qty;


    public Card() {

    }

    public Card(int cardKey, String name, String manaCost, String superType,
                String subtype, String cardType, String rarity, String power, String toughness,
                String color, int qty) {
        this.cardKey = cardKey;
        this.name = name;
        this.manaCost = manaCost;
        this.superType = superType;
        this.subtype = subtype;
        this.cardType = cardType;
        this.rarity = rarity;
        this.power = power;
        this.toughness = toughness;
        this.color = color;
        this.qty = qty;
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

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

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

    @Override
    public String toString() {
        return "Card{" +
                "cardKey=" + cardKey +
                ", name='" + name + '\'' +
                ", manaCost='" + manaCost + '\'' +
                ", superType='" + superType + '\'' +
                ", subtype='" + subtype + '\'' +
                ", cardType='" + cardType + '\'' +
                ", rarity='" + rarity + '\'' +
                ", power='" + power + '\'' +
                ", toughness='" + toughness + '\'' +
                ", color='" + color + '\'' +
                ", qty=" + qty +
                '}';
    }

}

