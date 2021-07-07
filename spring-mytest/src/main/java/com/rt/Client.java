package com.rt;

import com.rt.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：启动器
 *
 * @author grt
 * @date 2020-05-15
 */
public class Client {
	public static void main(String[] args){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring start");
		MessageService messageService = applicationContext.getBean(MessageService.class);
		System.out.println(messageService);
		messageService.getMessage();
		Object myFactoryBean = applicationContext.getBean("myFactoryBean");
		System.out.println("___________________"+myFactoryBean);
	}
}
