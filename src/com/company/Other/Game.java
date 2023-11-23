package com.company.Other;

import com.company.Entity.Player;

import java.util.Scanner;

public class Game {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private static Scanner sc = new Scanner(System.in);

    public static void game(){
        Player player = null;
        Player michal = new Player("Michal", "dwarf", "warrior", 1, 200, 5, 0, 0);
        Player tadik = new Player("Tadik", "dwarf", "archer", 1, 150, 7, 0, 0);
        Player josef = new Player("Pepa", "dwarf", "wizard", 1, 100, 10, 0, 0);
        Player kalousek = new Player("Kalousek", "dwarf", "roque", 1, 50, 5, 0, 0);

        System.out.println("Zadej své jméno | přezdívku");
        String urName = sc.nextLine();
        String uvod = ANSI_CYAN + "Ahoj " + urName + ", Vítám tě v dračím doupěti" + "\n" +
                "Tvůj úkol je projít všemi místnostmi bez úmrtí, cestou" + "\n" +
                "potkáš nepřátele , kteří tě budou chtít za každou cenu porazit!" + "\n" +
                "Hodně štěstí" + "\n" + ANSI_RESET + ANSI_RED + "Nyní si můžeš zvolit svou postavu" + ANSI_RESET + "\n";

        for (int i = 0; i < uvod.length(); i++) {
            System.out.print(uvod.charAt(i));
            try {
                Thread.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        AllMethods.printHeroes();

        int choose = sc.nextInt();
        switch (choose) {
            case 1 -> {
                player = michal;
                System.out.println("You choose: Warrior-Michal" + "\n");
                AllMethods.warrior();
                System.out.println("     LVL:" + michal.getLv());
                System.out.println("     HP:" + michal.getHp());
                System.out.println("     DMG:" + michal.getDmg());
//                System.out.println("     MANA:" + michal.getMana());
                System.out.println("     MONEY:" + michal.getMoney());
            }
            case 2 -> {
                player = tadik;
                System.out.println("You choose: Archer-Tadik" + "\n");
                AllMethods.archer();
                System.out.println("     LVL:" + tadik.getLv());
                System.out.println("     HP:" + tadik.getHp());
                System.out.println("     DMG:" + tadik.getDmg());
//                System.out.println("     MANA:" + tadik.getMana());
                System.out.println("     MONEY:" + tadik.getMoney());
            }
            case 3 -> {
                player = josef;
                System.out.println("You chose: Wizard-Josef" + "\n");
                AllMethods.wizard();
                System.out.println("     LVL:" + josef.getLv());
                System.out.println("     HP:" + josef.getHp());
                System.out.println("     DMG:" + josef.getDmg());
//                System.out.println("     MANA:" + josef.getMana());
                System.out.println("     MONEY:" + josef.getMoney());
            }
            case 4 -> {
                player = kalousek;
                System.out.println("You chose: Clown-Kalousek" + "\n");
                AllMethods.clown();
                System.out.println("     LVL:" + kalousek.getLv());
                System.out.println("     HP:" + kalousek.getHp());
                System.out.println("     DMG:" + kalousek.getDmg());
//                System.out.println("     MANA:" + kalousek.getMana());
                System.out.println("     MONEY:" + kalousek.getMoney());
            }
            default -> System.out.println("Neznám postavu");
        }
        new Room(player);
    }
}
