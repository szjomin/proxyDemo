package com.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

import com.jm.modules.test.service.IUserDao;
import com.jm.modules.test.service.impl.UserDao;


public class DynamicProxyAppTest2 {
	 public static void main(String[] args) {
		 	IUserDao userDao = new UserDao();
		 	InvocationHandlerProxy2 invocationHandler = new InvocationHandlerProxy2(userDao);
		 	IUserDao userDaoProxy = (IUserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), invocationHandler);
		 	userDaoProxy.save();
	    }
}
