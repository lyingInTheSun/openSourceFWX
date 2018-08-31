package com.lovo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lovo.entity.UserEntity;

/**
 * 用户映射器接口
 * @author Administrator
 *
 */
public interface UserMapper extends SqlMapper{
	@Select("select * from t_user where username=#{username} and password=#{password}")
	public UserEntity findUser(@Param("username")String username,@Param("password")String password);
}
