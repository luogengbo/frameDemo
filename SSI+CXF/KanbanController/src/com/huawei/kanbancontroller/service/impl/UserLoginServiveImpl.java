package com.huawei.kanbancontroller.service.impl;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.huawei.kanbancontroller.bean.UserBean;
import com.huawei.kanbancontroller.service.UserLoginServiceI;
import com.huawei.kanbancontroller.service.UserService;

@WebService
public class UserLoginServiveImpl implements UserLoginServiceI {
	@Autowired
    private UserService userService;

    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    @Override
    public UserBean userLogin(String userName) {
        return userService.getUserByName("luogengbo");
    }
}
