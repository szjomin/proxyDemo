package com.proxy.dynamicProxy;

import com.jm.modules.test.service.IUserDao;
import com.jm.modules.test.service.impl.UserDao;

public class DynamicProxyAppTest {
	 public static void main(String[] args) {
	        // 目标对象
	        IUserDao target = new UserDao();

	        System.out.println(target.getClass());

	        // 给目标对象，创建代理对象
	        IUserDao proxy = (IUserDao) new InvocationHandlerProxy(target).getProxyInstance();
	        
	        // class $Proxy0   内存中动态生成的代理对象
	        System.out.println(proxy.getClass());

	        // 执行方法   【代理对象】
	        proxy.save();
	    }
}
