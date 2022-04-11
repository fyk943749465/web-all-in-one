package com.atguigu.maven.service;

import com.atguigu.maven.entity.Emp;

public interface EmpService {

    Emp getEmpByLoginAccount(String loginAccount, String loginPassword);
}
