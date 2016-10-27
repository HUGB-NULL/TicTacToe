package com._null.tictactoe;

public class Board
{
	public static final int max_size = 3;
	public static final char[][] board = new char[max_size][max_size];

	public Board()
	{
		for(int i = 0; i < max_size; i++)
    	{
    		for(int j = 0; j < max_size; j++)
    		{
    			board[i][j] = ' ';
    		}
    	}
  	}

	public boolean isFull()
	{
		for(int i = 0; i < max_size; i++)
		{
			for(int j = 0; j < max_size; j++)
			{
				if(board[i][j] == ' ') return false;
			}
        }
    	return true;
    }

}