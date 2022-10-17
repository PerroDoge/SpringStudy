package com.mws.service.impl;

import com.mws.dao.UserDao;
import com.mws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDaoImplB")
    private UserDao userdao;

    @Override
    public void add() {
        System.out.println("this is UserServiceImpl");
        userdao.add();
    }
}
