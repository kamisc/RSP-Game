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
        choice = random.nextInt(Moves.values().length) ;

        System.out.println("My choice is: " + Moves.values()[choice] + "!\n");

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
