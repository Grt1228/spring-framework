package com.rt.dao;

/**
 * 描述：
 *
 * @author grt
 * @date 2020-05-20
 */
public class UserDaoImpl implements  UserDao{

	UserDao userDao;

	@Override
	public void query() {
		System.out.println("user dao");
		userDao.query();
	}
}
