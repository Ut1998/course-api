package com.cg.springboot.hello;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	Laptop lap;
	
	public void code() {
		lap.compile();
	}

}
