package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
	
	@RequestMapping()
	public String Hello() {
		
		return "Hello World";
	}
	
	public void save() {
		System.out.println("save");
	}
	public void update() {
		System.out.println("update");
	}
	
	

}
