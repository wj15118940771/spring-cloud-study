package com.example.wang.service;

import com.wang.pojo.Dept;

import java.util.List;

/**
 * @author wangjun
 * @version 1.0
 * @date 2021/8/9 15:22
 **/
public interface DeptService {
    public Dept getByID(String id);
    public List<Dept> listDept();
    public Void addDept(Dept dept);
}
