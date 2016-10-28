package com._null.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest
{
	@Test
	public void isFullTest() 
	{
        Board board = new Board();
        assertEquals(false, board.isFull());
        board.input(0, 0, 'o');
        assertEquals(false, board.isFull());
        for(int i = 0; i < board.max_size; i++)
        {
        	for(int j = 0; j < board.max_size; j++)
            {
        	   board.input(i, j, 'x');
        	}
        }
        assertEquals(true, board.isFull());
	}

	@Test
	public void checkInputSizeTest()
	{
    	Board board = new Board();
    	assertEquals(false, board.checkInputSize(board.max_size));
    	assertEquals(false, board.checkInputSize(-1));
    	assertEquals(true, board.checkInputSize(board.max_size - 1));
    	assertEquals(true, board.checkInputSize(0));
	}

	@Test
	public void checkIfFreeTest()
	{
		Board board = new Board();
   		assertEquals(true, board.checkIfFree(0,0));
   		board.input(0, 0, 'x');
   		assertEquals(false, board.checkIfFree(0,0));
	}

	@Test
	public void checkForWinTest()
	{
    	Board board = new Board();
    	assertEquals(false, board.checkForWin('x'));
		board.input(0, 0, 'x');
		board.input(0, 1, 'x');
		board.input(0, 2, 'x');
		assertEquals(true, board.checkForWin('x'));

		board = new Board();
		assertEquals(false, board.checkForWin('o'));
    	board.input(0, 0, 'o');
    	board.input(1, 0, 'o');
    	board.input(2, 0, 'o');
    	assertEquals(true, board.checkForWin('o'));

    	board = new Board();
    	assertEquals(false, board.checkForWin('x'));
    	board.input(0, 0, 'x');
    	board.input(1, 1, 'x');
    	board.input(2, 2, 'x');
    	assertEquals(true, board.checkForWin('x'));
	}

	@Test
	public void gameOverTest()
	{
    	Board board = new Board();
    	assertEquals(false, board.gameOver('x'));
    	board.input(0, 0, 'x');
    	board.input(0, 1, 'x');
    	board.input(0, 2, 'x');
    	assertEquals(true, board.gameOver('x'));

    	board = new Board();
    	assertEquals(false, board.gameOver('x'));
    	assertEquals(false, board.gameOver('o'));
    	board.input(0, 0, 'x');
    	board.input(0, 1, 'x');
    	board.input(0, 2, 'o');
    	board.input(1, 0, 'o');
    	board.input(1, 1, 'o');
    	board.input(1, 2, 'x');
    	board.input(2, 0, 'x');
    	board.input(2, 1, 'o');
    	board.input(2, 2, 'x');
    	assertEquals(false, board.checkForWin('x'));
    	assertEquals(false, board.checkForWin('o'));
    	assertEquals(true, board.gameOver('x'));
    	assertEquals(true, board.gameOver('o'));
	}
}

