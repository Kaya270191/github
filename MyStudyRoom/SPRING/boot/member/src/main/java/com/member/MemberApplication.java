package com.member;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}

	@GetMapping(value="/")
	public String HelloWorld(){
		return "yaho";
	}

	@GetMapping(value="/kaya/yaya")
	public String HelloKaya(){
		return "kaya hi";
	}


}
