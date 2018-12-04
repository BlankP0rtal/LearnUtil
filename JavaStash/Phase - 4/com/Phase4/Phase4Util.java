 //Phase-4
package com.Phase4;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class SerializeTest extends FileInputStream{
	//File file=null;
	public SerializeTest() throws FileNotFoundException{
		super("file.txt");
	}

}

class ObjectStream extends SerializeTest{
	//Try Transient and Static
}

public class Phase4Util {
	public static void main(String...prams){
		
	}
}