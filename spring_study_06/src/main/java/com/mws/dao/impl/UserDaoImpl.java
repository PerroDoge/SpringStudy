package com.mws.dao.impl;

import com.mws.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(int id, String name) {
        System.out.println(id);
        System.out.println(name);
        System.out.println("UserDaoImpl-----addUser invoked");
        return 1;
    }
}
