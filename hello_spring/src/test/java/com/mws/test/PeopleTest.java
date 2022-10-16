package com.mws.test;

import com.mws.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleTest {
    @Test
    public void testPeople() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
    }
}
