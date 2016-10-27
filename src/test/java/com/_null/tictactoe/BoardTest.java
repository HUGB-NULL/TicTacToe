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
	}
}
