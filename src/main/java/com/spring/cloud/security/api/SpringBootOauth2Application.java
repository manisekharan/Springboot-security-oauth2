package com.spring.cloud.security.api;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringBootOauth2Application {
	
	@GetMapping("/")
	public String home(Principal principal) {
		return "Hi "+principal.getName()+", welcome!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauth2Application.class, args);
	}

}
