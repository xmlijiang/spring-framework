package com.jali;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.lang.NonNull;

/*
 * Aware 感知，Aware有很多实现类，需要什么属性就实现什么接口
 */
public class User implements ApplicationContextAware, EnvironmentAware, BeanNameAware {

	@NonNull
	private String name;

	private ApplicationContext applicationContext;

	private Environment environment;

	private String beanName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void show(){
		System.out.println(this.beanName);
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
}
