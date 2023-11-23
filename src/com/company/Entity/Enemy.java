package com.company.Entity;

public class Enemy extends Entity implements IFight {


    public Enemy(String name, String race, String role, int lv, double hp, double dmg, double mana, double money) {
        super(name, race, role, lv, hp, dmg, mana, money);
    }

    @Override
    public void attack() {

    }

    @Override
    public void def() {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void useItem() {

    }


}
