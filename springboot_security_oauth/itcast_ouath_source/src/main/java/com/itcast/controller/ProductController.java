package com.itcast.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/11
 * @time: 17:05
 * @description:
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/findAll")
	public String findAll(){
		return "产品列表查询成功!";
	}

}
