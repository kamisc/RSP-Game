package com.kodilla.rps;

import org.junit.*;

import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ComputerTestSuite {

    @Test
    public void testComputerMoveRock() throws InterruptedException {
        //Given
        Random mockComputerRock = mock(Random.class);
        when(mockComputerRock.nextInt(Moves.values().length)).thenReturn(1);
        Computer computerRock = new Computer(mockComputerRock);

        //When
        Moves compRock = computerRock.computerMove();
        Moves rock = Moves.ROCK;

        //Then
        Assert.assertEquals(rock, compRock);
    }

    @Test
    public void testComputerMoveScissors() throws InterruptedException {
        //Given
        Random mockComputerScissors = mock(Random.class);
        when(mockComputerScissors.nextInt(5)).thenReturn(2);
        Computer computerScissors = new Computer(mockComputerScissors);

        //When
        Moves compScissors = computerScissors.computerMove();
        Moves scissors = Moves.SCISSORS;

        //Then
        Assert.assertEquals(scissors, compScissors);
    }

    @Test
    public void testComputerMovePaper() throws InterruptedException {
        //Given
        Random mockComputerPaper = mock(Random.class);
        when(mockComputerPaper.nextInt(5)).thenReturn(3);
        Computer computerPaper = new Computer(mockComputerPaper);

        //When
        Moves compPaper = computerPaper.computerMove();
        Moves paper = Moves.PAPER;

        //Then
        Assert.assertEquals(paper, compPaper);
    }

    @Test
    public void testSetAndGetPoints(){
        //Given
        Computer computer = new Computer(new Random());
        //When
        computer.setComputerPoints(3);
        //Then
        Assert.assertEquals(3, computer.getComputerPoints());
    }
}
