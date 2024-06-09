package com.dugs.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.dugs.model.Board;
import com.dugs.model.Dice;
import com.dugs.model.Player;

public class Game {
	Board board;
	Dice dice;
	Queue<Player> playerList;
	
	public Game(int boardSize, int diceCount, int[][] snake, int[][] ladder, String[] players) {
		board = new Board(boardSize, snake, ladder);
		dice = new Dice(diceCount);
		playerList = new LinkedList<>();
		for(String player : players)
		{
			playerList.offer(new Player(player,0));
		}
	}

	public String start() {
		
		while(!playerList.isEmpty())
		{
			Player currentPlayer = playerList.poll();
			System.out.println(currentPlayer.getName()+ " has the turn now .");
			
			int roll = dice.rollDice();
			
			int nextCell = board.getNextCell(currentPlayer.getcurrentCell(), roll);
			
			if(nextCell <= board.getBoardSize())
			{	
				currentPlayer.setcurrentCell(nextCell);
				
				if(nextCell == board.getBoardSize())
					return currentPlayer.getName();
				else
					playerList.offer(currentPlayer);
			}
			else
			{
				playerList.offer(currentPlayer);
				System.out.println("Next Cell is > boardSize. Player "+ currentPlayer.getName()+" will wait for next turn" );
			}
			
		}
		
	 return "GAME ERROR";
	}

}
