package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/sayHello")
	
	public String sayHello() {
		return "Hello from SPRING!!!";
	}
	
	@GetMapping("/getfruits")
	
	public List<String> fruitList(){
		List<String>fruitList=new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Kiwi");
		fruitList.add("Mango");
		return fruitList;
	}
}
