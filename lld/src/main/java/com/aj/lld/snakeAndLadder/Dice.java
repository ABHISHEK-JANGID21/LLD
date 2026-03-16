package com.aj.lld.snakeAndLadder;

public class Dice {
	
//	public int roll() {
//		Random random = new Random();
//		return 1+ random.nextInt(6);   
//	}
	
	public int roll() {
		return 1+ (int)(Math.random()*6);
	}

}
