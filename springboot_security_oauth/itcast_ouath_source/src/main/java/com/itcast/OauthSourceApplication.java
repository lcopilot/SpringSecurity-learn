package com.itcast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/11
 * @time: 17:02
 * @description:
 */
@SpringBootApplication
@MapperScan("com.itcast.mapper")
public class OauthSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthSourceApplication.class, args);
	}
}
