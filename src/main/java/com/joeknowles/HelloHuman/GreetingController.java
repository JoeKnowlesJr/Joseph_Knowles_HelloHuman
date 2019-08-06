package com.joeknowles.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/")
	public String greet(@RequestParam(value="firstname", required=false) String firstName, @RequestParam(value="lastname", required=false) String lastName) {
		if (firstName == null) return "Hello Human!\r\n\r\nWelcome to Spring Boot!";
		if (lastName == null) return "Hello, " + firstName + "!";
		return "Hello, " + firstName + " " + lastName + "!";
	}
}
