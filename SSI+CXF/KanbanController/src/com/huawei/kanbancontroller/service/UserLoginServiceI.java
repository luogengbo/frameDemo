package com.huawei.kanbancontroller.service;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.huawei.kanbancontroller.bean.UserBean;
@WebService
public interface UserLoginServiceI {

    @WebMethod
    public UserBean userLogin(@WebParam(name="userName") String userName);
}
