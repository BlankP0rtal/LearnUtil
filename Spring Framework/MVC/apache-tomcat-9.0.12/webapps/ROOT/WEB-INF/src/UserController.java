package com.springmvcutil.controller;

import com.springmvcutil.beans.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
//ResponseBody
public class UserController{
   private User user=null;
	@RequestMapping(value="/random",method=RequestMethod.GET, produces="application/json")
	public User testController(/*@PathVariable String name*/){
		System.out.println("Controller is called ->");
      User user = new User();
      user.setUserName("random");
      user.setPassword("flix-k!ll");
		return user;
	}
}