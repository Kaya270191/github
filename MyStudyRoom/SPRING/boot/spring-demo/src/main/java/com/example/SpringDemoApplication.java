package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controller @ResponseBody
@SpringBootApplication // @ComponentScan +@EnableAutoConfiguration
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@GetMapping(value="/") // "/" 경로로 들어오면 아래 함수를 실행
	public String HelloWorld(){
		return "Hello World";
	}
}


