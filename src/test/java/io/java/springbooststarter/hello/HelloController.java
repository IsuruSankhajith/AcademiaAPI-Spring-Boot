package io.java.springbooststarter.hello;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	public String sayHi() {
		return "Hi";
	}
}
