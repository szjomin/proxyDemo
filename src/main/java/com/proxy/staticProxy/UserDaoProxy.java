package com.proxy.staticProxy;

import com.jm.modules.test.service.IUserDao;

public class UserDaoProxy implements IUserDao{
	
	private IUserDao target;
	public UserDaoProxy(IUserDao target){
		this.target = target;
	}
	
	@Override
	public void save() {
		System.out.println("开始事务.....");
		target.save();
		System.out.println("结束事务.....");
		
	}
	

}
