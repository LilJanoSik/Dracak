package com.company.Entity;

import java.util.ArrayList;

public class Entity {

    private String name;
    private String race;
    private String role;
    private int lv;
    private double hp;
    private double dmg;
    private double mana;
    private double money;

    public Entity(String name, String race, String role, int lv, double hp, double dmg, double mana, double money) {
        this.name = name;
        this.race = race;
        this.role = role;
        this.lv = lv;
        this.hp = hp;
        this.dmg = dmg;
        this.mana = mana;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getHp() {
        return hp;
    }

    public double getDmg() {
        return dmg;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getRole() {
        return role;
    }

    public int getLv() {
        return lv;
    }

    public double getMana() {
        return mana;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return name + ":\n" +
                "hp=" + hp + "\n" +
                "dmg=" + dmg + "\n" +
                "lv=" + lv + "\n";
    }


}
