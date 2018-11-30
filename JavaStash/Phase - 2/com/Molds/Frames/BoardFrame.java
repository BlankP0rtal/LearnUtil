package com.Molds.Frames;

import com.Product.Keyboard.*;
import com.Molds.*;

public class BoardFrame extends Mold {
	String type = "hard-steel";
	String auraType;
	int switchSocketType = 2;
	double dimension;
	boolean ledGlowStatus = false;
	String aura = "Green";
	//Integer[] keys = new Interger[26];
	private static int key;


	public void setSocketOnFrame(){
		System.out.println("The socket strean was set, !!");
	}

	public int getDiffOfAbstract(){
		System.out.println("works fine ah!");
		return 0;
	}

	public void setDimension(double x,double y){
		dimension = x*y;
		System.out.println("Dimension for base, not required ;)");
	}
	public void setLedType(String type){
		auraType = type;
	}
	private void startLedGlow(){
		System.out.print(ledGlowStatus == true ? "It is already in on state" : aura);//led.color);
	}
	public void testFunctionality(){
		System.out.println("Just Frame cant be tested!\tkeystroke count => "+ key);
	}
	public static void keyStrokeCount(){
		key++;
	}
}