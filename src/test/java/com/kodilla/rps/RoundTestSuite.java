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
    public void testRoundPlayerWin(){
        player = mock(Player.class);
        computer = mock(Computer.class);

        when(player.getMove()).thenReturn(Moves.ROCK);
        when(computer.getMove()).thenReturn(Moves.SCISSORS);
        when(player.getPlayerName()).thenReturn("Kamil");

        Round round = new Round();
        round.round(player.getMove(), computer.getMove(), player, computer);

        Assert.assertEquals(1, round.getPlayerPoints());
        Assert.assertEquals(0, round.getComputerPoints());
    }

    @Test
    public void testRoundComputerWin(){
        player = mock(Player.class);
        computer = mock(Computer.class);

        when(player.getMove()).thenReturn(Moves.SPOCK);
        when(computer.getMove()).thenReturn(Moves.PAPER);
        when(player.getPlayerName()).thenReturn("Kamil");

        Round round = new Round();
        round.round(player.getMove(), computer.getMove(), player, computer);

        Assert.assertEquals(0, round.getPlayerPoints());
        Assert.assertEquals(1, round.getComputerPoints());
    }

    @Test
    public void testRoundDraw(){
        player = mock(Player.class);
        computer = mock(Computer.class);

        when(player.getMove()).thenReturn(Moves.LIZARD);
        when(computer.getMove()).thenReturn(Moves.LIZARD);
        when(player.getPlayerName()).thenReturn("Kamil");

        Round round = new Round();
        round.round(player.getMove(), computer.getMove(), player, computer);

        Assert.assertEquals(0, round.getPlayerPoints());
        Assert.assertEquals(0, round.getComputerPoints());
    }
}