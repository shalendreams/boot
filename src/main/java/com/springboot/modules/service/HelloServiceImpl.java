package com.springboot.modules.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.modules.model.Hello;
import com.springboot.modules.repository.HelloRepository;

@Service("helloService")
public class HelloServiceImpl implements HelloService{
	
	@Autowired
	HelloRepository helloRepository;
	
	public String doit(){
		System.out.print('c');
		List<Hello> hellos=helloRepository.findById(1);
		return null;
	}
}
