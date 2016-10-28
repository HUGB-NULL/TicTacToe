package com._null.tictactoe;

import java.util.Scanner;

public class TicTacToe
{
	private Board board;
	private char[] players = {'x', 'o'};

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
		Scanner sc = new Scanner(System.in);
		char yn_char;
		do {
			runGame();
			System.out.println("Game over. Do you want to play again? (y/n)");
			yn_char = sc.next().charAt(0);
		} while(yn_char != 'n');
		System.out.println("Thank you for playing TicTacToe. Goodbye!");
	}

	public void runGame() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("The game starts now!");
		boolean gameOver = false;
		while(!gameOver) {
			for(char p : players) 
			{
				System.out.println();
				System.out.println("Player " + p + " make your move");
				board.printBoard();
				int row, column;
				do {
					row = sc.nextInt();
					column = sc.nextInt();
				} while(!board.input(row, column, p));
				gameOver = board.gameOver(p);
				if(gameOver) break;
			}
		}
		board.printBoard();
	}

	public static void main(String[] args) 
	{
		TicTacToe tic = new TicTacToe();
		tic.welcome();
		tic.startGame();
	}
}
