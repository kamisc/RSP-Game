package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private Moves move;
    private Scanner sc = new Scanner(System.in);
    private String playerName;
    private int playerPoints;

    public Moves playerMove() throws WrongChoice {
        System.out.println("Pick your move! 1 - ROCK, 2 - SCISSORS, 3 - PAPER, 4 - LIZARD, 5 - SPOCK");

        int choice;

        try{
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
            throw new WrongChoice();
        }

        if(choice < 1 || choice > 5) {
            throw new WrongChoice();
        }

        switch (choice){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Your choice is: " + Moves.values()[choice-1] + "!\n");
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
