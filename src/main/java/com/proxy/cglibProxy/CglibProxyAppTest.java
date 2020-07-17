package com.proxy.cglibProxy;

import org.junit.Test;

import com.jm.modules.test.service.impl.UserDao;

public class CglibProxyAppTest {

	@Test
	public void test() {
		// 目标对象
		UserDao target = new UserDao();

		// 代理对象
		UserDao proxy = (UserDao) new CglibProxyFactory(target).getProxyInstance();

		// 执行代理对象的方法
		proxy.save();
	}

}
