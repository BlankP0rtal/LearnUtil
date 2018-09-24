//Jar file
package com.Jar;

import java.util.*;

public class StringToken{

	private String string;
	private char delimiter;
	private String delimiters;

	public StringToken(){
		delimiter='\u0000';
		delimiters="";
	}


	public void setString(String string) {
		this.string = string;
	}

	public void setDelimeter(char delimiter){
		this.delimiter = delimiter;
	}

	public void setDelimeters(String delimiters){
		this.delimiters = delimiters;
	}

	public String toTokendString(ArrayList<String> strLst) throws TokenizerException{
		String res="";
		String delim =Character.toString(this.delimiter);
		//try{
			if(delimiters == "") throw new TokenizerException("Please Set the Delimiter");
			for(int i=0; i < strLst.size() - 1; i++)
				res += strLst.get(i)+delim;
			res += strLst.get(strLst.size() - 1);
		//}
		return res;
	}

	public  ArrayList<String>getTheUnion(String string) throws TokenizerException{
		StringTokenizer str1=null,str2=null;
		//Compare two List of strings and get the common string among them.

		//Add iterators and then lambda expressions.
		
		//try{
			ArrayList<String> resString = new ArrayList<>();
			
			if(delimiters == "") throw new TokenizerException("Please Set the Delimiter");
			String s=" "; 
			//String delim =Character.toString(this.delimiter);
			str2 = new StringTokenizer(this.string, delimiters);
			str1 = new StringTokenizer(string, delimiters);
			
			int i =1;
			while(str2.hasMoreTokens()){
				String buff = str2.nextToken();
				StringTokenizer bufferTokens = new StringTokenizer(string, delimiters);
				while(bufferTokens.hasMoreTokens() ){
					s = bufferTokens.nextToken();
					if(buff.equals(s)){
						resString.add(buff);
						break;
					}
				}
			}
		//}
		return resString;
	}

	public ArrayList<String> toList(String string) throws TokenizerException{
		if(delimiters == "") throw new TokenizerException("Please Set the Delimiter");
		StringTokenizer strtok = new StringTokenizer(string,delimiters);
		ArrayList<String> strLst = new ArrayList<>();
		while(strtok.hasMoreTokens())
			strLst.add(strtok.nextToken());
		return strLst;
	}

	public static void main(String[] args){
		/*just a dummy method*/
	}
}