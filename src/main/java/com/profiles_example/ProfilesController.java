package com.profiles_example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProfilesController {
	@Value("${spring.datasource.url}")
	private String dbUrl;
	@GetMapping("/current_profile")
	private String current_profile() {
		return dbUrl;
		
	}
}
