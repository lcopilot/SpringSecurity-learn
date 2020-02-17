package com.itcast.test;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/8
 * @time: 17:34
 * @description:
 */
public class EncodingTest {
	//加盐加密
	//123--hfajk    加盐   321muge--jsdfhsk
	//动态加盐
	//$2a$10$lJAivHRBCU9Xbj6LqOLimuO7iDH50YOjfpRAiZy3EvsQS5O.T4u8i
	//$2a$10$E0hXMPtT8su1npqCDWCSr.TKimS62dr988yVdPAbDm/C7bp963.M6
	//$2a$10$HyXroHXhSTQhFPCbisso3e8hbpsh/kftIfnkDAVJC5T9KKA00OsKO
	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("123456"));
		System.out.println(bCryptPasswordEncoder.matches("123456", "$2a$10$lJAivHRBCU9Xbj6LqOLimuO7iDH50YOjfpRAiZy3EvsQS5O.T4u8i"));
	}
}
