package com.n.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ticTacToeTest
{
	@Test
    	public void checkIfTestWorks() 
	{
        	ticTacToe ticTacT = new ticTacToe();
       		assertEquals("Hello World!", ticTacT.ticTac()); 
	}
}
