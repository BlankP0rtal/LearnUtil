package com.Molds.Frames;

public enum FunctionKey{
	F1("Memory 1"),
	F2("Memory 2"),
	F3("Memory 3"),
	F4("Execute"),
	F5("Refresh");

	private String key;

	public String getFunction(){
		return key;
	}

	FunctionKey(String keyType){
		key = keyType;
	}
}