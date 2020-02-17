package com.itcast.springboot_security_jsp.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/10
 * @time: 15:03
 * @description:
 */
@Controller
@RequestMapping("/product")
public class ProductController {

	@Secured("ROLE_PRODUCT")
	@RequestMapping("/findAll")
	public String findAll() {
		return "product-list";
	}
}
