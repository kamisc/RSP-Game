package com.kodilla.rps;

import org.junit.*;

import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ComputerTestSuite {

    @Test
    public void testSetAndGetPoints(){
        //Given
        Computer computer = new Computer(new Random());
        //When
        computer.setComputerPoints(3);
        //Then
        Assert.assertEquals(3, computer.getComputerPoints());
    }

    @Test
    public void testComputerMoveRock() throws InterruptedException {
        //Given
        Random mockComputerRock = mock(Random.class);
        when(mockComputerRock.nextInt(Moves.values().length)).thenReturn(0);
        Computer computer = new Computer(mockComputerRock);

        //When
        Moves rock = computer.computerMove();

        //Then
        Assert.assertEquals(Moves.ROCK, rock);
    }

    @Test
    public void testComputerMoveScissors() throws InterruptedException {
        //Given
        Random mockComputerScissors = mock(Random.class);
        when(mockComputerScissors.nextInt(Moves.values().length)).thenReturn(1);
        Computer computer = new Computer(mockComputerScissors);

        //When
        Moves scissors = computer.computerMove();

        //Then
        Assert.assertEquals(Moves.SCISSORS, scissors);
    }

    @Test
    public void testComputerMovePaper() throws InterruptedException {
        //Given
        Random mockComputerPaper = mock(Random.class);
        when(mockComputerPaper.nextInt(Moves.values().length)).thenReturn(2);
        Computer computer = new Computer(mockComputerPaper);

        //When
        Moves paper = computer.computerMove();

        //Then
        Assert.assertEquals(Moves.PAPER, paper);
    }

    @Test
    public void testComputerMoveLizard() throws InterruptedException {
        //Given
        Random mockComputerLizard = mock(Random.class);
        when(mockComputerLizard.nextInt(Moves.values().length)).thenReturn(3);
        Computer computer = new Computer(mockComputerLizard);

        //When
        Moves lizard = computer.computerMove();

        //Then
        Assert.assertEquals(Moves.LIZARD, lizard);
    }

    @Test
    public void testComputerMoveSpock() throws InterruptedException {
        //Given
        Random mockComputerSpock = mock(Random.class);
        when(mockComputerSpock.nextInt(Moves.values().length)).thenReturn(4);
        Computer computer = new Computer(mockComputerSpock);

        //When
        Moves spock = computer.computerMove();

        //Then
        Assert.assertEquals(Moves.SPOCK, spock);
    }
}
