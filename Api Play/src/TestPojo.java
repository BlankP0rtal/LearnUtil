package com.profile.user;

public class TestPojo{
	private Product product;
	public Product getProduct(){
		return this.product;
	}

	public void view(){
		System.out.println(this.product.getPid());
	}
}