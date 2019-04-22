package com.kodilla.rps;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Computer {
    private int computerPoints;
    private Moves move;

    public Moves computerMove() throws InterruptedException {
        System.out.println("It's time for me to choose my move!\nGive me 3 seconds... Hmmmm...\n");
        TimeUnit.SECONDS.sleep(3);
        Random random = new Random();
        int choice = random.nextInt(3) + 1;
        switch (choice){
            case 1:
                System.out.println("My choice is: " + Moves.values()[choice-1] + "!\n");
                break;
            case 2:
                System.out.println("My choice is: " + Moves.values()[choice-1] + "!\n");
                break;
            case 3:
                System.out.println("My choice is: " + Moves.values()[choice-1] + "!\n");
                break;
        }
        move = Moves.values()[choice-1];
        return move;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }

    public Moves getMove() {
        return move;
    }
}
