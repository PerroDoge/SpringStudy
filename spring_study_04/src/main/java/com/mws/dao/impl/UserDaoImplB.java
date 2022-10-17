package com.mws.dao.impl;

import com.mws.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImplB implements UserDao {
    @Override
    public void add() {
        System.out.println("this is UserDaoImplB");
    }
}
