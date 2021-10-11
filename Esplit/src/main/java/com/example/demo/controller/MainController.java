package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.LoginUser;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView home(ModelAndView modelAndView)
	{  
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@RequestMapping("/started")
	public ModelAndView started(ModelAndView modelAndView)
	{  
		modelAndView.setViewName("Addgroup");
		return modelAndView;
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView login(ModelAndView modelAndView)
	{  
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	
	@RequestMapping("/grouplist")
	public ModelAndView grouplist(ModelAndView modelAndView)
	{  
		modelAndView.setViewName("viewGroupList");
		return modelAndView;
	}
	
	
	
}

