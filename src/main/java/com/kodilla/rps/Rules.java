package com.kodilla.rps;

import java.util.Scanner;

public final class Rules {

    public final void gameRules(){

        Scanner sc = new Scanner(System.in);

        System.out.println("If you want to know the rules of the game, press capital Y or press any key if You won't.");
        if(sc.nextLine().equals("Y")){
            System.out.println(
                            "After starting the game You must choose your move on the keyboard:\n" +
                            "1 - Rock\n" +
                            "2 - Paper\n" +
                            "3 - Scissors\n\n" +
                                    "After game options: \n" +
                            "X - End of the game\n" +
                            "N - Start new game\n\n" +
                            "Remember: rock crushes scissors, scissors cuts paper and paper covers rock!\n\n" +
                            "If you choose the same movement as your opponent then will be draw and no one gets a point.\n\n" +
                                    "Let's get start the game!\n"
            );
        } else {
            System.out.println("Let's get start the game!\n");
        }
    }
}
