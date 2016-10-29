package com._null.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest
{
	@Test
	public void calcRowTest()
	{
		TicTacToe tic = new TicTacToe();
		assertEquals(-1, tic.calcRow(0));
		assertEquals(0, tic.calcRow(1));
		assertEquals(0, tic.calcRow(2));
		assertEquals(0, tic.calcRow(3));
		assertEquals(1, tic.calcRow(4));
		assertEquals(1, tic.calcRow(5));
		assertEquals(1, tic.calcRow(6));
		assertEquals(2, tic.calcRow(7));
		assertEquals(2, tic.calcRow(8));
		assertEquals(2, tic.calcRow(9));
		assertEquals(3, tic.calcRow(10));
	}

	@Test
	public void calcColumnTest()
	{
		TicTacToe tic = new TicTacToe();
		assertEquals(0, tic.calcColumn(1));
		assertEquals(1, tic.calcColumn(2));
		assertEquals(2, tic.calcColumn(3));
		assertEquals(0, tic.calcColumn(4));
		assertEquals(1, tic.calcColumn(5));
		assertEquals(2, tic.calcColumn(6));
		assertEquals(0, tic.calcColumn(7));
		assertEquals(1, tic.calcColumn(8));
		assertEquals(2, tic.calcColumn(9));
	}
}