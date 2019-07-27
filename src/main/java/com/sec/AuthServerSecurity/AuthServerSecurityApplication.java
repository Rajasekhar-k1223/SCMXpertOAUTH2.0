package com.sec.AuthServerSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableAuthorizationServer
@SpringBootApplication
@CrossOrigin(origins = {"http://localhost:8081","http://localhost:4200"})
public class AuthServerSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServerSecurityApplication.class, args);
	}

}
