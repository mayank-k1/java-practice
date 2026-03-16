package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hellocontroller {

	@RequestMapping("hello") //used to request particular web page
	public ModelAndView hello()
	{
		ModelAndView view= new ModelAndView("hellopage"); // pass same name to create jspFile
		view.addObject("hi","second mvc application"); // data is in the form key and value
		return view;
	}
}
