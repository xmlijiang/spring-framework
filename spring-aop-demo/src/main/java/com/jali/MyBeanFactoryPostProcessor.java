package com.jali;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user222");
		System.out.println(beanDefinition.getPropertyValues());
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		for (PropertyValue propertyValue : propertyValues) {
			String name = propertyValue.getName();
			propertyValues.get(name);
			propertyValue.setAttribute(name, "lisi");
			System.out.println(propertyValues.get(name));
		}
		beanDefinition.setScope("prototype");
		System.out.println("设置beanDefinition");
	}
}
