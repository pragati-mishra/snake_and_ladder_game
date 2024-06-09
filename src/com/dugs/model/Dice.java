package com.dugs.model;

import java.util.Random;

public class Dice {
	
	//private int min = 1;
	private int max = 6;
	private Random random = new Random();
	private int diceCount;
	
	public Dice(int diceCount) {
		this.diceCount = diceCount;
	}

	public int rollDice() {
		int total =0;
		
		for(int x= 1; x<=diceCount;x++)
		{
		 int dice = random.nextInt(max)+1;
		 System.out.println("Rolled dice"+x+" : "+dice);
		 total+=dice;
		}
		return total;
	}
	
}
