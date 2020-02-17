package com.itcast.springboot_security_jsp.config;

import com.itcast.springboot_security_jsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/10
 * @time: 15:31
 * @description:
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SpringSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userService;


	//认证用户的来源
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
	}

	//配置springSecurity相关信息
	public void configure(HttpSecurity http) throws Exception {
		//释放静态资源,指定资源拦截规则,指定自定义认证页面,指定退出认证配置,csrf配置
		http.authorizeRequests()
				.antMatchers("/login.jsp", "/failer.jsp", "/css/**", "/img/**", "/plugins/**")
				.permitAll()
				.antMatchers("/product").hasAnyRole("USER").anyRequest().authenticated().and()
				.formLogin().loginPage("/login.jsp").loginProcessingUrl("/login")
				.successForwardUrl("/index.jsp").failureForwardUrl("/failer.jsp").permitAll().and()
				.logout().logoutSuccessUrl("/login.jsp").logoutUrl("/logout")
				.invalidateHttpSession(true).permitAll().and().csrf().disable();
	}


}


















