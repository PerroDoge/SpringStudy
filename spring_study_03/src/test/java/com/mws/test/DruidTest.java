package com.mws.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DruidTest {
    @Test
    public void testConnector() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
    }
}
