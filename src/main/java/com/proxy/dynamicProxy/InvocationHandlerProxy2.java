package com.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerProxy2 implements InvocationHandler {
	
	private Object target;

	InvocationHandlerProxy2(Object object) {
		this.target = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("-------- begin ---------");
		Object invoke = method.invoke(target, args);
		System.out.println("-------- end ---------");
		return invoke;
	}
}
