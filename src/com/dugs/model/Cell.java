package com.dugs.model;

public class Cell {
	private int cellNumber;
	private Jump jump;
	
	public Cell(int x) {
		this.cellNumber = x;
		this.jump = null;
	}
	
	public int getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}
	public Jump getJump() {
		return jump;
	}
	public void setJump(Jump jump) {
		this.jump = jump;
	}
	
	
}
