package com.lovo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.lovo.bean.UserBean;
import com.lovo.service.IUserService;

import sun.launcher.resources.launcher;

/**
 * 用户页面控制器类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("user/")
public class UserController {
	@Autowired
	private IUserService userService;
	
	private static Logger loger=Logger.getLogger(UserController.class);
	
	@RequestMapping("login")
	public String login(UserBean userBean){
		loger.debug(userBean);
		if (userService.login(userBean)) {
			return "LoginSuccess";
		}
		return "Login";
	}
}
