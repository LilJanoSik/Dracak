package com.company.Other;

public class AllMethods {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void printHeroes() {
        System.out.println(ANSI_YELLOW + "   1.Warrior-Michal                  2.Archer-Tadik                3.Wizard-Josef                       4.Clown-Kalousek" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  / \\                                      /`.                          _,._                          ______________________     Q                " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  | |                                     /   :.             .||,      /_ _\\\\                         |                    |  ___|\\_.-,   " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  |.|                                    /     \\\\           \\.`',/     |'L'| |                        |      NAZDAR        S\\ Q~\\___ \\|" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  |.|                                 ,;/,      ::          = ,. =     | -,| L                        |        TY          |(   )o 5) Q" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  |.|                             ___:c/.(      ||          / || \\    ,-'\\\"/,'`.                      |      ČŮRÁKU        |\\\\  \\_ ()  " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  |:|                           ,'  _|:)>>>--,-'B)>           ||     ,'   `,,. `.                     |                    | \\'. _'/'.     " + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  |:|      __                  (  '---'\\--'` _,'||           ,|____,' , ,;' \\| |                      |                   .-. '-(  x< \\" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + ",_|:|_,   /  )                  `--.    \\ ,-'   ;;          (3|\\    _/|/'   _| |                      |       ,o         /\\, '.  )  /'\\\\" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "  (Oo    / _I_                      |    \\|    //             ||/,-''  | >-'' _,\\\\                    |______ \\'.__.----/ .'\\  '.-'/   \\\\" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "   +\\ \\  || __|                     |     \\   ;'              ||'      ==\\ ,-'  ,'                         snd '---'q__/.'__ ;    /     \\\\_" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "      \\ \\||___|                     |_____|\\,'                ||       |  V \\ ,|                                 '---'     '--'       `\"'" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       \\ /.:.\\-\\                    :     :                   ||       |    |` |" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       |.:. /-----\\                 |  ,  |                   ||       |    |   \\" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       |___|::oOo::|                | : \\ :                   ||       |    \\    \\" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       /   |:<_T_>:|                | | : :                   ||       |     |    \\" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       |_____\\ ::: /                | | | |                   ||       |      \\_,-'" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       | |  \\ \\:/                   | | |_`.                  ||       |___,,--\")_\\" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       | |   | |                      '--`                    ||         |_|   ccc/" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       \\ /   | \\___                                           ||        ccc/" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "       / |   \\_____\\                                          ||" + ANSI_RESET + "\n");
        System.out.println("-------------------" + "            -------------------" + "             -------------------" + "                     -------------------");
        System.out.println("|     LVL:1       |" + "            |     LVL:1       |" + "             |     LVL:1       |" + "                     |     LVL:1       |");
        System.out.println("|     HP:200      |" + "            |     HP:150      |" + "             |     HP:100      |" + "                     |     HP:50       |");
        System.out.println("|     DMG:5       |" + "            |     DMG:7       |" + "             |     DMG:10      |" + "                     |     DMG:5       |");
        System.out.println("|     MONEY:0     |" + "            |     MONEY:0     |" + "             |     MONEY:0     |" + "                     |     MONEY:0     |");
        System.out.println("-------------------" + "            -------------------" + "             -------------------" + "                     -------------------");
    }

    public static void warrior() {
        System.out.println("  / \\\n" +
                "  | |\n" +
                "  |.|\n" +
                "  |.|\n" +
                "  |:|      __\n" +
                ",_|:|_,   /  )\n" +
                "  (Oo    / _I_\n" +
                "   +\\ \\  || __|\n" +
                "      \\ \\||___|\n" +
                "        \\ /.:.\\-\\\n" +
                "         |.:. /-----\\\n" +
                "         |___|::oOo::|\n" +
                "         /   |:<_T_>:|\n" +
                "        |_____\\ ::: /\n" +
                "         | |  \\ \\:/\n" +
                "         | |   | |\n" +
                "         \\ /   | \\___\n" +
                "         / |   \\_____\\\n" +
                "         `-'");
    }

    public static void archer() {
        System.out.println("            /`.\n" +
                "           /   :.\n" +
                "          /     \\\\\n" +
                "       ,;/,      ::\n" +
                "   ___:c/.(      ||\n" +
                "(  '---'\\--'` _,'||\n" +
                " `--.    \\ ,-'   ;;\n" +
                "     |    \\|    //\n" +
                "     |     \\   ;'\n" +
                "     |_____|\\,'\n" +
                "     :     :\n" +
                "     |  ,  |\n" +
                "     | : \\ :\n" +
                "     | | : :\n" +
                "     | | | |\n" +
                "     | | |_`.\n" +
                "     '--`");
    }

    public static void wizard() {
        System.out.println("              _,._      \n" +
                "  .||,       /_ _\\\\     \n" +
                " \\.`',/      |'L'| |    \n" +
                " = ,. =      | -,| L    \n" +
                " / || \\    ,-'\\\"/,'`.   \n" +
                "   ||     ,'   `,,. `.  \n" +
                "   ,|____,' , ,;' \\| |  \n" +
                "  (3|\\    _/|/'   _| |  \n" +
                "   ||/,-''  | >-'' _,\\\\ \n" +
                "   ||'      ==\\ ,-'  ,' \n" +
                "   ||       |  V \\ ,|   \n" +
                "   ||       |    |` |   \n" +
                "   ||       |    |   \\  \n" +
                "   ||       |    \\    \\ \n" +
                "   ||       |     |    \\\n" +
                "   ||       |      \\_,-'\n" +
                "   ||       |___,,--\")_\\\n" +
                "   ||         |_|   ccc/\n" +
                "   ||        ccc/       \n" +
                "   ||  ");
    }

    public static void clown() {
        System.out.println("______________________     Q\n" +
                "|                    |  ___|\\_.-,\n" +
                "|      NAZDAR        S\\ Q~\\___ \\|\n" +
                "|        TY          |(   )o 5) Q\n" +
                "|      ČŮRÁKU        |\\\\  \\_ ()\n" +
                "|                    | \\'. _'/'.\n" +
                "|                   .-. '-(  x< \\\n" +
                "|       ,o         /\\, '.  )  /'\\\\\n" +
                "|______ \\'.__.----/ .'\\  '.-'/   \\\\\n" +
                "     snd '---'q__/.'__ ;    /     \\\\_\n" +
                "              '---'     '--'       `\"'");
    }
//    public static void spagetak() {
//        System.out.println("               ,--.\n" +
//                "          ,--.  .--,`) )  .--,\n" +
//                "       .--,`) \\( (` /,--./ (`\n" +
//                "      ( ( ,--.  ) )\\ /`) ).--,-.\n" +
//                "       ;.__`) )/ /) ) ( (( (`_) )\n" +
//                "      ( (  / /( (.' \"-.) )) )__.'-,\n" +
//                "     _,--.( ( /`         `,/ ,--,) )\n" +
//                "    ( (``) \\,` ==.    .==  \\( (`,-;\n" +
//                "     ;-,( (_) ~6~ \\  / ~6~ (_) )_) )\n" +
//                "    ( (_ \\_ (      )(      )__/___.'\n" +
//                "    '.__,-,\\ \\     ''     /\\ ,-.\n" +
//                "       ( (_/ /\\    __    /\\ \\_) )\n" +
//                "        '._.'  \\  \\__/  /  '._.'\n" +
//                "            .--`\\      /`--.\n" +
//                "                 '----' ");
//    }

}

