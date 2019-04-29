package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public final class EndGame {

    private Scanner sc = new Scanner(System.in);
    private String choice;
    private boolean isEnd = false;
    private boolean isWrong = false;

    public void endGame() throws InterruptedException {
        System.out.println("We finished! Thank you for the game.\n" +
                "Tell me what's now?\n" +
                "End game - press capital X\n" +
                "New game - press capital N");

        while(!isEnd()){
            try{
                choice = sc.nextLine();
                if(!choice.equals("N") && !choice.equals("X")){
                    throw new WrongChoice();
                }
                setEnd(true);
            } catch (WrongChoice e) {
                System.out.println(e.getMessage() + " You must pick capital X or N!");
            }
        }

        switch(choice){
            case "X":
                System.exit(0);
                break;
            case "N":
                Game game = new Game(new Round(), new Player(), new Computer(new Random()), new Rules(), new EndGame());
                game.welcome();
                game.introduceYourself();
                while(!isWrong){
                    try{
                        game.setWinPointsNumbers();
                        isWrong = true;
                    } catch (WrongChoice e){
                        System.out.println(e.getMessage() + " You must write a positive number!\n");
                    }
                }
                game.showRules();
                game.game();
                break;
        }
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
