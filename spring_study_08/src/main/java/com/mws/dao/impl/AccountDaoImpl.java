package com.mws.dao.impl;

import com.mws.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int transMoney(int id, int money) {
        String sql = "UPDATE account SET money = money + ? WHERE id = ?";
        return jdbcTemplate.update(sql, money, id);
    }
}
