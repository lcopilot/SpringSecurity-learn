package com.itcast.springboot_security_jsp.service.impl;

import com.itcast.springboot_security_jsp.mapper.UserMapper;
import com.itcast.springboot_security_jsp.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Transient;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/10
 * @time: 16:33
 * @description:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		return userMapper.findByName(s);
	}
}
