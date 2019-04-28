package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private Moves move;
    private Scanner sc = new Scanner(System.in);
    private String playerName;
    private int playerPoints;
    private int choice;

    public Moves playerMove() throws WrongChoice {
        System.out.println("Pick your move! 1 - ROCK, 2 - SCISSORS, 3 - PAPER");

        try{
            choice = Integer.parseInt(sc.nextLine());
            if(choice < 1 || choice > 3) {
                throw new WrongChoice();
            }
        } catch (NumberFormatException e){
            throw new WrongChoice();
        }

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
