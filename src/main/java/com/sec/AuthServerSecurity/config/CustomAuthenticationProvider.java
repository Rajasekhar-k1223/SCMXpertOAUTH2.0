//package com.sec.AuthServerSecurity.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.sec.AuthServerSecurity.entity.User;
//import com.sec.AuthServerSecurity.repo.UserRepository;
//
//@Service
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//
//	@Autowired
//	UserRepository userRepo;
//
//	@Autowired
//	PasswordEncoder encoder;
//
//	@Override
//	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//		String name = authentication.getName();
//		
//		String password = authentication.getCredentials().toString();
//		System.out.println(password);
//
//		if (encoder.matches(password, getUserData(name))) {
//			Authentication auth = new UsernamePasswordAuthenticationToken(name, password);
//			return auth;
//		}
//		return null;
//	}
//
//	@Override
//	public boolean supports(Class<?> authentication) {
//		return authentication.equals(UsernamePasswordAuthenticationToken.class);
//	}
//
//	public String getUserData(String userName) {
//		User us = userRepo.findByEmail(userName);
//		System.out.println(us.getPassword());
//		return us.getPassword();
//	}
//
//}
