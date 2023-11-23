package com.company.Fight;

import com.company.Entity.Entity;
import com.company.Utils.IOUtil;

import static com.company.Other.AllMethods.*;

public class Arena {

    private String name;
    private boolean isRunning = true;

    public Arena(String name) {
        this.name = name;
    }

    public void fight(Entity player, Entity enemy) {
        System.out.println("Nachazite se v arene " + name);
        while (isRunning) {
            printEntities(player, enemy);
            round(player, enemy);
        }
    }

    private void printEntities(Entity player, Entity enemy) {
        IOUtil.printText(player.toString());
        IOUtil.printText(enemy.toString());
    }

    private void round(Entity player, Entity enemy) {


        System.out.println("1. Utok");
        System.out.println("2. Obrana");
        System.out.println("3. Dodge");
        System.out.print("Zadejte cislo: ");
        int i;
        try {
            i = Integer.parseInt(IOUtil.getInput());
            switch (i) {
                case 1 -> {
                    IOUtil.printText(ANSI_GREEN + player.getName() + " zautocil" + ANSI_RESET);
                    double d = Math.random();
                    if (d < 0.5) {
                        //Enemy utoci
                        IOUtil.printText(ANSI_RED + enemy.getName() + " zautocil" + ANSI_RESET);
                        enemy.setHp(Math.floor(enemy.getHp() - player.getDmg()));
                        if (isEnemyDead(player, enemy)) {
                            return;
                        }
                        player.setHp(Math.floor(player.getHp() - enemy.getDmg()));
                        if (isPlayerDead(player)) {
                            return;
                        }
                        return;
                    }
                    //Enemy se brani
                    IOUtil.printText(ANSI_RED + enemy.getName() + " se brani" + ANSI_RESET);
                    enemy.setHp(Math.floor(enemy.getHp() - (player.getDmg() / 3)));
                    isEnemyDead(player, enemy);
                }
                case 2 -> {
                    IOUtil.printText(ANSI_GREEN + player.getName() + " se brani" + ANSI_RESET);
                    double d = Math.random();
                    if (d < 0.5) {
                        // Enemy utoci
                        IOUtil.printText(ANSI_RED + enemy.getName() + " zautocil" + ANSI_RESET);
                        player.setHp(Math.floor(player.getHp() - (enemy.getDmg() / 3)));
                        if (isPlayerDead(player)) {
                            return;
                        }
                        return;
                    }
                    // Enemy se brani
                    IOUtil.printText(ANSI_RED + enemy.getName() + " se brani" + ANSI_RESET);
                    IOUtil.printText("Nic se nestalo :/");
                }
                case 3 -> {
                    IOUtil.printText(player.getName() + " dodge");
                    double d = Math.random();
                    if (d < 0.33) {
                        System.out.println("dodge se ti povedl");
                        IOUtil.printText(ANSI_RED + enemy.getName() + " zautočí" + ANSI_RESET);
                        player.setHp(Math.floor(player.getHp() - (enemy.getDmg() * 0)));
                        if (isPlayerDead(player)) {
                            return;
                        }
                        return;
                    } else if (d > 0.33 && d < 0.66) {
                        System.out.println("dodge se ti nepovedl");
                        IOUtil.printText(ANSI_RED + enemy.getName() + " zautočí" + ANSI_RESET);
                        player.setHp(Math.floor(player.getHp() - (enemy.getDmg())));
                        if (isPlayerDead(player)) {
                            return;
                        }
                        return;
                    }
                    IOUtil.printText(ANSI_RED + enemy.getName() + " se brani" + ANSI_RESET);
                    IOUtil.printText("Nic se nestalo");
                }
                default -> round(player, enemy);
            }
        } catch (Exception e) {
            round(player, enemy);
        }

    }

    private boolean isPlayerDead(Entity player) {
        if (player.getHp() <= 0) {
            isRunning = false;
            IOUtil.printText("\n" + ANSI_RED + "Nepritel te porazil" + ANSI_RESET + "\n");
            IOUtil.printText(ANSI_RED + "Si nub a hra konci" + ANSI_RESET);
            System.exit(-1);
            return true;
        }
        return false;
    }

    private boolean isEnemyDead(Entity player, Entity enemy) {
        if (enemy.getHp() <= 0) {
            isRunning = false;
            IOUtil.printText("\n" + ANSI_GREEN + player.getName() + " vyhrava" + ANSI_RESET);
            player.setLv(player.getLv() + 1);
            player.setHp(player.getHp()+25);
            player.setDmg(player.getDmg() * 1.5);
            player.setMoney(player.getMoney() + 100);

            IOUtil.printText("Získal jsi lvl up. Nyní jsi level: " + player.getLv() + " LVL");
            IOUtil.printText("Dostal jsi + 25Hp. Nyní máš: " + player.getHp() + " HP") ;
            IOUtil.printText("Zvýšil se ti dmg. Nyní máš: " + player.getDmg() + " DMG");
            IOUtil.printText("Získal jsi money: " + player.getMoney() + " MONEY");
            shop(player);
            return true;
        }
        return false;
    }
    public static void shop(Entity player){
        System.out.println( ANSI_RED+"Chceš si koupit životy za 100 drachen ? (+50HP)" + ANSI_RESET);
        System.out.println( ANSI_RED+"1. Ano, 2. Ne"+ ANSI_RESET);
        int shop = Integer.parseInt(IOUtil.getInput());
        switch (shop){
            case 1 -> {
                if(player.getMoney() < 100){
                    System.out.println("U cant buy heal potion");
                } else{
                    System.out.println("Koupil sis heal potion");
                    player.setMoney(player.getMoney()-100);
                    player.setHp(player.getHp()+50);
                    System.out.println("Nyní máš HP:" + player.getHp());
                }
            }
            case 2 -> {
                System.out.println("Dobrá tedy měj se hezky");
            }
        }
    }

}

