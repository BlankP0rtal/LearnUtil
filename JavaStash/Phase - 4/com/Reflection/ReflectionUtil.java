//Reflection
package com.Reflection;

import java.util.ArrayList;
import java.lang.reflect.*;

interface ListApiCalls<T>{
	ApiResp addData(T data);
	ApiResp delete(T data);
	ApiResp modify(T modifyingData, T modifiedData);
}

class DataLink<T>{
	T data;
	DataLink<T> next;
}

enum ApiResp{
	NULL,
	INVALID,
	NOTFOUNDHERE,
	SUCCESS
}
/*
	when making a variable thread safe, does that the space optimization is less compared to the no Thread local vars?
	
*/

class JsonList<T> implements ListApiCalls<T>{
	ThreadLocal<DataLink<T>> list = new ThreadLocal<DataLink<T>>();
	private DataLink<T> listData = null;
	private Integer count = 0;
	DataLink<T> temp = null;

	public void updateDataCounter(){
		count++;
	}

	public ApiResp addData(T data) {
		listData = list.get();
		if(listData == null){
			if(data == null)
				return ApiResp.NULL;
			listData = new DataLink<T>();
			//list = new list();
			listData.data = data;
			listData.next = null;
			list.set(listData);
		}
		else{
			temp = new DataLink<T>();
			temp.data = data;
			temp.next = listData;
			listData = temp;
			list.set(listData);
		}
		return ApiResp.SUCCESS;
	}

	private DataLink<T> deleteData(DataLink<T> temp, T data){
		if(temp == null) return null;
		if (temp.data == data) {
			return null;
		}else 
			temp.next = deleteData(temp.next, data);
		return temp;
	}

	private DataLink<T> modifyData(DataLink<T> temp, T modifyingData, T modifiedData){
		if(temp == null) return null;
		if (temp.data == modifyingData) {
			temp.data = modifiedData;
			return temp;
		}else 
			temp.next = modifyData(temp.next, modifyingData, modifiedData);
		return temp;
	}

	public ApiResp delete(T data){
		temp = deleteData(listData,data);
		if(temp == null) return ApiResp.NOTFOUNDHERE;
		listData = temp;
		list.set(listData);
		return ApiResp.SUCCESS;
	}

	public ApiResp modify(T modifyingData, T modifiedData){
		temp = modifyData(listData,modifyingData,modifiedData);
		if(temp == null) return ApiResp.NOTFOUNDHERE;
		listData = temp;
		list.set(listData);
		return ApiResp.SUCCESS;
	}

	public void printList(){
		DataLink<T> temp = list.get();
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}


public class ReflectionUtil{
	public void testReflection(){

	}
	public static void main(String...params)throws ClassNotFoundException, NullPointerException, NoSuchMethodException{
		//JsonList<ReflectionUtil> jsonlst = new JsonList<ReflectionUtil>();
		JsonList<String> strlst = new JsonList<String>();
		//Reflection init
		Class subEntity = strlst.getClass();
		
		Method[] methods = subEntity.getDeclaredMethods();
		System.out.println("Refection topic :....\nClass Name : "+subEntity.getName());
		System.out.println("Methods : ->");
		for(var method : methods)
			System.out.println(method.getName());
		System.out.println("\nExit Reflection\n");



		strlst.addData("Helo");
		strlst.printList();
		System.out.println((strlst.delete("Helo") == ApiResp.NOTFOUNDHERE) ? "Bad Data" : "Cool");
		strlst.printList();


		Method add = subEntity.getMethod("addData",DataLink.class);
		var parameters = add.getParameterTypes();
		for(var parameter : parameters)
			System.out.println(parameter.getName()+" \t "+parameter.getClass().getName());
		//add.invoke(,"random");

	}
}