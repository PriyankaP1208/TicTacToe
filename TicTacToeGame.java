package tictactoe;

import java.util.Scanner;

public class TicTacToeGame 
{
	public static void main(String[] args)
	{
		int index,randomCheck = 0,toss=0;
		char[] board=createBoard();
		play();
		if(randomCheck==toss)
		{
			System.out.println("Player will play");
		}
		else
		{
			System.out.println("Computer will play");
		}
	}

	private static char[] createBoard()
	{
		char[] board=new char[10];
		for(int i=0;i<board.length;i++)
		{
			board[i]=' ';//Initializing the board
		}
		return board;
	}
	private static int play()
	{
		int toss=1;
		double rndomCheck=Math.floor(Math.random()*10)%2;
		int randomCheck = 0;
		return randomCheck;
	}
}
