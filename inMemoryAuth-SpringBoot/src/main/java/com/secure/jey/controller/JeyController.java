package com.secure.jey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jey")
public class JeyController {
	
	
	@GetMapping("/admin/{name}")
	public String secure(@PathVariable String name) {
		System.out.println(name +"trying ...");
		return "secured " + name;
	}
	
	@GetMapping("/guest/{name}")
	public String guest(@PathVariable String name) {
		
		return "welcome to guest app " +name;
	}

}
