package com.mws.service;


import com.mws.pojo.Emp;

import java.util.List;

public interface EmpService {
    int findEmpCount();
    Emp findByEmpno(int empno);
    List<Emp> findByDeptno(int deptno);
    int  addEmp(Emp emp);
    int updateEmp(Emp emp);
    int deleteEmp( int empno);
}
