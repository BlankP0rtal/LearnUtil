package com.server.domain;

import com.server.reqrespstatus.*;

public class User{
	private String userName;
	private String password;
	/*		
		priv+ate String adminName=" FQ Radmin";
		private String adminPaswrd="admin";
	*/
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
	public Status authenticate(String userName,String password){
		if(this.userName.equals(userName) && this.password.equals(password))
			return this.userName.equals("admin") && this.password.equals("admin") ? Status.FORBIDDEN : Status.OK;
		return Status.BAD;
	}
}











