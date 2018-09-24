//Jar file
package com.Jar;

class Display{
	public void display(ArrayList<Object> lst){
		lst.forEach(str -> {
			System.out.println(str);
		});
	}
}


class StringToken{

	private String string;


	public void setString(String string) {
		this.string = string;
	}

	public String toTokendString(ArrayList<String> strLst){
		String res="";
		for(int i=0; i < strLst.size() - 1; i++)
			res += strLst.get(i)+", ";
		res += strLst.get(strLst.size() - 1);
		return res;
	}

	public  ArrayList<String>getTheUnion(String string){
		StringTokenizer str1=null,str2=null;
		//Compare two List of strings and get the common string among them.

		//Add iterators and then lambda expressions.
		
		ArrayList<String> resString = new ArrayList<>();
		
		str2 = new StringTokenizer(this.string, ", ");
		str1 = new StringTokenizer(string, ", ");
		
		int i =1;
		while(str2.hasMoreTokens()){
			String buff = str2.nextToken();
			StringTokenizer bufferTokens = new StringTokenizer(string, ", ");
			while(bufferTokens.hasMoreTokens() ){
				String s = bufferTokens.nextToken();
				if(buff.equals(s)){
					resString.add(buff);
					break;
				}
			}
		}
		return resString;
	}

	public ArrayList<String> toList(String string){
		StringTokenizer strtok = new StringTokenizer(string,", ");
		ArrayList<String> strLst = new ArrayList<>();
		while(strtok.hasMoreTokens())
			strLst.add(strtok.nextToken());
		return strLst;
	}
}