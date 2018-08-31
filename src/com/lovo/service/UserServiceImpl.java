package com.lovo.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lovo.bean.UserBean;
import com.lovo.controller.UserController;
import com.lovo.dao.IUserDao;
import com.lovo.entity.UserEntity;

/**
 * 用户业务逻辑实现类
 * @author Administrator
 *
 */
@Component
@Transactional //申请式事务管理
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao userDao;

	private static Logger loger=Logger.getLogger(UserController.class);
	
	@Override
	public boolean login(UserBean userBean) {
		UserEntity userEntity=userDao.queryUser(userBean.getUsername(), userBean.getPassword());
		loger.debug(userBean);
		if (userEntity!=null) {
			return true;
		}
		return false;
	}
}
