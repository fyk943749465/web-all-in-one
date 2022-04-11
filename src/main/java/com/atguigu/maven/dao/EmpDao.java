package com.atguigu.maven.dao;

import com.atguigu.maven.entity.Emp;

public interface EmpDao {

    Emp selectEmpByLoginAccount(String loginAccount, String encodedLoginPassword);
}
