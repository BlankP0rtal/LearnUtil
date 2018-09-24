package com.Product;

import com.Molds.Frames.*;

public class JoySticks extends BoardFrame {
	String type;
	String auraType;
	double dimension;
	static int radius = 3;

	static int 	button,
				socketSurfaceHit;

	public void setAuraType(String auraType){
		this.auraType = auraType;
	}
	void setStickRadial(int radius){
		this.radius = radius;
	}

	@Override
	public void setDimension(double x,double y){
		dimension = (radius*x + radius*y) / 3.14;
		System.out.println("s set for joystick");
	}
	

	public static void keyStrokeCount(){
		button += 2;
		socketSurfaceHit += radius * 1.5 + 1;
	}

	public void testFunctionality(){
		System.out.println("The stick rounds on a smooth "+radius+"cm radial scale");
		System.out.println("And the functional buttons works perfectly\t"+dimension+"\t"+this.type+"\n"+this.auraType+"\n");
		System.out.println(socketSurfaceHit+"\t"+button);
	}
}