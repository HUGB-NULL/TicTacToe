package com._null.tictactoe;

public class TicTacToe
{
	private Board board;

	public TicTacToe() 
	{
		board = new Board();
	}

	public void welcome() 
	{
		System.out.println("====================");
		System.out.println("Welcome to TicTacToe");
		System.out.println("====================");
		System.out.println();
	}

	public static void main(String[] args) 
	{
		TicTacToe tic = new TicTacToe();
		tic.welcome();
	}
}
