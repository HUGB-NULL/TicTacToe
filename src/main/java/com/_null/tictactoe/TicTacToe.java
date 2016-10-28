package com._null.tictactoe;

import java.util.Scanner;

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

	public void startGame() 
	{
		char yn_char;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Game played");
			System.out.println("Do you want to play again? (y/n)");
			yn_char = sc.next().charAt(0);
		} while(yn_char != 'n');
	}

	public static void main(String[] args) 
	{
		TicTacToe tic = new TicTacToe();
		tic.welcome();
		tic.startGame();
	}
}
