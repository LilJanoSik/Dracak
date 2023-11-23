package com.company.Other;

import com.company.Entity.Enemy;
import com.company.Entity.Entity;
import com.company.Entity.Player;
import com.company.Fight.Arena;
import com.company.Utils.IOUtil;

import java.util.Scanner;

public class Room {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private static Scanner sc = new Scanner(System.in);

    public Room(Player player) {
        room(player);
    }

    public void room(Entity player) {
        String start = ANSI_CYAN + "Ahoj, přišel ke ztracenému lesu. Nyní si zvol svoji cestu " + ANSI_RESET + "\n";
        for (int i = 0; i < start.length(); i++) {
            System.out.print(start.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(ANSI_GREEN + "1. Rovně, 2. Doleva, 3. Doprava" + ANSI_RESET);
        int ab = sc.nextInt();
        switch (ab) {
            case 1 -> {
                String rovne = ANSI_YELLOW + "Šel jsi rovně a cestou jsi narazil na pavouka" + ANSI_RESET + "\n";
                for (int i = 0; i < rovne.length(); i++) {
                    System.out.print(rovne.charAt(i));
                    try {
                        Thread.sleep(60);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Arena arena = new Arena("LES");
                Enemy pavouk = new Enemy("Pavouk", "Drug Seller", "fet", 1, 50, 1, 10, 0);
                arena.fight(player, pavouk);
            }
            case 2 -> {
                String doleva = ANSI_YELLOW + "Šel jsi doleva a cestou jsi narazil na skřítek" + ANSI_RESET + "\n";
                for (int i = 0; i < doleva.length(); i++) {
                    System.out.print(doleva.charAt(i));
                    try {
                        Thread.sleep(60);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Arena arena = new Arena("LES");
                Enemy skritek = new Enemy("Skřítek", "Babička", "Úhel ALFA", 1, 50, 1, 10, 0);
                arena.fight(player, skritek);
            }
            case 3 -> {
                String doprava = ANSI_YELLOW + "Šel jsi doprava a cestou jsi narazil na vlk" + ANSI_RESET + "\n";
                for (int i = 0; i < doprava.length(); i++) {
                    System.out.print(doprava.charAt(i));
                    try {
                        Thread.sleep(60);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Arena arena = new Arena("LES");
                Enemy vlk = new Enemy("Vlk", "Koule", "MINISTR", 1, 50, 1, 10, 0);
                arena.fight(player, vlk);
            }
        }
        room1(player);
    }

    public void room1(Entity player) {
        String hamlet = ANSI_YELLOW + "Po úspěšným souboji jsi prošel lesem a narazil jsi na velkou vesničku, avšak byl v ní Kyklop" + ANSI_RESET +"\n";
        for (int i = 0; i < hamlet.length(); i++) {
            System.out.print(hamlet.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena1 = new Arena("Grand Hamlet");
        Enemy kyklop = new Enemy("Kyklop", "cuck", "none", 2, 100, 3, 10, 0);
        arena1.fight(player, kyklop);
        String way = "Dorazil jsi k rozcestí vyber si kam půjdeš"+"\n";
        for (int i = 0; i < way.length(); i++) {
            System.out.print(way.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(ANSI_GREEN + "1. Hornické doly, 2. Medivhova věz" + ANSI_RESET+"\n");
        int a = sc.nextInt();
        switch (a) {
            case 1 -> DeadMines(player);
            case 2 -> MedivhTower(player);

        }

    }

    public void DeadMines(Entity player) {
        String deadmines = ANSI_YELLOW + "Vybral sis hornické doly. Cestou jsi našel poklad, který střeží Goblin Jožo, aby jsi poklad získal zabij Joža" + ANSI_RESET+"\n";
        for (int i = 0; i < deadmines.length(); i++) {
            System.out.print(deadmines.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("DeadMines");
        Enemy jozo = new Enemy("Jožo", "Goblin", "none", 3,150,5,10,0);
        arena.fight(player, jozo);
        player.setMoney(player.getMoney()+100);
        River(player);
    }

    public void MedivhTower(Entity player) {
        String medivh = ANSI_YELLOW+"Vybral sis Medivhovu věž. Cestou z věže jsi potkal ducha Dežo"+ANSI_RESET+"\n";
        for (int i = 0; i < medivh.length(); i++) {
            System.out.print(medivh.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("MedivhTower");
        Enemy dezo = new Enemy("Dežo","Ghost","none",3,150,10,10,0);
        arena.fight(player, dezo);
        River(player);
    }
    public void River(Entity player){
        String river = ANSI_YELLOW+"Jdeš kolem řeky ale neustálě tě něco k ní táhne. Ach je to zákeřná pana"+ANSI_RESET+"\n";
        for (int i = 0; i < river.length(); i++) {
            System.out.print(river.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("River");
        Enemy pana = new Enemy("Pana","žena","none",4,200,10,10,0);
        arena.fight(player, pana);
        boss(player);
    }
    public void boss(Entity player){
        String boss = ANSI_YELLOW + "Šel jsi dál podél řeky a narazil jsi na bosse!"+ ANSI_RESET+"\n";
        for (int i = 0; i < boss.length(); i++) {
            System.out.print(boss.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("Boss fight");
        Enemy bos = new Enemy("BossKundis","none","none",5,500,20,10,0);
        arena.fight(player, bos);
        String leftright = "Dorazil jsi k rozcestí vyber si kam půjdeš"+"\n";
        for (int i = 0; i < leftright.length(); i++) {
            System.out.print(leftright.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(ANSI_GREEN +"1. doleva, 2. doprava" + ANSI_RESET+"\n");
        int a = sc.nextInt();
        switch(a){
            case 1 -> leftWay(player);
            case 2 -> rightWay(player);
        }
    }
    public void leftWay(Entity player){
        String pustina = ANSI_YELLOW + "Procházíš pustinou když v tu ránu potkáš prasomrda" + ANSI_RESET+"\n";
        for (int i = 0; i < pustina.length(); i++) {
            System.out.print(pustina.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("Pustina");
        Enemy prasomrd = new Enemy("Prasomrd", "none", "none",6,200,5,10,0);
        arena.fight(player, prasomrd);
        sandBiom(player);

    }
    public void rightWay(Entity player){
        String pustina = ANSI_YELLOW + "Procházíš pustinou když v tu ránu potkáš kozomrda" + ANSI_RESET+"\n";
        for (int i = 0; i < pustina.length(); i++) {
            System.out.print(pustina.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("Pustina");
        Enemy kozomrda = new Enemy("kozomrd", "none", "none",6,200,5,10,0);
        arena.fight(player, kozomrda);
        sandBiom(player);
    }

    public void sandBiom(Entity player){
        String sand = ANSI_YELLOW+ "Procházíš pouští šlápl jsi na štíra -25HP" +ANSI_RESET+"\n";
        for (int i = 0; i < sand.length(); i++) {
            System.out.print(sand.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        player.setHp(player.getHp()-25);
        Arena arena = new Arena("Poušť");
        Enemy stir = new Enemy("Štír", "none","none",7,150,10,10,0);
        arena.fight(player, stir);
        snowValley(player);
    }

    public void snowValley(Entity player){
        String snow = ANSI_YELLOW + "Cestou přes hory jsi potkal chlupatou opici Petr Tran"+ANSI_RESET+"\n";
        for (int i = 0; i < snow.length(); i++) {
            System.out.print(snow.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("SnowValley");
        Enemy tran = new Enemy("Tranigr","none","none",8,1,1,10,99999999);
        arena.fight(player, tran);
        String finish = ANSI_GREEN + "Nyní jsi zvol dobře, jdeš do finále !" + ANSI_RESET+"\n";
        for (int i = 0; i < finish.length(); i++) {
            System.out.print(finish.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(ANSI_GREEN +"1. Jungle, 2. Peklo" + ANSI_RESET+"\n");
        int a = sc.nextInt();
        switch (a){
            case 1->jungle(player);
            case 2->hell(player);
        }
    }
    public void jungle(Entity player){
        String finished = ANSI_YELLOW + "Dorazil jsi do džungle a poslední boss je TIGR" + ANSI_RESET+"\n";
        for (int i = 0; i < finished.length(); i++) {
            System.out.print(finished.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("Jungle");
        Enemy tigr = new Enemy("Tigr","alfasamec","sexdefender",9,250,30,10,999999999);
        arena.fight(player,tigr);
    }
    public void hell(Entity player){
        String finished = ANSI_YELLOW + "Dorazil jsi do pekla a poslední boss je Adolfín" + ANSI_RESET+"\n";
        for (int i = 0; i < finished.length(); i++) {
            System.out.print(finished.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Arena arena = new Arena("Hell");
        Enemy adolfin = new Enemy("Adolfín","kokos","kokos",9,500,15,10,0);
        arena.fight(player, adolfin);
    }
}
