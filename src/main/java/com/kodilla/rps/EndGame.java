package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public final class EndGame {

    private Scanner sc = new Scanner(System.in);

    public void endGame() throws InterruptedException {
        System.out.println("We finished! Thank you for the game.\n" +
                "Tell me what's now?\n" +
                "End game - press capital X\n" +
                "New game - press capital N.");
        switch (sc.nextLine()){
            case "X":
                System.exit(0);
                break;
            case "N":
                Game game = new Game(new Round(), new Player(), new Computer(new Random()), new Rules(), new EndGame());
                game.welcome();
                game.introduceYourself();
                game.setWinPointsNumbers();
                game.showRules();
                game.game();
        }
    }
}
