package com.unfbx.test;

import com.unfbx.pojo.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author Grt
 * @Date 2021-06-29
 */
public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");

		System.out.println(applicationContext.getBean("a"));
		B b = applicationContext.getBean(B.class);

		System.out.println(b.getBeanName());
		System.out.println(b.getEnvironment().toString());


	}
}
