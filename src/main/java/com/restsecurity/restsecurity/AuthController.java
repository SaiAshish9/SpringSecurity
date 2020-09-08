package com.restsecurity.restsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	
	@GetMapping(path="/")
	public String login() {
		return "hello";
	}
	
}
