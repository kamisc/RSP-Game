package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTestSuite {

    @Test
    public void testSetAndGetName(){
        //Given
        Player player = new Player();
        //When
        player.setPlayerName("Kamil");
        //Then
        Assert.assertEquals("Kamil", player.getPlayerName());
    }

    @Test
    public void testSetAndGetPoints(){
        //Given
        Player player = new Player();
        //When
        player.setPlayerPoints(5);
        //Then
        Assert.assertEquals(5, player.getPlayerPoints());
    }

    @Test
    public void testPlayerMoveRock() throws WrongChoice {
        //Given
        Player player = new Player();
        player.setChoice(1);

        //When
        Moves rock = player.playerMove(player.getChoice());

        //Then
        Assert.assertEquals(Moves.ROCK, rock);
    }

    @Test
    public void testPlayerMoveScissors() throws WrongChoice {
        //Given
        Player player = new Player();
        player.setChoice(2);

        //When
        Moves scissors = player.playerMove(player.getChoice());

        //Then
        Assert.assertEquals(Moves.SCISSORS, scissors);
    }

    @Test
    public void testPlayerMovePaper() throws WrongChoice {
        //Given
        Player player = new Player();
        player.setChoice(3);

        //When
        Moves paper = player.playerMove(player.getChoice());

        //Then
        Assert.assertEquals(Moves.PAPER, paper);
    }

    @Test
    public void testPlayerMoveLizard() throws WrongChoice {
        //Given
        Player player = new Player();
        player.setChoice(4);

        //When
        Moves lizard = player.playerMove(player.getChoice());

        //Then
        Assert.assertEquals(Moves.LIZARD, lizard);
    }

    @Test
    public void testPlayerMoveSpock() throws WrongChoice {
        //Given
        Player player = new Player();
        player.setChoice(5);

        //When
        Moves spock = player.playerMove(player.getChoice());

        //Then
        Assert.assertEquals(Moves.SPOCK, spock);
    }

    @Test(expected = NumberFormatException.class)
    public void testThrownNumberFormatException(){
        //Given
        Player player = new Player();

        //When
        player.setChoice(Integer.parseInt("a"));
    }

    @Test(expected = WrongChoice.class)
    public void testThrownWrongChoiceException() throws WrongChoice {
        //Given
        Player player = new Player();

        //When
        player.setChoice(Integer.parseInt("-1"));
        player.playerMove(player.getChoice());
    }

}
