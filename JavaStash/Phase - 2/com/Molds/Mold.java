package com.Molds;

public abstract class Mold{

	public Mold(){
		System.out.println();
	}

	public Mold makeMold(){
		return this;
	}

	public void runThis(){
		System.out.println("Running this run Util");
	}

	protected abstract void setSocketOnFrame();
}