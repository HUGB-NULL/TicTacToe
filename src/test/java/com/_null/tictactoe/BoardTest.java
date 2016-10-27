package com._null.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest
{
	@Test
    public void checkIfTestWorks() 
	{
        	Board board = new Board();
       		assertEquals("Hello Board!", board.helloBoard()); 
	}
}
