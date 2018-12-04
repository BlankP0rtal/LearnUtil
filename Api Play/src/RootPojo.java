//Root Pojo

package com.profile.user;

import java.util.List;

public class RootPojo{
	private List<User> users;

	public RootPojo(List<User> users){
		this.users = users;
	}

	public List<User> getUsers(){
		return this.users;
	}

	public void setUsers(List<User> users){
		this.users = users;
	}

	public void viewData(){
		System.out.println(users.size());
		System.out.println("\nId\tName\temail\taddress-lat-lng\tphone\tcompanyName\n");
		users.forEach(user ->{
			System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getEmail()+"\t"+user.getAddress().getGeo().getLat()+","+user.getAddress().getGeo().getLng()+"\t"+user.getPhone()+"\t"+user.getCompany().getName()+"\n");
		});
	}
}