package com.example.wang.service.impl;

import com.example.wang.dao.DeptDao;
import com.wang.pojo.Dept;
import com.example.wang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author wangjun
 * @version 1.0
 * @date 2021/8/9 15:09
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept getByID(String id) {
        return deptDao.getByID(id);
    }

    @Override
    public List<Dept> listDept() {
        return deptDao.listDept();
    }

    @Override
    public Void addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
}
