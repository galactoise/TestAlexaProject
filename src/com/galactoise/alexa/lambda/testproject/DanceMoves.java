package com.galactoise.alexa.lambda.testproject;

import java.util.Random;

public enum DanceMoves{
	BEND_OVER("Bend over make your knee touch your elbows."),
	GET_LOW("Get low."),
	WIGGLE("Wiggle that ass, make it shake like Jell-o."),
	YOGA_BALL("Put your hands on your knees, bounce that ass like a yoga ball"),
	SNAP_YO_FINGAS("Snap yo fingas, and do yo step.");;
	
	private String text;
	
	private DanceMoves(String text){
		this.text = text;
	}
	
	public String toString(){
		return text;
	}
	
	public static DanceMoves generateRandomDanceMove(){
		return DanceMoves.values()[new Random().nextInt(DanceMoves.values().length)];
	}
}