package com.lovo.dao;

import com.lovo.entity.UserEntity;

/**
 * 用户Dao接口
 * @author Administrator
 *
 */
public interface IUserDao {
	/**
	 * 查询用户
	 * @param name 用户名
	 * @param password 密码
	 * @return 用户实体类
	 */
	public UserEntity queryUser(String name,String password);
}
