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
       	for(int i = 0; i < board.max_size; i++)
    	{
    		for(int j = 0; j < board.max_size; j++)
    		{
    			board.input(i, j, 'x');
    		}
    	}
    	assertEquals(true, board.isFull());
	}
}
