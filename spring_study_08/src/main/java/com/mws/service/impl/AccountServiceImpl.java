package com.mws.service.impl;

import com.mws.dao.AccountDao;
import com.mws.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    @Transactional
    public int transMoney(int from, int to, int money) {
        int rows = 0;
        rows += accountDao.transMoney(from, -money);
       
        rows += accountDao.transMoney(to, money);

        return rows;
    }
}
