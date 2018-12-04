//Files

package com.TryFiles;

import java.io.Files;

enum ResposonseType{
	NOTFOUND,
	ACCESS_PERMISSON_DENIED,
	SUCCESS,
	WARNING
}

enum Mode{
	ENDUSER,
	DEVELOPER,
	INTRA_ORG,
}

//115773733
/*

07 - 23

08 - 21

*/

class DataBaseUtil{
	private Files file;
	private FileInputStream fileInpStream;
	private FileOutputStream fileOutStream;
	private String path;

	public DataBaseUtil(String path) throws Exception{
		if(new =Files(path).exists()){
			this.path=path;
		}
		else throw new Exception("No database found");
	}
	public Data readObject(ApplicationConfigConsts fileName){
		fileInpStream = new FileInputStream();
	}
	public ResposonseType writeObject(Data data,ApplicationConfigConsts fileName){

	}
}

class Data{
	private String data;

	public void setData(String data){
		this.data = data;
	}

	public Data getData(){
		return this.data;
	}
}

class Result{


}

class KnowledgeBase{
	private DataBaseUtil databaseutil;
	private String knowledgeBaseRepo;
	private Data info;

	public void setKnowledgeBaseRepo(String repo){

	}

	public void addKnowledge(){

	}

	public void trainKnowledge(){

	}

	public void loadKnowledge(){

	}

	public Data validateAndFormatQuerry(String query){
		return 
	}

	public Data getKnoledgeResult(){

	}

	public Data clusterKnowledgeForThisType(){
		return data;
	}
	
}

class ApplicationConfigConsts{
	public static final String knowledgeBaseRepo = "/User/arjun-7412/Documents/Code Stash/Learn Util/Java Stash/Phase - 4/Zia Repo/Knowledge Repo/";
	public static final String crawledFile = "Crawled";
	public static final String ErroLogs = "Error Logs"; 
}

class ZiaEngine{

	ZiaEngine(){

	}
	void askZia(String query){

	}
	void resultDisplay(Result result){

	}

}

public class FileTest{
	public static void main(String...params){

	}
}