package com.company.Entity;


import com.company.Entity.Entity;

public class Player extends Entity implements IFight {


    public Player(String name, String race, String role, int lv, double hp, double dmg, double mana, double money) {
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
