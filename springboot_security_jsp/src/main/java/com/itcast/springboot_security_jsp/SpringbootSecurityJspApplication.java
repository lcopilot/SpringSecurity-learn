package com.itcast.springboot_security_jsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ControllerAdvice;

@SpringBootApplication
@MapperScan("com.itcast.springboot_security_jsp.mapper")
public class SpringbootSecurityJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityJspApplication.class, args);
	}

}
