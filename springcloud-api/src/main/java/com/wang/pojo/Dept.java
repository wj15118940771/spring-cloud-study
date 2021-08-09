package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wangjun
 * @version 1.0
 * @date 2021/8/9 10:28
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
    private String id;
    private String dname;
    private String de_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
