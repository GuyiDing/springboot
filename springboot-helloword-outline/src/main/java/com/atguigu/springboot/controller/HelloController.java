package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: HelloController
 * @Author LiuXianKun
 * @Date: 2020/9/20 23:49
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "天王盖地虎";
    }

}
