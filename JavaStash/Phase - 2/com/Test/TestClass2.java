package com.Test;

public class TestClass2 extends TestClass{
	public static int x;
	public final static void update(int y){
		System.out.println("Welcome to the extended one");
		TestClass2.x += y;
	}

	public TestClass2 TestClass(){
		return this;
	}
	static public void print(){ // Ghost function,
		System.out.println("Derived => "+x);
	}
	public TestClass overrideReturn(){
		return new TestClass();
	}
}