package com.itcast.springboot_security_jsp.mapper;

import com.itcast.springboot_security_jsp.domain.SysRole;
import java.util.List;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @program: spring_security_management
 * @auther: MuGe
 * @date: 2020/1/10
 * @time: 16:18
 * @description:
 */
public interface RoleMapper extends Mapper<SysRole> {

	@Select("SELECT r.id, r.role_name roleName, r.role_desc roleDesc " +
			"FROM sys_role r, sys_user_role ur " +
			"WHERE r.id=ur.rid AND ur.uid=#{uid}")
	public List<SysRole> findByUid(Integer uid);

}
