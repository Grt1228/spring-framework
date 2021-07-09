package com.unfbx.pojo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @Description
 * @Author Grt
 * @Date 2021-06-29
 */
public class B implements BeanNameAware, EnvironmentAware {
	public B() {
		System.out.println("B----------------->CREATED");
	}

	private A a;
	private Environment environment;
	private String beanName;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public String getBeanName() {
		return beanName;
	}
}
