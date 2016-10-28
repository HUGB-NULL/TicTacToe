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

	public void input(int x, int y, char inp_char)
  	{
  		if(inputValidation(x))
  		{
  			if(inputValidation(y))
  			{
  				if(checkIfFree(x, y))
  				{
    				board[x][y] = inp_char;
    			}
    			else System.out.println("already taken");
    		}
    		else System.out.println("y not valid input");
    	}
    	else System.out.println("x not valid input");
	}

	public boolean inputValidation(int inp)
 	{
 		if(inp >= max_size || inp < 0)
    	{
      		return false;
    	}
    	return true;
  	}

	public boolean checkIfFree(int x, int y)
	{
		if(board[x][y] == ' ')
		{
			return true;
		}
		return false;
	}

}