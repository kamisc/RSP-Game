package com.kodilla.rps;

public class Player {
    private Moves move;
    private String playerName;
    private int playerPoints;
    private int choice;

    public Moves playerMove(int choice) throws WrongChoice {

        if(choice < 1 || choice > 5) {
            throw new WrongChoice();
        }

        System.out.println("Your choice is: " + Moves.values()[choice-1] + "!\n");

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

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
}
