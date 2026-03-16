package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondClass {
@RequestMapping("/firstpage")
public String hello() {
	return "ssecondpage";
}
@RequestMapping("/process")
public String hello2() {
	return "3rd  page";
}
}
