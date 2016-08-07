package com.hoo.service;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import com.hoo.entity.User;
 
/**
 * <b>function:</b> WebService传递复杂对象，如JavaBean、Array、List、Map等
 * @author hoojo
 * @createDate 2011-3-18 上午08:22:55
 * @file ComplexUserService.java
 * @package com.hoo.service
 * @blog http://blog.csdn.net/IBM_hoojo
 * @email hoojo_@126.com
 * @version 1.0
 */
@WebService
@SOAPBinding(style = Style.RPC)
@SuppressWarnings("deprecation")
public class ComplexUserService implements IComplexUserService {
    
    public User getUserByName(@WebParam(name = "name") String name) {
        User user = new User();
        user.setId(new Date().getSeconds());
        user.setName(name);
        user.setAddress("china");
        user.setEmail(name + "@hoo.com");
        return user;
    }
    
    public void setUser(User user) {
        System.out.println("############Server setUser###########");
        System.out.println("setUser:" + user);
    }
}