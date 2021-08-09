package com.example.wang.controller;

import com.wang.pojo.Dept;
import com.example.wang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangjun
 * @version 1.0
 * @date 2021/8/9 15:25
 **/
@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public List<Dept> listDept(){
        return deptService.listDept();
    }

}
