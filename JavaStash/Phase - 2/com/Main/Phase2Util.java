package com.Main;

import com.Product.*;
import com.Test.Types.*;
import com.Test.*;
import com.Molds.Frames.*;
import com.Switch.*;
import static java.lang.System.*;
//import static com.Product.Keyboard.*;
/* LearnUtil phase - 2  [ Inheritance ] */


public class Phase2Util implements Cloneable{

	String strObj;
	Integer intPObj;
	Keyboard strafe;

	public Object clone() throws CloneNotSupportedException{
		return (Phase2Util)super.clone();
	}


	public static void main(String[] A) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//System.out.println(FunctionKey.valueOf("F1").getFunction());
		TestEnum testEnum = new TestEnum();
		String[] arr = {"ajsdfaksjf","Sdfsdfsd","Sdfsdfsd"};
		

		System.out.println("\n\n\n");		
		com.Molds.Frames.FunctionKey key = com.Molds.Frames.FunctionKey.F1;

		System.out.println("\n\t"+Keyboard.gameKey+"\n");
		//System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		//Phase2Util phase = new Phase2Util();
		//Phase2Util reflect = (Phase2Util)Class.forName("Phase2Util").newInstance(); //Why wasnt the class detected ?
		/*final Integer vari = new Integer(34);
		 CherryMxSwitch alloyFps = new Keyboard();
		 Keyboard alloyLite = new Keyboard();

		 alloyFps.setDefaultSwitchAura();
		 alloyLite.setDefaultSwitchAura();
		 //
		
		alloyLite.levelApplier();*/

		
		 	SingleTonClass instance = SingleTonClass.singleTon, instance2 = SingleTonClass.singleTon, instance3 = SingleTonClass.singleTon;

		 	instance.singleVar = "rangnork";

		 	System.out.println(instance.singleVar+"\n"+instance2.singleVar+"\n"+instance3.singleVar);
		
		//alloyLite.type = "fibe-x";
		System.out.println(key.getFunction());//key.valueOf("Execute"));
		System.out.println(key.getFunction());

		
		BoardFrame hardSteel = new Keyboard();
		BoardFrame splCherry = new JoySticks();


		new BoardFrame().keyStrokeCount();
		
		new Keyboard().keyStrokeCount();
		new JoySticks().keyStrokeCount();

		Keyboard corsairK70 = new Keyboard();

		corsairK70.setDimension(5,7);
		corsairK70.setAuraType("Blue-wave");
		corsairK70.testFunctionality();

		hardSteel.setDimension(3.5, 7.2);
		/*hardSteel.auraType="rbg"*/	//why didnt this work(get updated during hardSteel.testFunctionality()) ?? => cuz that instance that for this calls was refernced to interface var so the interface var cannt update its refered instances's members directly (without a fuction directrly written there).


		splCherry.setDimension(4, 9);
		//splCherry.type = "jetControl-342";

		hardSteel.keyStrokeCount();
		splCherry.keyStrokeCount();

		new BoardFrame().testFunctionality();
		hardSteel.testFunctionality();
		splCherry.testFunctionality();
		out.println("\nnoMORE-SYSO\n");
		
		
		

		/*Reclarification on static and regular dynamic method binding concept*/
		TestClass test = new TestClass2();
		TestClass2 derivedTest = new TestClass2();


		test.x = 4;
		test.print();
		test.update(25);
		test.print();
		
		TestClass TEST = new TestClass();
		TEST.update(111);
		TEST.print();

		derivedTest.x = 4;
		derivedTest.print();
		derivedTest.update(25);
		derivedTest.print();
	}
}