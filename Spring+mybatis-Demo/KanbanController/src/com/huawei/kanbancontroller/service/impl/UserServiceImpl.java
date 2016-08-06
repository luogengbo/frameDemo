package com.huawei.kanbancontroller.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.huawei.kanbancontroller.bean.UserBean;
import com.huawei.kanbancontroller.dao.UserDao;
import com.huawei.kanbancontroller.service.UserService;

public class UserServiceImpl implements UserService {
	
	private Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired    
    private UserDao userDao;

	@Override
	public UserBean getUserByName(String name) {
		// TODO Auto-generated method stub
		logger.info("start **********************");
		return userDao.getUserByName(name);
	}

	@Override
	public int insertUser(UserBean user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
