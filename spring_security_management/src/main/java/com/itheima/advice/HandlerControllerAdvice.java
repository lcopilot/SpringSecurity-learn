package com.itheima.advice;



import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/9
 * @time: 13:59
 * @description:
 */

@ControllerAdvice
public class HandlerControllerAdvice {

	//只有出现AccessDeniedException异常才调转403.jsp页面
	@ExceptionHandler(AccessDeniedException.class)
	public String exceptionAdvice() {
		return "forward:/403.jsp";
	}

}
