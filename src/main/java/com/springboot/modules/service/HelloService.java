package com.springboot.modules.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {
	public void doit(){
		System.out.print('c');
	}
}
