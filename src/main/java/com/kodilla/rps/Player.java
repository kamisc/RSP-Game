package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerPoints;
    private Moves move;
    private Scanner sc = new Scanner(System.in);
    private int choice;

    public Moves playerMove(){
        System.out.println("Pick your move! 1 - ROCK, 2 - SCISSORS, 3 - PAPER");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Your choice is: " + Moves.values()[choice-1] + "!\n");
                break;
            case 2:
                System.out.println("Your choice is: " + Moves.values()[choice-1] + "!\n");
                break;
            case 3:
                System.out.println("Your choice is: " + Moves.values()[choice-1] + "!\n");
                break;
            default:
                System.out.println("Wrong choice! You must pick 1, 2 or 3!\n");
                break;
        }
        move = Moves.values()[choice-1];
        return move;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public Moves getMove() {
        return move;
    }
}
