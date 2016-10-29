package com._null.tictactoe;

import java.util.Scanner;

public class TicTacToe
{
	private Board board;
	private static final char[] players = {'x', 'o'};

	public void welcome() 
	{
		System.out.println();
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
			board = new Board();
			runGame();
			System.out.print("Game over. Do you want to play again? (y/n): ");
			yn_char = sc.next().charAt(0);
			System.out.println();
		} while(yn_char != 'n');
		System.out.println("Thank you for playing TicTacToe. Goodbye!");
	}

	public void runGame() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("The game starts now!");
		boolean game_over = false;
		while(!game_over) {
			for(char p : players) 
			{
				board.printBoard();
				System.out.print("Player " + p + " make your move: ");
				int row, column;
				do {
					row = sc.nextInt();
					column = sc.nextInt();
				} while(!board.input(row, column, p));
				game_over = board.gameOver(p);
				if(game_over) break;
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
