package com.cg.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "HI";
	}
}
