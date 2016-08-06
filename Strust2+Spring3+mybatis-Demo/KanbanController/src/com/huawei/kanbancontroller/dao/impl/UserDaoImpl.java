package com.huawei.kanbancontroller.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.huawei.kanbancontroller.bean.UserBean;
import com.huawei.kanbancontroller.dao.UserDao;

@Repository(value = "userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public UserBean getUserByName(String name) {
        // select语句，传入一个参数，返回User对象  -------------------------------------------------------------------------    
		return getSqlSession().selectOne("UserMapper.getUserByName", name);
	}
	
	@Override
	public int insertUser(UserBean user) {
        return getSqlSession().insert("UserMapper.insertUser",user);
	}

}
