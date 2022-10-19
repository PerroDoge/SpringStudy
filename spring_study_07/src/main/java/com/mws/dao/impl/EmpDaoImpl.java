package com.mws.dao.impl;

import com.mws.dao.EmpDao;
import com.mws.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDaoImpl implements EmpDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int findEmpCount() {
        String sql = "SELECT count(1) FROM emp";

        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Emp findByEmpno(int empno) {
        String sql = "SELECT * FROM emp WHERE empno = 7369";
        RowMapper<Emp> rowMapper = new DataClassRowMapper<>();

        return jdbcTemplate.queryForObject(sql,rowMapper);
    }

    @Override
    public List<Emp> findByDeptno(int deptno) {
        return null;
    }

    @Override
    public int addEmp(Emp emp) {
        return 0;
    }

    @Override
    public int updateEmp(Emp emp) {
        return 0;
    }

    @Override
    public int deleteEmp(int empno) {
        return 0;
    }
}
