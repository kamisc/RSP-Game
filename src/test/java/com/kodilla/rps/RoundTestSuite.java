package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RoundTestSuite {

    private Player player;
    private Computer computer;

    @Before
    public void setUp(){
        player = new Player();
        computer = new Computer(new Random());
    }

    @Test
    public void testRound(){
        player = mock(Player.class);
        computer = mock(Computer.class);

        when(player.getMove()).thenReturn(Moves.ROCK);
        when(computer.getMove()).thenReturn(Moves.SCISSORS);
        when(player.getPlayerName()).thenReturn("Kamil");

        Round round = new Round();
        round.round(player.getMove(), computer.getMove(), player, computer);

        Assert.assertEquals(1, player.getPlayerPoints());
        Assert.assertEquals(0, computer.getComputerPoints());
    }

}
