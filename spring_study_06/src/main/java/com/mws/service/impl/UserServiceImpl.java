package com.mws.service.impl;

import com.mws.dao.UserDao;
import com.mws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int addUser(int id, String name) {
        System.out.println("UserServiceImpl----addUser invoked");
        return userDao.addUser(id, name);
    }
}
