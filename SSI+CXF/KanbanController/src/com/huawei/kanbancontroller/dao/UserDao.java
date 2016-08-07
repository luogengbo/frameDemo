package com.huawei.kanbancontroller.dao;

import com.huawei.kanbancontroller.bean.UserBean;

public interface UserDao {
	public UserBean getUserByName(String name);
	
	public int insertUser(UserBean user);

}
