package com.Test.Types;

public class SingleTonClass{
	public static SingleTonClass singleTon = new SingleTonClass();
	public String singleVar;
	private SingleTonClass(){
		//dummyt
	}
}