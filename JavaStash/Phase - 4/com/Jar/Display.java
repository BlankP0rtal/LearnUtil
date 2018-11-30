package com.Jar;

import java.util.*;

public class Display{
	public void display(ArrayList<Object> lst){
		lst.forEach(str -> {
			System.out.println(str);
		});
	}
}