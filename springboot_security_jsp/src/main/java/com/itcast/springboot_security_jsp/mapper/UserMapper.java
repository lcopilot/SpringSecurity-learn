package com.itcast.springboot_security_jsp.mapper;

import com.itcast.springboot_security_jsp.domain.SysUser;
import java.util.List;
import javax.annotation.Resource;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/10
 * @time: 16:18
 * @description:
 */
public interface UserMapper extends Mapper<SysUser> {

	@Select("select*from sys_user where username=#{username}")
	@Results({
			@Result(id = true,property = "id",column = "id"),
			@Result(property = "roles",column = "id",javaType = List.class
			,many = @Many(select = "com.itcast.springboot_security_jsp.mapper.RoleMapper.findByUid"))
	})
	public SysUser findByName(String username);

}
