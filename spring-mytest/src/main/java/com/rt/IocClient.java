package com.rt;

import com.rt.service.UserService;
import com.rt.service.UserServiceImpl;
import com.rt.util.BeanFactory;

/**
 * 描述：
 *
 * @author grt
 * @date 2020-05-20
 */
public class IocClient {

	public static void main(String[] args) {
		BeanFactory beanFactory = new BeanFactory("SPRING.XML");


		UserService userService = (UserService) beanFactory.getBean("userService");
		userService.findUser();
	}
}
