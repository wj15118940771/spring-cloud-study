package com.example.wang.dao;

import com.wang.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangjun
 * @version 1.0
 * @date 2021/8/9 14:54
 **/
@Mapper
@Repository
public interface DeptDao {

    public Dept getByID(String id);
    public List<Dept> listDept();
    public Void addDept(Dept dept);
}
