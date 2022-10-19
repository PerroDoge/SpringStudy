package com.mws.test;

import com.mws.pojo.Emp;
import com.mws.service.EmpService;
import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
    private EmpService empService;
    @Before
    public void init() {
        empService = new ClassPathXmlApplicationContext("Spring.xml").getBean(EmpService.class);
    }
    @Test
    public void findEmpCountTest() {
        int count = empService.findEmpCount();
        System.out.println(count);
    }
    @Test
    public void findEmpByEmpnoTest() {
        Emp emp = empService.findByEmpno(7369);
        System.out.println(emp);
    }
}
