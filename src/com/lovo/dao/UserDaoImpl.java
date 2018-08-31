package com.lovo.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lovo.controller.UserController;
import com.lovo.entity.UserEntity;
import com.lovo.mapper.UserMapper;

/**
 * 用户Dao实现类
 * @author Administrator
 *
 */
@Component
public class UserDaoImpl implements IUserDao{
	
	@Autowired
	private UserMapper userMapper;
	
	private static Logger loger=Logger.getLogger(UserController.class);
	
	@Override
	public UserEntity queryUser(String name, String password) {
		UserEntity userEntity=userMapper.findUser(name, password);
		
		loger.debug(userEntity);
		
		return userEntity;
	}

}
