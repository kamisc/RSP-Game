package com.kodilla.rps;

public class Round {
    private int playerPoints;
    private int computerPoints;

    public void round(Moves playerMove, Moves computerMove, Player player, Computer computer) {
        switch (playerMove){
            case ROCK:
                if(computerMove.equals(Moves.SCISSORS)){
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println(player.getPlayerName() + " gets 1 point!\n");
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                } else if(computerMove.equals(Moves.PAPER)){
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println("Your computer gets 1 point!\n");
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                } else {
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println("DRAW! No one gets a point!\n");
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                }
                break;
            case SCISSORS:
                if(computerMove.equals(Moves.PAPER)){
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println(player.getPlayerName() + " gets 1 point!\n");
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                } else if(computerMove.equals(Moves.ROCK)){
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println("Your computer gets 1 point!\n");
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                } else {
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println("DRAW! No one gets a point!\n");
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                }
                break;
            case PAPER:
                if(computerMove.equals(Moves.ROCK)){
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println(player.getPlayerName() + " gets 1 point!\n");
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                } else if(computerMove.equals(Moves.SCISSORS)){
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println("Your computer gets 1 point!\n");
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                } else {
                    System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
                    System.out.println("DRAW! No one gets a point!\n");
                    System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
                }
                break;
        }
    }
}
