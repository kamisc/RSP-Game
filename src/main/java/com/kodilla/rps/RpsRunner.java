package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) throws InterruptedException {

        Game startGame = new Game(new Round(), new Player(), new Computer(), new Rules(), new EndGame());
        startGame.welcome();
        startGame.introduceYourself();
        startGame.setWinPointsNumbers();
        startGame.showRules();
        startGame.game();
    }
}
