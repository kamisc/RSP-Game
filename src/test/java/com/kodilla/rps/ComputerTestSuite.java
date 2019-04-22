package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ComputerTestSuite {

    @Test
    public void testPlayerMove() throws InterruptedException {
        //Given
        Computer mockPlayerRock = mock(Computer.class);
        Computer mockPlayerScissors = mock(Computer.class);
        Computer mockPlayerPaper = mock(Computer.class);

        when(mockPlayerRock.computerMove()).thenReturn(Moves.ROCK);
        when(mockPlayerScissors.computerMove()).thenReturn(Moves.SCISSORS);
        when(mockPlayerPaper.computerMove()).thenReturn(Moves.PAPER);

        //When
        Moves rock = mockPlayerRock.computerMove();
        Moves scissors = mockPlayerScissors.computerMove();
        Moves paper = mockPlayerPaper.computerMove();

        //Then
        Assert.assertEquals(Moves.ROCK, rock);
        Assert.assertEquals(Moves.SCISSORS, scissors);
        Assert.assertEquals(Moves.PAPER, paper);
    }

    @Test
    public void testSetAndGetPoints(){
        //Given
        Computer player = new Computer();
        //When
        player.setComputerPoints(3);
        //Then
        Assert.assertEquals(3, player.getComputerPoints());
    }
}
