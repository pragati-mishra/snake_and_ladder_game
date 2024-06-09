package com.dugs.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private int boardSize;	
	private List<Cell> cellList;
	
	public Board(int boardSize, int[][] snake, int[][] ladder) {
		this.boardSize = boardSize*boardSize;
		cellList = new ArrayList<>();
		
		for(int x=1; x<=boardSize*boardSize;x++)
		{
		 Cell cell = new Cell(x);
		 cellList.add(cell);
		}
		
		for(int x=0; x<snake.length; x++)
		{
			Jump jump = new Jump(snake[x][0], snake[x][1]);
			cellList.get(snake[x][0]).setJump(jump);
		}
		
		for(int x=0; x<ladder.length; x++)
		{
			Jump jump = new Jump(ladder[x][0], ladder[x][1]);
			cellList.get(ladder[x][0]).setJump(jump);
		}
		
	}

	public int getBoardSize() {
		return boardSize;
	}

	public int getNextCell(int currentCell, int roll) {
	
		int nextCell = currentCell+roll;
		System.out.println("Moving to Cell Number "+nextCell);
		while(nextCell < cellList.size() && cellList.get(nextCell).getJump() !=null)
		{
			Jump jump = cellList.get(nextCell).getJump();
			if(jump.getEndPoint() > jump.getStartPoint())
				System.out.println("The cell"+nextCell+" has a ladder. Moving to Cell Number "+ jump.getEndPoint());
			else
				System.out.println("The cell"+nextCell+" has a Snake. Moving to Cell Number "+ jump.getEndPoint());
			nextCell = jump.getEndPoint();
		}
		
		return nextCell;	
	}

}
