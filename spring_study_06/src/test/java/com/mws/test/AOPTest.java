package com.mws.test;

import com.mws.dao.UserDao;
import com.mws.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public void getBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        int res = userService.addUser(1, "vhsj");
        System.out.println(res);
    }
}
