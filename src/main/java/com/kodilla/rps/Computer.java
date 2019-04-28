package com.kodilla.rps;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Computer {
    private int computerPoints;
    private Moves move;
    private Random random;
    private int choice;

    public Computer(Random random){
        this.random = random;
    }

    public Moves computerMove() throws InterruptedException {
        System.out.println("It's time for me to choose my move!\nGive me 3 seconds... Hmmmm...\n");
        TimeUnit.SECONDS.sleep(3);
        choice = random.nextInt(5)+1;
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
            case 4:
                System.out.println("My choice is: " + Moves.values()[choice-1] + "!\n");
                break;
            case 5:
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
