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
        choice = random.nextInt(Moves.values().length) + 1;
        switch (choice){
            case 0:
                System.out.println("My choice is: " + Moves.values()[0] + "!\n");
                break;
            case 1:
                System.out.println("My choice is: " + Moves.values()[1] + "!\n");
                break;
            case 2:
                System.out.println("My choice is: " + Moves.values()[2] + "!\n");
                break;
            case 3:
                System.out.println("My choice is: " + Moves.values()[3] + "!\n");
                break;
            case 4:
                System.out.println("My choice is: " + Moves.values()[4] + "!\n");
                break;
        }
        move = Moves.values()[choice];
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
