package com.Product;

import com.Switch.*;
import com.Molds.Frames.*;

public class Keyboard /*implements CherryMxSwitch, MembraneSwitch, LoftySwitch{*/ extends BoardFrame{
	public static final int gameKey = 234;
	public String type;
	String name;
	double dimension;
	String auraType;
	int gf;


	static int key,button;

	public void setAuraType(String auraType){
		this.auraType = auraType;
	}
	
	public void membrancePressureCheck(){
		System.out.println("this.pressure > this.membranceThreshold ? 'Good' : 'keyFailure'");
	}

	public void onKeyPressAction(){
		System.out.println("keyAction.setKeyFunctinality(this).exec()");
	}

	public void levelApplier(){
		System.out.println("for now only standard Level is available");
	}

	public void activateGearBunch(){
		System.out.println("getLeverBranch(this).setLeverStatus(true)");
	}


	public int getDiffOfAbstract(){
		System.out.println("works fine ah!");
		return 123;
	}

	@Override
	public void setDimension(double x,double y){
		dimension = (x*y)/0.25;
		System.out.println("Dimension set for keyboard");
	}
	

 	void startLedGlow(){
		System.out.print("RGB glow");
	}

	public static void keyStrokeCount(){
		key++;button++;
	}

	//@Override
	public void testFunctionality(){
		System.out.println("works on a better tactical-light clicky bump and have a quite good aucutation force");
		System.out.println(dimension+"\t"+auraType+"\n");
		System.out.println(key+"\t"+button);
	}
	public int getSwitchGf(){
		return gf;
	}
	public String getAuraType(){
		auraType = "RGB";
		return auraType;
	}
	void print(){
		System.out.print(CherryMxSwitch.defKeyType);
	}
}