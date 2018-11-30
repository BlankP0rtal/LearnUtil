package com.Switch;

public interface CherryMxSwitch{
	String defKeyType = "Spring-mechanical switches";
	Integer keyPressCount = 23;//new Integer(23);	//To check if integer and int has same when it is on the case of the final
	int getSwitchGf();
	String getAuraType();
	default void setDefaultSwitchAura(){
		System.out.println("def method in interfaces"); //if in case the tourney game the team server person can set the default rgb color to all the player keyboard (useless though :v).
	}
}