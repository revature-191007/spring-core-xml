package com.revature.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Lifecycle implements BeanNameAware, BeanFactoryAware,
	ApplicationContextAware, InitializingBean, BeanPostProcessor,
	DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After properties set");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Setting application context");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Setting bean factory");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Setting bean name");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre destroy");
	}

	public Lifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void defaultInit() {
		System.out.println("Default init");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean being destroyed");
	}

}
