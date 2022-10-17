package com.mws.test;

import com.mws.pojo.User;
import com.mws.service.UserService;
import com.mws.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void testAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
    @Test
    public void testAnnotationOfDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        userService.add();
    }
}
