package com.kodilla.rps;

public class Round {
    private int playerPoints;
    private int computerPoints;

    public void messageWhenPlayerWin(Player player, Computer computer){
        System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
        System.out.println(player.getPlayerName() + " gets 1 point!\n");
        System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
    }

    public void messageWhenComputerWin(Player player, Computer computer){
        System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
        System.out.println("Your computer gets 1 point!\n");
        System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
    }

    public void messageWhenDraw(Player player, Computer computer){
        System.out.println(player.getPlayerName() + " = " + player.getMove() + " vs. " + computer.getMove() + " = Computer");
        System.out.println("DRAW! No one gets a point!\n");
        System.out.println(player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer\n");
    }

    public void round(Moves playerMove, Moves computerMove, Player player, Computer computer) {
        switch (playerMove){
            case ROCK:
                if(computerMove.equals(Moves.SCISSORS)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.LIZARD)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.PAPER)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else if(computerMove.equals(Moves.SPOCK)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else {
                    messageWhenDraw(player, computer);
                }
                break;

            case SCISSORS:
                if(computerMove.equals(Moves.PAPER)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.LIZARD)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.ROCK)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else if(computerMove.equals(Moves.SPOCK)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else {
                    messageWhenDraw(player, computer);
                }
                break;

            case PAPER:
                if(computerMove.equals(Moves.ROCK)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.SPOCK)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.SCISSORS)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else if(computerMove.equals(Moves.LIZARD)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else {
                    messageWhenDraw(player, computer);
                }
                break;

            case LIZARD:
                if(computerMove.equals(Moves.SPOCK)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.PAPER)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.SCISSORS)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else if(computerMove.equals(Moves.ROCK)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else {
                    messageWhenDraw(player, computer);
                }
                break;

            case SPOCK:
                if(computerMove.equals(Moves.SCISSORS)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.ROCK)){
                    playerPoints++;
                    player.setPlayerPoints(playerPoints);
                    messageWhenPlayerWin(player, computer);
                } else if(computerMove.equals(Moves.LIZARD)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else if(computerMove.equals(Moves.PAPER)){
                    computerPoints++;
                    computer.setComputerPoints(computerPoints);
                    messageWhenComputerWin(player, computer);
                } else {
                    messageWhenDraw(player, computer);
                }
                break;
        }
    }
}
