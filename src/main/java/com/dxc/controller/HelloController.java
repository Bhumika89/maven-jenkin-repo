package com.dxc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
@GetMapping("/hello")
public String hello()
{
	return "Welcome to  RestFull  webservices";
	
}

@GetMapping("/hello/{name}")
public String Display(@PathVariable  String name)
{
	return" Welcome" + " " +name ;
	
}
	
}
