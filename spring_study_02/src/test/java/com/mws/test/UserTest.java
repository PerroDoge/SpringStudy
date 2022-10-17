package com.mws.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testLifeCycle() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Object user = context.getBean("user");

    }
}
