package com.mws.test;

import com.mws.factory.BookFactory;
import com.mws.pojo.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookFactoryTest {

    @Test
    public void testFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Book book = context.getBean("bookFactory", Book.class);

        System.out.println(book);
        Book book2 = context.getBean("bookFactory", Book.class);
        System.out.println(book2);
    }
}
