package com.bru.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcomecontroller {

	@RequestMapping("/1")
	public String hel() {

		return "index";

	}
	
	@RequestMapping("/kk")
	public String helw() {

		return "kk";
	}
	// end class
}
