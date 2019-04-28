package com.kodilla.rps;

import java.util.Scanner;

public final class Rules {

    private Scanner sc = new Scanner(System.in);

    public final void gameRules(){

        System.out.println("If you want to know the rules of the game, press capital Y or press any key if You won't.");
        if(sc.nextLine().equals("Y")){
            System.out.println(
                            "After starting the game You must choose your move on the keyboard:\n" +
                            "1 - Rock\n" +
                            "2 - Paper\n" +
                            "3 - Scissors\n" +
                            "4 - Lizard\n" +
                            "5 - Spock\n\n" +
                            "After game options: \n" +
                            "X - End of the game\n" +
                            "N - Start new game\n\n" +
                            "Remember: Scissors cuts paper, paper covers rock, rock crushes lizard, lizard poisons Spock, " +
                                    "Spock smashes scissors, scissors decapitates lizard, lizard eats paper, " +
                                    "paper disproves Spock, Spock vaporizes rock, and as it always has, rock crushes scissors!\n\n" +
                                    "You can watch the rules on the: https://www.youtube.com/watch?v=x5Q6-wMx-K8&t=69s\n\n" +
                            "If you choose the same movement as your opponent then will be draw and no one gets a point.\n\n" +
                                    "Let's get start the game!\n"
            );
        } else {
            System.out.println("Let's get start the game!\n");
        }
    }
}
