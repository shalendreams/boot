package com.springboot.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.modules.service.HelloService;

@RestController  
public class HomeController {  

	@Autowired
	HelloService helloService;
	
    @RequestMapping("/hello")  
    public String hello(){  
    	helloService.doit();
        return"Hello!";  
    }  
}  
