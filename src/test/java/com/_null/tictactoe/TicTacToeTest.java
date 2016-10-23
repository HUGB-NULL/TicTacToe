package com._null.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest
{
	@Test
    	public void checkIfTestWorks() 
	{
        	TicTacToe ticTacT = new TicTacToe();
       		assertEquals("Hello World!", ticTacT.ticTac()); 
	}
}
