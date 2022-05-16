package com.mannaplanet.demo4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = {"Hello Controller"})
@RestController
public class HelloController {
	@GetMapping("/api/hello")
	public String hello() {
		return "Hello!";
	}

	@GetMapping("/api/hi")
	public String hi() {
		return "Hi~ (2)";
	}
}
