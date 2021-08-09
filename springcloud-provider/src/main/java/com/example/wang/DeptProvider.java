package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author wangjun
 * @version 1.0
 * @date 2021/8/9 15:28
 **/
@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.example.wang.*"})
public class DeptProvider {
    public static void main(String[] args){
        SpringApplication.run(DeptProvider.class,args);
    }
}
