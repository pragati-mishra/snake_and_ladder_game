package com.dugs.model;

public class Player {
		private String name;
		private int currentCell;
		
		public Player(String name, int currentCell)  {
			this.name = name;
			this.currentCell = currentCell;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getcurrentCell() {
			return currentCell;
		}
		public void setcurrentCell(int currentCell) {
			this.currentCell = currentCell;
			System.out.println("Player "+name+" moved to cell "+ currentCell);
		}
}
