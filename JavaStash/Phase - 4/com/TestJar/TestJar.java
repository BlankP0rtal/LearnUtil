//Use jar file
package com.TestJar;

import com.Jar.*;

class StringManuip{
	int countWords(String msg) throws TokenizerException{
		StringToken strtok = new StringToken();
		strtok.setString(msg);
		//strtok.setDelimeters(", ");
		return strtok.toList(msg).size();
	}
}

public class TestJar{
	void testStringManuip(){
		try{
			String message="aasdfa, asdf, aadsfwer, awerawer, awerawerwe, aeraweraew, adfawerawe, awerawerawer, aweraweraewr, awerawerawer, a, a, a, a, a, awer, a, s, sdf, dsf, asdfasdfasdf, asdfa we, sffgrt, asdfasdf";
			System.out.println(new StringManuip().countWords(message));
		}catch(Exception ex){
			System.out.println(ex.toString());
		}
	}
	public static void main(String...params){
		new TestJar().testStringManuip();
	}
}