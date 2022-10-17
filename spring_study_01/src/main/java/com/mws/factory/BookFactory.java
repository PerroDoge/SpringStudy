package com.mws.factory;

import com.mws.pojo.Book;
import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {
    public static Integer count = 0;
    @Override
    public Book getObject() throws Exception {
        count = count + 1;
        System.out.println("GetObject invoked");
        Book book = new Book(count, "JAVA", "Doge");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }
}
