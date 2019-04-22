package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    public void testPlayerMove(){
        //Given
        Player mockPlayerRock = mock(Player.class);
        Player mockPlayerScissors = mock(Player.class);
        Player mockPlayerPaper = mock(Player.class);

        when(mockPlayerRock.playerMove()).thenReturn(Moves.ROCK);
        when(mockPlayerScissors.playerMove()).thenReturn(Moves.SCISSORS);
        when(mockPlayerPaper.playerMove()).thenReturn(Moves.PAPER);

        //When
        Moves rock = mockPlayerRock.playerMove();
        Moves scissors = mockPlayerScissors.playerMove();
        Moves paper = mockPlayerPaper.playerMove();

        //Then
        Assert.assertEquals(Moves.ROCK, rock);
        Assert.assertEquals(Moves.SCISSORS, scissors);
        Assert.assertEquals(Moves.PAPER, paper);
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
}
