package com.huawei.kanbancontroller.service;

import com.huawei.kanbancontroller.bean.UserBean;

public interface UserService {
	
	public UserBean getUserByName(String name);
	
	public int insertUser(UserBean user);

}
