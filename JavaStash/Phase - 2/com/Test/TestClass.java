package com.Test;


public class TestClass{
	public static int x;
	public static void update(int i){
		System.out.println("Welcome to the base");
		x += i;
	}
	public static void print(){
		System.out.println("Super => "+x);
	}
	public TestClass overrideReturn(){
		System.out.println(this);
		return this;
	}
}