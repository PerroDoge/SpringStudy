package com.mws.test;

import com.mws.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {

    AccountService accountService;
    @Before
    public void init() {
        accountService = new ClassPathXmlApplicationContext("Spring.xml").getBean(AccountService.class);
    }

    @Test
    public void transMoneyTest() {
        int i = accountService.transMoney(1, 2, 200);
        System.out.println(i);
    }
}
