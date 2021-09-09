package com.jali;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {

	/*
		什么时候调用这个getObject方法
		在调用context.getBean的时候，懒加载
	*/
	@Override
	public User getObject() throws Exception {
		System.out.println("UserFactoryBean getObject方法 。。。。。");
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
