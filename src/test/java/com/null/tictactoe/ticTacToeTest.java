package com.tictactoe;

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
	@Test
        public void checkIfTestWorksVol2()
        {
                ticTacToe ticTacT = new ticTacToe();
                assertEquals("Hello World", ticTacT.ticTac());
        }

}
