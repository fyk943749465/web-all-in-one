package com.atguigu.maven.service.impl;

import com.atguigu.maven.dao.EmpDao;
import com.atguigu.maven.dao.EmpDaoImpl;
import com.atguigu.maven.entity.Emp;
import com.atguigu.maven.exception.LoginFailedException;
import com.atguigu.maven.service.EmpService;
import com.atguigu.maven.util.ImperialCourtConst;
import com.atguigu.maven.util.MD5Util;

public class EmpServiceImpl implements EmpService {

    private EmpDao empDao = new EmpDaoImpl();

    @Override
    public Emp getEmpByLoginAccount(String loginAccount, String loginPassword) {

        // 1、对密码执行加密
        String encodedLoginPassword = MD5Util.encode(loginPassword);

        // 2、根据账户和加密密码查询数据库
        Emp emp = empDao.selectEmpByLoginAccount(loginAccount, encodedLoginPassword);

        // 3、检查 Emp 对象是否为 null
        if (emp != null) {
            //	①不为 null：返回 Emp
            return emp;
        } else {
            //	②为 null：抛登录失败异常
            throw new LoginFailedException(ImperialCourtConst.LOGIN_FAILED_MESSAGE);
        }
    }
}
