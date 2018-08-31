package com.lovo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lovo.dao.IUserDao;
import com.lovo.entity.UserEntity;

/**
 * UserDao单元测试类
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/applicationContext.xml"})
public class UserDaoTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	@Autowired
	private IUserDao userDao;
	@Test
	public void userDaoTest(){
		UserEntity userEntity=userDao.queryUser("李四", "2344");
		
		//断言
		Assert.assertNotNull(userEntity);
	}
	
}
