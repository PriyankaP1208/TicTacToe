package tictactoe;

import java.util.Scanner;

public class TicTacToeGame 
{
	public static void main(String[] args)
	{
		int index,randomCheck = 0,toss=0;
		char player,computer;
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
		player=getLetter();
		if(player=='X')
		{
			computer='O';
		}
		else
		{
			computer='X';
		}
		System.out.println("Computer letter is:"+computer);
		showBoard(board);
		index=isFree(board);
		doMove(board,player,index);
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
	private static char getLetter()
	{
		char player,computer;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter letter  X or O:");
		player=sc.next().charAt(0);
		if(player!='X' && player!='O')
		{
			System.out.println("Enter valid input");
			player=getLetter();
		}
		System.out.println("Player letter is:"+player);
		return player;  

	}
	private static void showBoard(char board[])
	{
		System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
		System.out.println("|-----------|");
		System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" |");
		System.out.println("|-----------|");
		System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" |");
	}
	private static void doMove(char board[],char player,int index)
	{
		board[index]=player;
		showBoard(board);
	}
	private static int isFree(char board[])
	{
		int index;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index from 0 to 8");
		index=sc.nextInt();
		if(index>0 && index<9 && board[index]==' ')
		{
			return index;
		}
		else
		{
			System.out.println("Re Enter index:");
			isFree(board);
			return 0;
		}
	}
}
