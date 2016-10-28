package com._null.tictactoe;

public class Board
{
	public static final int max_size = 3;
	private static final char[][] board = new char[max_size][max_size];

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

	public boolean checkForWin(char p)
	{
		if((board[0][0] == p && board[1][1] == p && board[2][2] == p) || 
		   (board[0][2] == p && board[1][1] == p && board[2][0] == p))
		{
			return true;
		}
		else
		{
			for(int i = 0; i < max_size;i++)
			{
				for(int j = 0; j < max_size;j++)
				{
					if(board[i][0] == p && board[i][1] == p && board[i][2] == p)
					{
						return true;
					}
					else if(board[0][j] == p && board[1][j] == p && board[2][j] == p)
					{
						return true;
					}
				}
			}
		}
		return false;
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

	public boolean gameOver(char p)
	{
		if(checkForWin(p))
		{
			System.out.println("Player " + p + " wins!!!");
			return true;
		}
		if(isFull())
		{
			System.out.println("We have a draw!");
			return true;
		}
		return false;
	}

	public boolean checkInputSize(int inp)
 	{
 		if(inp >= max_size || inp < 0)
		{
			return false;
		}
    	return true;
  	}

	public boolean isFree(int x, int y)
	{
		if(board[x][y] == ' ')
		{
			return true;
		}
		return false;
	}

	public boolean input(int x, int y, char inp_char)
  	{
  		if(!(checkInputSize(x) && checkInputSize(y)))
		{
			System.out.print("Input not correct, try again: ");
			return false;
		}
		else if(!isFree(x, y))
		{
			System.out.print("Cell already taken, try again: ");
			return false;
		}
		else
		{
  			board[x][y] = inp_char;
  			return true;
  		}
	}

	public void printBoard()
	{
		System.out.println();
		for(int i = 0; i < max_size;i++)
		{
			System.out.print(" ");
			for(int j = 0; j < max_size;j++)
			{
				System.out.print(board[i][j]);
				if(j != (max_size - 1)) System.out.print(" | ");
			}
			System.out.println();
			if(i != (max_size - 1)) System.out.println("-----------");
		}
		System.out.println();
	}
}
