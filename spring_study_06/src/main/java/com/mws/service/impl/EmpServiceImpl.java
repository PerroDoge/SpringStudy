package com.mws.service.impl;

import com.mws.dao.EmpDao;
import com.mws.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpDao empDao;

    @Override
    public int addEmp(int empno, String ename) {
        return empDao.addEmp(empno, ename);
    }
}
