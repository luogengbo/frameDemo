package com.huawei.kanbancontroller.dao.impl;

import org.springframework.stereotype.Repository;

import com.huawei.kanbancontroller.bean.UserBean;
import com.huawei.kanbancontroller.dao.UserDao;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public UserBean getUserByName(String name) {
		UserBean userBean = new UserBean();
		userBean.setId(4566l);
		userBean.setName("my name");
		return userBean;
	}
	
	@Override
	public int insertUser(UserBean user) {
        return 80;
	}

}
