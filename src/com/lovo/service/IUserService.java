package com.lovo.service;

import com.lovo.bean.UserBean;

/**
 * 用户业务逻辑接口
 * @author Administrator
 *
 */
public interface IUserService {
	/**
	 * 登录
	 * @param userBean 用户Bean
	 * @return 是否登录成功
	 */
	public boolean login(UserBean userBean);
}
