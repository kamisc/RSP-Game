package com.kodilla.rps;

import java.util.Random;

public class RpsRunner {

    public static void main(String[] args) throws InterruptedException {

        Boolean isWrong = false;

        Game startGame = new Game(new Round(), new Player(), new Computer(new Random()), new Rules(), new EndGame());
        startGame.welcome();
        startGame.introduceYourself();

        while(!isWrong){
            try{
                startGame.setWinPointsNumbers();
                isWrong = true;
            } catch (WrongChoice e){
                System.out.println(e.getMessage() + " You must write a positive number!\n");
            }
        }

        startGame.showRules();
        startGame.game();

    }
}
