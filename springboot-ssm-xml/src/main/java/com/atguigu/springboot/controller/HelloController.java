package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.TMenu;
import com.atguigu.springboot.mapper.TMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @title: HelloController
 * @Author LiuXianKun
 * @Date: 2020/9/21 19:16
 */
@RestController
public class HelloController {
    @Autowired
    TMenuMapper menuMapper;

    @Autowired
    DataSource dataSource;  //默认使用HikariDataSource

    @GetMapping("/getMenus")
    public List<TMenu> getMenus() {
        System.out.println("dataSource = " + dataSource.getClass().getName());
        return menuMapper.selectByExample(null);
    }

}
