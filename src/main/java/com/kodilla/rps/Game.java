package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private int winPointsNumbers;
    private boolean isEnd = false;

    private Scanner sc = new Scanner(System.in);

    private final Round oneRound;
    private final Player player;
    private final Computer computer;
    private final Rules rules;
    private final EndGame endGame;

    public Game(final Round oneRound, final Player player, final Computer computer, final Rules rules, final EndGame endGame) {
        this.oneRound = oneRound;
        this.player = player;
        this.computer = computer;
        this.rules = rules;
        this.endGame = endGame;
    }

    public void welcome(){
        System.out.println("Welcome to the Rock-Scissors-Paper-Lizard-Spock Game! Enjoy Yourself!\n\n" +
                "This is the game for 2 players. One player is you, the other is me - your computer. \n" +
                "At the beginning of the game you have to set up your name and choose to how many points you want to play.\n\n" +
                "REMEMBER: Confirm every choice with the ENTER!\n");
    }

    public void introduceYourself(){
        System.out.println("Tell me, what's your name?");
        player.setPlayerName(sc.nextLine());
    }

    public void showRules(){
        rules.gameRules();
    }

    public void game() throws InterruptedException {
        int count = 0;

        while(!getEnd()){
            System.out.println("Round #" + (count+1));
            count++;

            try{
                oneRound.round(player.playerMove(), computer.computerMove(), player, computer);
            } catch (WrongChoice e) {
                System.out.println(e.getMessage() + " You must pick 1, 2, 3, 4 or 5!\n");
            }

            if(player.getPlayerPoints() == getWinPointsNumbers() || computer.getComputerPoints() == getWinPointsNumbers()){
                setEnd(true);
                System.out.println("The game is over!\n");
                System.out.println("FINAL RESULT: " + player.getPlayerName() + " " + player.getPlayerPoints() + " : " + computer.getComputerPoints() + " Computer");
                System.out.print("\nAnd the winner is... ");

                if(player.getPlayerPoints() > computer.getComputerPoints()){
                    System.out.println(player.getPlayerName() + "!!!\n");
                    endGame.endGame();
                } else {
                    System.out.println("COMPUTER!!!\n");
                    endGame.endGame();
                }
            }
        }
    }

    public boolean getEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public int getWinPointsNumbers() {
        return winPointsNumbers;
    }

    public void setWinPointsNumbers() throws WrongChoice {
        System.out.println("Hello, " + player.getPlayerName() + "! How many points do you want to get to finish the game?");

        int number;

        try{
            number = Integer.parseInt(sc.nextLine());
            this.winPointsNumbers = number;
        } catch (NumberFormatException e){
            throw new WrongChoice();
        }

        if(number < 1){
            throw new WrongChoice();
        }

    }
}
